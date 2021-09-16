/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */

public class arrayApp {
 
    public static void main(String[] args) {
 
        //Esto es opcional
        final int TAMANIO=5;
 
        int num[]=new int[TAMANIO];
 
        //Invocamos las funciones
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto = JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
