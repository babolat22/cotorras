/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloej1;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class caso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // caso3: 
     Scanner dato = new Scanner(System.in);
     int mayor = 0; int menor = 0;
     int[] numeros = new int[5]; 
        for (int i = 0; i < 5; i++) {  //CARGA VECTOR
            System.out.print("Ingrese el número " + (i) + " a evaluar :"); 
            numeros[i] = dato.nextInt(); 
        } 
        for (int i = 1; i < numeros.length; i++) {  // ENCUENTRA MAYOR
            if (mayor < numeros[i])  // 
                 mayor = numeros[i];  //guarda mayor
        } 
        menor = mayor; 
        for (int i = 1; i < numeros.length; i++) {
            if (menor > numeros[i]) 
                menor = numeros[i];  // guarda menor
        }
        System.out.println(" el numero mayor es " + mayor + " el numero menor es :" + menor); 
    
       // caso4: 
        Scanner entrada=new Scanner(System.in);  // palabra
         
        System.out.println("Escriba una palabra");
        String palabra=entrada.nextLine();
        
        char caracteres[]=new char[palabra.length()];
        for(int i=0;i<palabra.length();i++){            
            caracteres[i]=palabra.charAt(i);             
            System.out.println(caracteres[i]);           
        } 
        System.out.println("la cantidad de caracteres es : "+palabra.length());
         
    }
}
