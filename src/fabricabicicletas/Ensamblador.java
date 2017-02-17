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
public class Ensamblador extends Thread
{
    // Ruedas
    private Almacen almacenRuedas;
    private Semaphore sExclusividadRuedas;
    private Semaphore sConsumirRuedas;
    private Semaphore sProducirRuedas;
    
    // Marcos
    private Almacen almacenMarcos;
    private Semaphore sExclusividadMarcos;
    private Semaphore sConsumirMarcos;
    private Semaphore sProducirMarcos;
    
    // Ensamblaje original
    private Almacen almacenProducto;
    private Semaphore sExclusividad;
    private Semaphore sProducir;
    
    // Ensamblaje complemento
    private Almacen almacenAux;  
    private Semaphore sExclusividadAux;
    private Semaphore sProducirAux;
    
    private String producto;
    private int tiempoEnsamblaje;
    private Semaphore sInterfaz;
    private int numRuedas;
    private boolean activo;
    private boolean flag;
    
    /**
     * Constructor de ensambladores.
     * @param almacenRuedas
     * @param sExclusividadRuedas
     * @param sConsumirRuedas
     * @param sProducirRuedas
     * @param almacenMarcos
     * @param sExclusividadMarcos
     * @param sConsumirMarcos
     * @param sProducirMarcos
     * @param almacenProducto
     * @param sExclusividad
     * @param sProducir
     * @param almacenAux
     * @param sExclusividadAux
     * @param sProducirAux
     * @param producto
     * @param tiempoEnsamblaje
     * @param numRuedas 
     */
    public Ensamblador( Almacen almacenRuedas, Semaphore sExclusividadRuedas,
            Semaphore sConsumirRuedas, Semaphore sProducirRuedas, Almacen almacenMarcos,
            Semaphore sExclusividadMarcos, Semaphore sConsumirMarcos, Semaphore sProducirMarcos,
            Almacen almacenProducto, Semaphore sExclusividad, Semaphore sProducir,
            Almacen almacenAux, Semaphore sExclusividadAux, Semaphore sProducirAux,
            String producto, int tiempoEnsamblaje, int numRuedas, Semaphore sInterfaz)
    {
        this.almacenRuedas = almacenRuedas;
        this.sExclusividadRuedas = sExclusividadRuedas;
        this.sConsumirRuedas = sConsumirRuedas;
        this.sProducirRuedas = sProducirRuedas;
        
        this.almacenMarcos = almacenMarcos;
        this.sExclusividadMarcos = sExclusividadMarcos;
        this.sConsumirMarcos = sConsumirMarcos;
        this.sProducirMarcos = sProducirMarcos;
        
        this.almacenProducto = almacenProducto;
        this.sExclusividad = sExclusividad;
        this.sProducir = sProducir;
        
        this.almacenAux = almacenAux;
        this.sExclusividadAux = sExclusividadAux;
        this.sProducirAux = sProducirAux;
        
        this.producto = producto;
        this.tiempoEnsamblaje = tiempoEnsamblaje;
        this.sInterfaz = sInterfaz;
        this.numRuedas = numRuedas;
        
        this.activo = true;
        this.flag = true;
    }

    public String getProducto() {
        return producto;
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
       while(activo)
       {
           /**
            * Flag para pausar o reanudar ensamblaje.
            */
           if (flag) 
           {
                try
                { 
                    /**
                     * Verifico si esta completo el pedido del producto original y si
                     * faltan pedidos por completar del producto complemento. En caso
                     * afirmativo, pasa a producir producto complemento.
                     */
                    if (sProducir.availablePermits() == 0 && sProducirAux.availablePermits() > 0)
                    {
                        
                        almacenProducto = almacenAux;
                        sProducir = sProducirAux;
                        sExclusividad = sExclusividadAux;
                        if(producto.equals("bicicletas"))
                        {
                            numRuedas = 3; 
                            producto = "triciclos*";
                        }
                        else if(producto.equals("triciclos"))
                        {
                            numRuedas = 2;
                            producto = "bicicletas*";
                        } 
                    }

                    // Hay pedido que completar?
                    sProducir.acquire();

                    /**
                     * Consumo ruedas para ensamblaje
                     */
                    // Hay 2 ruedas para consumir?
                    sConsumirRuedas.acquire(numRuedas);
                    // INICIA SECCION CRITITCA
                    // Solicito acceso exclusivo al almacen de ruedas
                    sExclusividadRuedas.acquire();
                    //Extrae 2 ruedas
                    almacenRuedas.sacarAlmacen(numRuedas);
                    // Suelto acceseo exclusivo al almacen de ruedas
                    sExclusividadRuedas.release();
                    // FINALIZA SECCION CRITICA
                    // Hay dos espacio para producir ruedas
                    sProducirRuedas.release(numRuedas);

                    /**
                     * Consumo marco para ensamblaje
                     */
                    // Hay marcos para consumir?
                    sConsumirMarcos.acquire();
                    // Solicito acceso exclusivo al almacen de marcos
                    // INICIA SECCION CRITICA
                    sExclusividadMarcos.acquire();
                    // Modifico almacen de marcos
                    almacenMarcos.sacarAlmacen(1);
                    // Suelto acceso exclusivo al almacen de marcos
                    sExclusividadMarcos.release();
                    // FINALIZA SECCION CRITICA
                    // Hay espacio nuevo para producir marcos
                    sProducirMarcos.release();

                    /**
                     * Ensamblaje de producto
                     */
                    // Tiempo que tardo ensamblando
                    this.sleep(tiempoEnsamblaje);
                    sExclusividad.acquire();
                    almacenProducto.agregarAlmacen();
                    System.out.println("Se produjo: "+producto);
                    sExclusividad.release();
                    
                    /**
                     * Si esta completo el pedido de ambos productos, el hilo de
                     * ensamblaje termina su corrida.
                     */
                    if (sProducir.availablePermits() == 0 && sProducirAux.availablePermits() == 0) 
                    {
                        activo = false;
                    }
                }
                catch(InterruptedException ex)
                {
                   Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex); 
                }
                
                /**
                 * Sección de codigo para modificar etiquetas de interfaz.
                 */
                try
                {
                    sInterfaz.acquire();
                    almacenRuedas.contarAlmacen();
                    almacenMarcos.contarAlmacen();
                    almacenProducto.contarAlmacen();
                    sInterfaz.release();
                }
                catch(InterruptedException ex)
                {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           else
           {
               /**
                * Mientras flag = false el ensambldor espera.
                */
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
