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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Guillermo Grande y Vincent Pérez.
 */
public class ReadFile 
{
    private String path;
    private int[] vector_num;
    
    /**
     * Constructor. Recibe la ruta del archivo de texto.
     * 
     * @param file_path 
     */
    public ReadFile(String file_path)
    {
        path = file_path;
        vector_num = new int[19];
    }
    
    /**
     * Lee las lineas de un archivo de texto, usa StringTokenizer para ubicar los
     * datos relevantes y los almacen en un vector de enteros.
     * 
     * @return String[] vec_num
     * @throws IOException 
     */
    public int[] openFile() throws IOException
    {
        try
        {
            String line;
            int i = 0;

            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);

            while( (line = reader.readLine()) != null )
            {
                StringTokenizer sTokenizer = new StringTokenizer(line, ":");

                while(sTokenizer.hasMoreElements())
                {
                    sTokenizer.nextElement();
                    Integer num = Integer.parseInt(sTokenizer.nextElement().toString());
                    vector_num[i] = num;
                    i++;
                }   
            }

            reader.close();

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        return vector_num;
    }
}
