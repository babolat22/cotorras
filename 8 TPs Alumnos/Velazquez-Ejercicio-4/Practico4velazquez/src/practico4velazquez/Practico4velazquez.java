/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico4velazquez;

/**
 *
 * @author Ulp
 */
public class Practico4velazquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posicion p =new Posicion(100,200); //punto a
        Guerrero g1= new Guerrero("Thor",p);
            for(int x=0 ;x<3;x++){
            g1.girar();        }               //punto b
           for (int x= 0; x<5; x++){            //punto c
               g1.avanzar();
           }
           for (int z=0; z<8;z++){              //punto d
               
              g1.disparar();
           }
            /* respuestas 
            
         1. el estaado de energia la inicio es de 100 
            luego de disparar el estado de energia es 20
         2. al finalizar la ejecucion esta orientado hacia el Oeste */
         
    }
    
}
