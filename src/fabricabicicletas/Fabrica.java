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
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Guillermo Grande & Vincent Pérez.
 */
public class Fabrica {

    // Producción neumaticos
    private Productor[] vecProductoresNeumaticos;
    private Almacen almacenNeumaticos;
    private Semaphore sExclusividadNeumaticos;
    private Semaphore sConsumirNeumaticos;
    private Semaphore sProducirNeumaticos;

    // Producción bujes
    private Productor[] vecProductoresBujes;
    private Almacen almacenBujes;
    private Semaphore sExclusividadBujes;
    private Semaphore sConsumirBujes;
    private Semaphore sProducirBujes;

    // Producción ruedas
    private ProductorEnsamblador[] vecProductoresRuedas;
    private Almacen almacenRuedas;
    private Semaphore sExclusividadRuedas;
    private Semaphore sConsumirRuedas;
    private Semaphore sProducirRuedas;

    // Producción marcos
    private Productor[] vecProductoresMarcos;
    private Almacen almacenMarcos;
    private Semaphore sExclusividadMarcos;
    private Semaphore sConsumirMarcos;
    private Semaphore sProducirMarcos;

    // Ensamblaje bicicletas
    private Ensamblador[] vecEnsambladoresBici;
    private Almacen almacenBici;
    private Semaphore sExclusividadBici;
    private Semaphore sConsumirBici;
    private Semaphore sProducirBici;

    //Ensamblaje triciclos
    private Ensamblador[] vecEnsambladoresTrici;
    private Almacen almacenTrici;
    private Semaphore sExclusividadTrici;
    private Semaphore sConsumirTrici;
    private Semaphore sProducirTrici;

    int duracionDia;
    
    JLabel inAlmacenNeum;

    private Semaphore sInterfaz;

    /**
     * Constructor de fabrica.
     * @param vec
     */
    public Fabrica(int[] vec, JLabel inAlmacenNeum, JLabel inAlmacenBujes, JLabel inAlmacenRuedas, 
            JLabel inAlmacenMarcos, JLabel readyBic, JLabel readyTric) 
    {
        duracionDia = vec[0];

        vecProductoresNeumaticos = new Productor[vec[11]];
        almacenNeumaticos = new Almacen(vec[3], inAlmacenNeum);
        sExclusividadNeumaticos = new Semaphore(1);
        sConsumirNeumaticos = new Semaphore(0);
        sProducirNeumaticos = new Semaphore(vec[3]);

        vecProductoresBujes = new Productor[vec[12]];
        almacenBujes = new Almacen(vec[4],inAlmacenBujes);
        sExclusividadBujes = new Semaphore(1);
        sConsumirBujes = new Semaphore(0);
        sProducirBujes = new Semaphore(vec[4]);

        vecProductoresRuedas = new ProductorEnsamblador[vec[13]];
        almacenRuedas = new Almacen(vec[5], inAlmacenRuedas);
        sExclusividadRuedas = new Semaphore(1);
        sConsumirRuedas = new Semaphore(0);
        sProducirRuedas = new Semaphore(vec[5]);

        vecProductoresMarcos = new Productor[vec[14]];
        almacenMarcos = new Almacen(vec[6], inAlmacenMarcos);
        sExclusividadMarcos = new Semaphore(1);
        sConsumirMarcos = new Semaphore(0);
        sProducirMarcos = new Semaphore(vec[6]);

        vecEnsambladoresBici = new Ensamblador[vec[17]];
        almacenBici = new Almacen(vec[1], readyBic);
        sExclusividadBici = new Semaphore(1);
        sConsumirBici = new Semaphore(0);
        sProducirBici = new Semaphore(vec[1]);

        vecEnsambladoresTrici = new Ensamblador[vec[18]];
        almacenTrici = new Almacen(vec[2], readyTric);
        sExclusividadTrici = new Semaphore(1);
        sConsumirTrici = new Semaphore(0);
        sProducirTrici = new Semaphore(vec[2]);

        sInterfaz = new Semaphore(1); 
    }

    public Almacen getAlmacenBici() {
        return almacenBici;
    }

    public Almacen getAlmacenTrici() {
        return almacenTrici;
    }

    public Productor[] getVecProductoresNeumaticos() 
    {
        return vecProductoresNeumaticos;
    }

    public void setVecProductoresNeumaticos(Productor[] vecProductoresNeumaticos) 
    {
        this.vecProductoresNeumaticos = vecProductoresNeumaticos;
    }

    public Productor[] getVecProductoresBujes() 
    {
        return vecProductoresBujes;
    }

