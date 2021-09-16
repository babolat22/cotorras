/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class P2ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <numero> tablero = new ArrayList();
        int docena=3, i=1;
        numero cero = new numero();  tablero.add(cero); 
        while (i<37){
            if(i<=12) docena=1;
            else if (i<=24) docena=2;  
            else docena=3;  
            numero num = new numero(i, docena);
            tablero.add(num);
            i++;
        }
        for(numero valor: tablero){
             System.out.printf("El %s ¿es par? %s, y de color %s\n",valor.n, valor.esPar(), valor.getColor());
        }
    }
    
}
