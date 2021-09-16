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
public class Exepciones1 {

    /**
     * @param args the command line arguments
     */
    
    static void demoproc() {
        try {
            // Código peligroso
            throw new NullPointerException( "demo" );
            //La sentencia throw se utiliza para lanzar explícitamente una excepción.
        } catch( NullPointerException e ) {
            System.out.println( "Capturada la excepcion en demoproc" );
            throw e;
        }
    }

    public static void main( String args[] ) {
        try {
            demoproc();
        } catch( NullPointerException e ) {
            System.out.println( "Capturada de nuevo: " + e );
        }
    }
}
    