    public void setVecProductoresBujes(Productor[] vecProductoresBujes) 
    {
        this.vecProductoresBujes = vecProductoresBujes;
    }

    public ProductorEnsamblador[] getVecProductoresRuedas() 
    {
        return vecProductoresRuedas;
    }

    public void setVecProductoresRuedas(ProductorEnsamblador[] vecProductoresRuedas) 
    {
        this.vecProductoresRuedas = vecProductoresRuedas;
    }

    public Productor[] getVecProductoresMarcos() 
    {
        return vecProductoresMarcos;
    }

    public void setVecProductoresMarcos(Productor[] vecProductoresMarcos) 
    {
        this.vecProductoresMarcos = vecProductoresMarcos;
    }

    public Ensamblador[] getVecEnsambladoresBici() 
    {
        return vecEnsambladoresBici;
    }

    public void setVecEnsambladoresBici(Ensamblador[] vecEnsambladoresBici) 
    {
        this.vecEnsambladoresBici = vecEnsambladoresBici;
    }

    public Ensamblador[] getVecEnsambladoresTrici() 
    {
        return vecEnsambladoresTrici;
    }

    public void setVecEnsambladoresTrici(Ensamblador[] vecEnsambladoresTrici) 
    {
        this.vecEnsambladoresTrici = vecEnsambladoresTrici;
    }

    /**
     * Contrata o despide productores de neumaticos.
     * @param cantidadProductores 
     */
    public void contratarProductoresNeumaticos(int cantidadProductores)
    {
        int tiempoEnsamblaje = duracionDia * 1000 * 1;
        int cont = 0;
        
        // Inicia recorrienda del vector de productores de neumatico.
        for (int i = 0; i < vecProductoresNeumaticos.length; i++) 
        {
            // Identifica la posicion del vector donde existe un productor activo
            if (vecProductoresNeumaticos[i] != null && vecProductoresNeumaticos[i].isActivo())
            {
                // Registra el numero de productores activos
                cont++;
            }
        }
        /**
         * Mientras la cantidad de productores a contratar sea mayor a la cantidad
         * de productores activos.
         */
        if (cantidadProductores > cont) 
        {
            // Inicializa productor a contratar.
            for (int i = cont; i < cantidadProductores; i++) 
            {
                vecProductoresNeumaticos[i] = new Productor("neumaticos", almacenNeumaticos,
                        sExclusividadNeumaticos, sConsumirNeumaticos, sProducirNeumaticos,
                        tiempoEnsamblaje, sInterfaz);
            }
            // Inicializa corrida del hilo de productor contratado.
            for (int i = cont; i < cantidadProductores; i++) 
            {
                vecProductoresNeumaticos[i].start();
            }
        } 
        else if(cantidadProductores < cont)
        {
            // Finaliza corrida del hilo productor a despedir.
            vecProductoresNeumaticos[cont-1].setActivo(false);
            // Borra productor a despedir
            vecProductoresNeumaticos[cont-1] = null;
        }
    }

    /**
     * Contrata o despide productores de bujes.
     * @param cantidadProductores 
     */
    public void contratarProductoresBujes(int cantidadProductores) 
    {
        int tiempoEnsamblaje = duracionDia * 1000 * 1;
        int cont = 0;
        
        // Inicia recorriendo el vector de productores de bujes.
        for (int i = 0; i < vecProductoresBujes.length; i++) 
        {
            // Identifica la posicion del vector donde existe un productor activo
            if (vecProductoresBujes[i] != null && vecProductoresBujes[i].isActivo()) 
            {
                // Registra el numero de productores activos
                cont++;
            }
        }
        
        /**
         * Mientras la cantidad de productores a contratar sea mayor a la cantidad
         * de productores activos.
         */
        if (cantidadProductores > cont) 
        {
            // Inicializa productor a contratar.
            for (int i = cont; i < cantidadProductores; i++) {
                vecProductoresBujes[i] = new Productor("bujes", almacenBujes,sExclusividadBujes, sConsumirBujes, 
                                         sProducirBujes,tiempoEnsamblaje, sInterfaz);
            }
            // Inicializa corrida del hilo de productor contratado.
            for (int i = cont; i < cantidadProductores; i++) 
            {
                vecProductoresBujes[i].start();
            }
        } 
        else if(cantidadProductores < cont)
        {
            // Finaliza corrida del hilo productor a despedir.
            vecProductoresBujes[cont-1].setActivo(false);
            // Borra productor a despedir
            vecProductoresBujes[cont-1] = null;
        }
    }

