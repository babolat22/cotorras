/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscopia;

/**
 *
 * @author juanj
 */

import java.util.Arrays;

public class ArraysCopia {
 
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5}; // TAMANIO=5
        
        int[] array2=new int[array1.length]; // TAMANIO=5
        
        for(int i=(array1.length-1),j=0;i>=0;i--,j++){
           array2[j]=array1[i];
           System.out.println("arr2: " +array2[j]);
        }
           
//creo el array
        int covid[]=new int[6];
         
        //relleno todo el array con 20
        Arrays.fill(covid, 20);
        for(int i=0;i<covid.length;i++){
            System.out.println("mostrando num: "+ covid[i]);
        } 
        //Relleno desde la posicion 3 hasta el final
        Arrays.fill(covid, 3, covid.length, -111);
         
        //Muestro el array
        for(int i=0;i<covid.length;i++){
            System.out.println("mostrando num: "+ covid[i]);
        }
        
        double[][] arr = new double[20][4];
        Arrays.fill(arr, 0);
        
        /*int[][] matriz = new int[4][6];
        Arrays.fill(matriz, 9);
        for(int i=0;i<matriz.length;i++){
            for(int j=0;i<matriz.length;j++){
                System.out.println("mostrando num: "+ matriz[i][j]);
            } 
        } */   
    }
     
}