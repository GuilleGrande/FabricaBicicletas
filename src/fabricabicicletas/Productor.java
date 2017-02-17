/*
 * The MIT License
 *
 * Copyright 2017 Guillermo Grande & Vincent Pérez.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package fabricabicicletas;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guillermo Grande & Vincent Pérez.
 */
public class Productor extends Thread
{
    private String producto;
    private Almacen almacen;
    private Semaphore sExclusividad;
    private Semaphore sConsumir;
    private Semaphore sProducir;
    private Semaphore sInterfaz;
    private int tiempoProduccion;
    private boolean activo;
    private boolean flag;

    /**
     * Constructor de productores.
     * @param producto
     * @param almacen
     * @param sExclusividad
     * @param sConsumir
     * @param sProducir
     * @param tiempoProduccion 
     */
    public Productor(String producto, Almacen almacen, Semaphore sExclusividad, 
            Semaphore sConsumir, Semaphore sProducir, int tiempoProduccion, Semaphore sInterfaz) 
    {
        this.producto = producto;
        this.almacen = almacen;
        this.sExclusividad = sExclusividad;
        this.sConsumir = sConsumir;
        this.sProducir = sProducir;
        this.tiempoProduccion = tiempoProduccion;
        this.sInterfaz = sInterfaz;
        this.activo = true;
        this.flag = true;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    @Override
    public void run()
    { 
       while (activo)
       {
           if (flag) 
           {
                try 
                {
                    // Produce
                    this.sleep(tiempoProduccion);

                    // Hay espacio para producir?
                    sProducir.acquire();

                    /**
                     * Inicia seccion critica
                     */
                    // Solicita almacen en exclusividad
                    sExclusividad.acquire();
                    // Modifica espacio de almacen
                    almacen.agregarAlmacen();
                    // Devuelve exclusividad del almacen
                    sExclusividad.release();
                    /**
                     * Finaliza seccion critica
                     */
                    // Informa que se puede consumir
                    sConsumir.release();  
                }
                catch(InterruptedException ex)
                {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
                try
                {
                    sInterfaz.acquire();
                    almacen.contarAlmacen();
                    sInterfaz.release();
                }
                catch(InterruptedException ex)
                {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           else
           {
                try
                {
                    this.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e.getMessage());
                } 
           }
       }
    }
    
}
