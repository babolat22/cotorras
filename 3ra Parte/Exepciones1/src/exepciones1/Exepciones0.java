/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones1;
 import java.lang.Thread;


public class Exepciones0 {

    public static void main( String args[] ) {
        // Se instancia un objeto 
        Exepciones0 obj = new Exepciones0();
        // Se crea la secuencia try/catch que llamara al metodo que
        // lanza la excepcion
        try { 
            // Llamada al metodo que genera la excepcion
            obj.miMetodo();
        }catch(InterruptedException e){
                System.out.println("Procesando la excepcion..."+e.getMessage());
        } 
    }
  
    // Este es el metodo que va a lanzar la excepcion
    void miMetodo() throws InterruptedException { 
        //en realidad no se resuelve el problema sino que se está pasando a otro método para que lo resuelva él.
        Thread.currentThread().sleep( 1000 ); // currentThread() genera
                                              // una excepcion
        }
    }

