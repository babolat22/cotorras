/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatriz;

/**
 *
 * @author jackd
 */
public class Matriz {
    
    int[][] matriz;
    
    public int[][] armar(int[][] mat)
    {
        matriz=mat;
        return matriz;
    }
    
    public void visualizarPares(int[][] mat)
    {
        for (int[] mat1 : mat) {
            System.out.print("\n");
            for (int c = 0; c < mat1.length; c++) {
                if (mat1[c] % 2 == 0) {
                    System.out.print(" " + mat1[c] + " ");
                }
                /*} else {
                    System.out.print(" ? ");
                }*/
            }
        }
    }      
    public void visualizar(int[][] mat)
    {
        for (int[] mat1 : mat) 
        {
            System.out.print("\n");
            for (int c = 0; c < mat1.length; c++) 
            {
                System.out.print(" " + mat1[c] + " ");
            }
        }
    }      
}