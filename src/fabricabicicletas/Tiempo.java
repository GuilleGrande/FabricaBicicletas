/*
 * The MIT License
 *
 * Copyright 2017 Guillermo & Vincent Pérez
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

import javax.swing.JLabel;

/**
 *
 * @author Guillermo Grande & Vincent Pérez.
 */
public class Tiempo extends Thread
{
    private JLabel labelTiempo;
    private JLabel tiempoBici;
    private JLabel tiempoTrici;      
    private int tiempo;
    private int duration;
    Almacen almacenBici;
    Almacen almacenTrici;
    private boolean activo;
    private boolean flagBici;
    private boolean flagTrici;

    public Tiempo(JLabel labelTiempo, int tiempo, int duration, Almacen almacenBici,
            Almacen almacenTrici, JLabel tiempoBici, JLabel tiempoTrici) 
    {
        this.labelTiempo = labelTiempo;
        this.tiempoBici = tiempoBici;
        this.tiempoTrici = tiempoTrici;
        this.tiempo = tiempo;
        this.duration = duration * 1000;
        this.almacenBici = almacenBici;
        this.almacenTrici = almacenTrici;
        activo = true;
        flagBici = true;
        flagTrici = true;
    }
    
    public void condicionParada()
    {
        if (almacenBici.getCantidadProductos() == almacenBici.getSize() && almacenTrici.getCantidadProductos() == almacenTrici.getSize()) 
        {
            activo = false;
        }
    }
    
    @Override
    public void run()
    {
        while(activo)
        {
            try
            {
                String tiempoTranscurrido = Integer.toString(tiempo/duration);
                if (flagBici)
                {
                    if (almacenBici.getCantidadProductos() < almacenBici.getSize()) 
                    {
                        tiempoBici.setText(tiempoTranscurrido);
                    }
                    else
                    {
                        flagBici = false;
                    }  
                }
                if (flagTrici) 
                {
                    if (almacenTrici.getCantidadProductos() < almacenTrici.getSize()) 
                    {
                        tiempoTrici.setText(tiempoTranscurrido);
                    }
                    else
                    {
                        flagTrici = false;
                    } 
                }
                
                labelTiempo.setText(tiempoTranscurrido);
                this.sleep(duration);
                tiempo = tiempo + duration;
                condicionParada();
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    } 
}