    /**
     * Contrata o despide productores de marcos.
     * @param cantidadProductores 
     */
    public void contratarProductoresMarcos(int cantidadProductores) 
    {
        int tiempoEnsamblaje = duracionDia * 1000 * 2;
        int cont = 0;
        
        // Inicia recorriendo el vector de productores de bujes.
        for (int i = 0; i < vecProductoresMarcos.length; i++) 
        {
            // Identifica la posicion del vector donde existe un productor activo
            if (vecProductoresMarcos[i] != null && vecProductoresMarcos[i].isActivo()) 
            {
                // Registra el numero de productores activos
                cont++;
            }
        }
        /**
         * Mientras la cantidad de productores a contratar sea mayor a la cantidad
         * de productores activos.
         */
        if (cantidadProductores > cont) 
        {
            // Inicializa productor a contratar.
            for (int i = cont; i < cantidadProductores; i++) {
                vecProductoresMarcos[i] = new Productor("marcos", almacenMarcos,sExclusividadMarcos, sConsumirMarcos, 
                                         sProducirMarcos,tiempoEnsamblaje, sInterfaz);
            }
            // Inicializa corrida del hilo de productor contratado.
            for (int i = cont; i < cantidadProductores; i++) 
            {
                vecProductoresMarcos[i].start();
            }
        } 
        else if(cantidadProductores < cont)
        {
            // Finaliza corrida del hilo productor a despedir.
            vecProductoresMarcos[cont-1].setActivo(false);
            // Borra productor a despedir
            vecProductoresMarcos[cont-1] = null;  
        }
    }

    /**
     * Contrata o despide productores de ruedas.
     * @param cantidadProductores 
     */
    public void contratarProductoresRuedas(int cantidadProductores) 
    {
        int tiempoEnsamblaje = (duracionDia * 1000) / 2;
        int cont = 0;
        for (int i = 0; i < vecProductoresRuedas.length; i++) {
            if (vecProductoresRuedas[i] != null && vecProductoresRuedas[i].isActivo()) {
                cont++;
            }
        }
        
        if (cantidadProductores > cont) 
        {
            for (int i = cont; i < cantidadProductores; i++) 
            {
                vecProductoresRuedas[i] = new ProductorEnsamblador(almacenNeumaticos,
                        sExclusividadNeumaticos, sConsumirNeumaticos, sProducirNeumaticos,
                        almacenBujes, sExclusividadBujes, sConsumirBujes, sProducirBujes, 
                        "rueda", almacenRuedas, sExclusividadRuedas, sConsumirRuedas, 
                        sProducirRuedas, tiempoEnsamblaje, sInterfaz);
            }
            for (int i = cont; i < cantidadProductores; i++) 
            {
                vecProductoresRuedas[i].start();
            }  
        }
        else if(cantidadProductores < cont)
        {
            //for (int i = vecProductoresRuedas.length; i > cantidadProductores; i--) 
            //{
                vecProductoresRuedas[cont-1].setActivo(false);
                vecProductoresRuedas[cont-1] = null;
            //}  
        }

    }

    /**
     * Contrata o despide ensambladores de bicicletas.
     * @param cantidadEnsambladores 
     */
    public void contratarEnsambladoresBici(int cantidadEnsambladores) 
    {
        int tiempoEnsamblaje = duracionDia * 1000 * 2;
        int cont = 0;
        for (int i = 0; i < this.vecEnsambladoresBici.length; i++) {
            if (vecEnsambladoresBici[i] != null && vecEnsambladoresBici[i].isActivo()) 
            {
                cont++;
            }
        }
        if (cantidadEnsambladores > cont) 
        {
            for (int i = cont; i < cantidadEnsambladores; i++) 
            {
                vecEnsambladoresBici[i] = new Ensamblador(almacenRuedas, sExclusividadRuedas,
                    sConsumirRuedas, sProducirRuedas, almacenMarcos, sExclusividadMarcos,
                    sConsumirMarcos, sProducirMarcos, almacenBici, sExclusividadBici,
                    sProducirBici, almacenTrici, sExclusividadTrici, sProducirTrici,
                    "bicicletas", tiempoEnsamblaje, 2, sInterfaz);
            }
            for (int i = cont; i < cantidadEnsambladores; i++) 
            {
                this.vecEnsambladoresBici[i].start();
            }  
        }
        else if(cantidadEnsambladores < cont)
        {
          //for (int i = vecProductoresRuedas.length; i > cantidadProductores; i--) 
          //{
                vecEnsambladoresBici[cont-1].setActivo(false);
                vecEnsambladoresBici[cont-1] = null;
                System.out.println("Ensamblador despedido");
          //}    
        }

    }

