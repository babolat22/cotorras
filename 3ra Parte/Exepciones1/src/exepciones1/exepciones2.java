/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones1;

/**
 *
 * @author juanj
 */
public class exepciones2 {

   // Capturando una excepción en un método

    static int slice0[] = { 0,1,2,3,4 };

    public static void main( String a[] ) {
        try {
            uno();
        } catch( Exception e ) {
            System.out.println( "Captura de la excepcion en main()" );
            e.printStackTrace();
        }
    }
/*printStackTrace(). Invocando a este método sobre una excepción se volcará a pantalla todas las llamadas 
  hasta el momento en donde se generó la excepción (no donde se maneje la excepción)*/
    static void uno() {
        try {
            slice0[-1] = 4000;
        } catch( NullPointerException e ) {
            System.out.println( "Captura una excepcion diferente" );
            
        }
    }
}
