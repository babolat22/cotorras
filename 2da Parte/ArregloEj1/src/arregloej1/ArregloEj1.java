/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloej1;

/**
 *
 * @author juanj
 */
public class ArregloEj1 {
// Programa Java para ilustrar la creación de un array de enteros,
// coloca algunos valores en la matriz, e imprime cada valor
 
    public static void main (String[] args) 
    {         
         //ejemplos ARREGLOS DE 1 , 2, Y 3 DIMENSIONES  
        int[] unidimension = new int[] { 1,3,5,7,9 };
        int[][] bidimension = new int[][]{ { 1,2,3,4,5 }, 
                                           { 2,1,3,4,5 }, 
                                           { 1,3,4,2,5 } };
        int[][][] tridimension = { { { 1,2,3,4,5 }, { 2,1,3,4 }, { 1,4 } },
                       { { 5,4,3,2,1 }, { 3,4,2,5,1 }, { 1,5,4,2,3 } } };  
        int[][] array = new int[3][5];  // asimetrica y regular
        int[][] m = new int [][]{{10,20,30,40},{50,60,70},{80,90}};
     /*  /--------------/|
        /              / |
       /              /  |
      /              /   |
     +--------------+    /
     |              |   /
     |              |  /     // [2][3][5]
     |              | /
     |              |/
     +--------------+      */
        
        //ejemplo 1:
        String utiles []={"pelota", "zapatilla","mochila","remera"};
        double precios[]={350.5,890.60,450.99,250.70};
        System.out.println("Lista de Productos y sus precios");
        for (int u=0;u<utiles.length;u++)
            System.out.println(utiles[u]+ " "+ precios[u]); 
        
        //ejemplo 2:
        String nombres []={"Victor", "Ronald","Cachorita","Paola"};
        int edad []={25,30,19,22}; 
        char sexo []={'M','M','X','F'};
        System.out.println("Datos de los usuarios");
        System.out.println("NOMBRES EDAD SEXO");
        System.out.println("------- ---- ----");
        for (int u=0;u<nombres.length;u++)
         System.out.println(nombres[u]+ " "+ edad[u] + " " + sexo[u]); 
        
        

     }
    
    
    
    
}