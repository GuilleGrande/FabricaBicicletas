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

import java.io.IOException;

/**
 *
 * @author Guillermo Grande y Vincent Pérez.
 * 
 */
public class Aplication 
{
    static int vec[] = new int[19];
    
    public static void leerArchivoTexto() throws IOException
    {
        try
        {
            String file_path = "C:\\Users\\Guillermo\\Desktop\\archivo.txt";
            ReadFile file = new ReadFile(file_path);
            vec = file.openFile();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException
    {
        leerArchivoTexto();
        FabricaBicicletasUI interfaz = new FabricaBicicletasUI(vec);      
        interfaz.setVisible(true);
    }
}