    /**
     * Contrata o despide ensambladores de triciclos.
     * @param cantidadEnsambladores 
     */
    public void contratarEnsambladoresTrici(int cantidadEnsambladores) 
    {
        int tiempoEnsamblaje = duracionDia * 1000 * 3;
        int cont = 0;
        for (int i = 0; i < vecEnsambladoresTrici.length; i++) {
            if (vecEnsambladoresTrici[i] != null && vecEnsambladoresTrici[i].isActivo()) {
                cont++;
            }
        }
        if (true)
        {
            for (int i = cont; i < cantidadEnsambladores; i++) 
            {
                    vecEnsambladoresTrici[i] = new Ensamblador(almacenRuedas, sExclusividadRuedas,
                    sConsumirRuedas, sProducirRuedas, almacenMarcos, sExclusividadMarcos,
                    sConsumirMarcos, sProducirMarcos, almacenTrici, sExclusividadTrici,
                    sProducirTrici, almacenBici, sExclusividadBici, sProducirBici,
                    "triciclos", tiempoEnsamblaje, 3, sInterfaz);
            }

            for (int i = cont; i < cantidadEnsambladores; i++) 
            {
                vecEnsambladoresTrici[i].start();
            } 
        }
        else if(cantidadEnsambladores < cont)
        {
          //for (int i = vecEnsambladoresTrici.length; i > cantidadProductores; i--) 
          //{
                vecEnsambladoresTrici[cont-1].setActivo(false);
                vecEnsambladoresTrici[cont-1] = null;
          //}    
        }

    }
    
    public void pausarProductores(Productor vecProductores[]) 
    {
        for (int i = 0; i < vecProductores.length; i++) 
        {
            if (vecProductores[i] != null && vecProductores[i].isFlag()) 
            {
                vecProductores[i].setFlag(false);
            }
        }
        System.out.println("Detenido productores");
    }

    public void reanudarProductores(Productor vecProductores[]) 
    {
        for (int i = 0; i < vecProductores.length; i++) 
        {
            if (vecProductores[i] != null && !vecProductores[i].isFlag()) 
            {
                vecProductores[i].setFlag(true); 
            }
        }
        System.out.println("Reanudado productor");
    }
    
    public void pausarProductorEnsamblador(ProductorEnsamblador vecProductorEnsamblador[]) 
    {
        for (int i = 0; i < vecProductorEnsamblador.length; i++) 
        {
            if (vecProductorEnsamblador[i] != null && vecProductorEnsamblador[i].isFlag()) 
            {
                vecProductorEnsamblador[i].setFlag(false);
            }
        }
        System.out.println("Detenido productores");
    }

    public void reanudarProductoreEnsamblador(ProductorEnsamblador vecProductorEnsamblador[]) 
    {
        for (int i = 0; i < vecProductorEnsamblador.length; i++) 
        {
            if (vecProductorEnsamblador[i] != null && !vecProductorEnsamblador[i].isFlag()) 
            {
                vecProductorEnsamblador[i].setFlag(true); 
            }
        }
        System.out.println("Reanudado productor");
    }
    
    public void pausarEnsamblador(Ensamblador vecProductorEnsamblador[]) 
    {
        for (int i = 0; i < vecProductorEnsamblador.length; i++) 
        {
            if (vecProductorEnsamblador[i] != null && vecProductorEnsamblador[i].isFlag()) 
            {
                vecProductorEnsamblador[i].setFlag(false);
            }
        }
        System.out.println("Detenido productores");
    }

    public void reanudarEnsamblador(Ensamblador vecEnsamblador[]) 
    {
        for (int i = 0; i < vecEnsamblador.length; i++) 
        {
            if (vecEnsamblador[i] != null && !vecEnsamblador[i].isFlag()) 
            {
                vecEnsamblador[i].setFlag(true); 
            }
        }
        System.out.println("Reanudado productor");
    }
    
    public void contar(Productor productores[])
    {
        int cont =0;
        for (int i = 0; i < productores.length; i++) 
        {
            if (productores[i] != null && productores[i].isActivo())
            {
                cont++;
            }
        }
        System.out.println("Hay "+cont+" productores");
    }
    
    public void contar2(ProductorEnsamblador productores[])
    {
        int cont =0;
        for (int i = 0; i < productores.length; i++) 
        {
            if (productores[i] != null && productores[i].isActivo())
            {
                cont++;
            }
        }
        System.out.println("Hay "+cont+" productores de ruedas");
    }
              
    public void contar3(Ensamblador productores[])
    {
        int cont =0;
        for (int i = 0; i < productores.length; i++) 
        {
            if (productores[i] != null && productores[i].isActivo())
            {
                cont++;
            }
        }
        System.out.println("Hay "+cont+" ensamblador");
    }
  
}
