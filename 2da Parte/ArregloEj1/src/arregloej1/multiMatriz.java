/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloej1;

import java.util.Arrays;

/**
 *
 * @author juanj
 */
public class multiMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[][][][] fourDArray = new float[10][10][10][1];
        // Fill each row with null
        for (float[][][] row: fourDArray)
        {
            for (float[][] innerRow: row)
            {
                for (float[] innerInnerRow: innerRow)
                {
                     Arrays.fill(innerInnerRow, -1000);
                }
            }
        };
    for (float[][][] row: fourDArray)
        {
            for (float[][] innerRow: row)
            {
                for (float[] innerInnerRow: innerRow)
                {
                System.out.print(innerInnerRow.toString());
                }
            }
        };
        
        
    }
    
}
