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
 * @author Guillermo Grande & Vincent Pérez
 */
public class ProductorEnsamblador extends Thread 
{ 
    // Neumaticos
    private Almacen almacenNeumaticos;
    private Semaphore sExclusividadNeumaticos; 
    private Semaphore sConsumirNeumaticos;
    private Semaphore sProducirNeumaticos;
    
    // Bujes
    private Almacen almacenBujes;
    private Semaphore sExclusividadBujes;
    private Semaphore sConsumirBujes;
    private Semaphore sProducirBujes;
    
    // Ruedas
    private String producto;
    private Almacen almacenRuedas;
    private Semaphore sExclusividadRuedas;
    private Semaphore sConsumirRuedas;
    private Semaphore sProducirRuedas;
    
    private int tiempoEnsamblaje;
    private Semaphore sInterfaz;

    private boolean activo;
    private boolean flag;

    public ProductorEnsamblador(Almacen almacenNeumaticos, Semaphore sExclusividadNeumaticos, 
            Semaphore sConsumirNeumaticos, Semaphore sProducirNeumaticos, Almacen almacenBujes,
            Semaphore sExclusividadBujes, Semaphore sConsumirBujes, Semaphore sProducirBujes, 
            String producto, Almacen almacenRuedas, Semaphore sExclusividadRuedas,
            Semaphore sConsumirRuedas, Semaphore sProducirRuedas, int tiempoEnsamblaje,
            Semaphore sInterfaz)
    { 
        this.almacenNeumaticos = almacenNeumaticos;
        this.sExclusividadNeumaticos = sExclusividadNeumaticos;
        this.sConsumirNeumaticos = sConsumirNeumaticos;
        this.sProducirNeumaticos = sProducirNeumaticos;
        
        this.almacenBujes = almacenBujes;
        this.sExclusividadBujes = sExclusividadBujes;
        this.sConsumirBujes = sConsumirBujes;
        this.sProducirBujes = sProducirBujes;
        
        this.producto = producto;
        this.almacenRuedas = almacenRuedas;
        this.sExclusividadRuedas = sExclusividadRuedas;
        this.sConsumirRuedas = sConsumirRuedas;
        this.sProducirRuedas = sProducirRuedas;
        
        this.tiempoEnsamblaje = tiempoEnsamblaje;
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
        while(activo)
        {
            if (flag) 
            {
                try
                {
                    // Hay espacio para producir ruedas?
                    sProducirRuedas.acquire();

                    // Existen neumaticos para consumir?
                    sConsumirNeumaticos.acquire();

                    /**
                     * Inicia seccion critica 1
                     * Se comparte buffer de neumaticos
                     */
                    //Solicito exclusividad al almacen de neumaticos
                    sExclusividadNeumaticos.acquire();
                    // Extrae neumatico
                    almacenNeumaticos.sacarAlmacen(1);
                    // Suelta la exclusividad del almacen de nuematicos
                    sExclusividadNeumaticos.release();
                    /**
                     * Finaliza seccion critica 1
                     */
                    // Hay nuevo espacio para producir neumatico
                    sProducirNeumaticos.release();


                    // Existen bujes para consumir?
                    sConsumirBujes.acquire();

                    /**
                     * Inicia seccion critica 2
                     * Se comparte buffer de bujes
                     */
                    //Solicito exclusividad al almacen de bujes
                    sExclusividadBujes.acquire();
                    // Extrae buje
                    almacenBujes.sacarAlmacen(1);
                    // Suelta la exclusividad del almacen de bujes
                    sExclusividadBujes.release();
                    /**
                     * Finaliza seccion critica 2
                     */
                    // Hay nuevo espacio para producir buje
                    sProducirBujes.release();
                    //System.out.println("Consumi buje");


                    // Produce rueda
                    this.sleep(tiempoEnsamblaje);


                    /**
                      * Inicia seccion critica 3
                      * Se comparte buffer de ruedas
                      */
                    // Solicita acceso exclusivo al almacen de ruedas
                    sExclusividadRuedas.acquire();
                    almacenRuedas.agregarAlmacen();
                    //System.out.println("Se produjo: "+producto);
                    sExclusividadRuedas.release();
                    /**
                      * Finaliza seccion critica 3
                      */
                    // Existe rueda para consumir
                    sConsumirRuedas.release();
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
                    almacenNeumaticos.contarAlmacen();
                    almacenBujes.contarAlmacen();
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
