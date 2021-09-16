/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charat;

import java.util.Scanner;

/**
 *
 * @author juanj
 */

 
public class MuestraCaracteresApp {
 
    public static void main(String[] args) {
         
        Scanner sn=new Scanner(System.in);
         
        //Pido al usuario que escriba una frase
        System.out.println("Escriban una frase");
         
        //Recomiendo usar nextLine en lugar de next por los espacios
        String frase="es lindo vivir"; 
       // String frase = sn.nextLine(); 
        //Creamos un array de caracteres
        //char caracteres[]=new char[frase.length()];
          //Creamos un array de caracteres usando el metodo de String
        char caracteres[]=frase.toCharArray();
        char carac[]= new char[20];
//Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for(int i=0;i<frase.length();i++){
            carac[i]=frase.charAt(i);
            System.out.println("CharAT: "+carac[i]);
            System.out.println("toChar: "+caracteres[i]);
        }
         
    }
     
}
