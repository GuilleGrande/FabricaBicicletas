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

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @authors Guillermo Grande & Vincent Pérez.
 */
public class Almacen 
{
    private boolean[] almacen;
    private int size;
    private int in = 0;
    private int out = 0;
    private int cantidadProductos;
    private JLabel inAlmacen;

    /**
     * Constructor de almacenes.
     * @param size 
     */
    public Almacen(int size, JLabel inAlmacen) 
    {
        this.size = size;
        this.almacen = new boolean[size];
        this.inAlmacen = inAlmacen;
        cantidadProductos = 0;
        
        // Inicializa todas las posiciones del almacen en false
        for (int i = 0; i < almacen.length; i++) 
        {
            almacen[i] = false;
        }
    }

    /**
     * Getter del tamano del almacen.
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter del tamano del almacen.
     * @param size 
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Inserta producto en almacen. Su posición correspondiente pasa a 'true'.
     * Modifica apuntador 'in' que identifica la próxima posición donde se 
     * insertará un producto.
     */
    public void agregarAlmacen()
    {
        this.almacen[in] = true;
        this.in = (in+1) % size;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    /**
     * Setter de cantidad de productos.
     * @param size 
     */
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    
    /**
     * Extrae producto de almacen. Su posición correspondiente pasa a 'false'.
     * Modifica apuntador 'out' que identifica la próxima posición donde se 
     * extraerá un producto. Recibie parametro 'cantidad' que identifica la
     * cantidad de productos a extraer.
     * @param cantidad 
     */
    public void sacarAlmacen(int cantidad)
    {
        for (int i = out; i < out+cantidad; i++)
        {
           this.almacen[i] = false; 
           this.out = (out+1) % size;
        }
    }
    
    /**
     * Cuenta la cantidad de productos en un almacen y modifica su etiqueta correspondiente
     * en la interfaz.
     */
    public void contarAlmacen()
    {
        int contProductos = 0;
        for (int i = 0; i < almacen.length; i++) 
        {
            if (almacen[i])
            {
                contProductos++;
            }
        }
        cantidadProductos = contProductos;
        inAlmacen.setText(Integer.toString(contProductos));
    }
}
