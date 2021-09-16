/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1;

/**
 *
 * @author Lucas
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Robot r1 = new Robot();
    
        Hombre h1 = new Hombre();
        System.out.println("juan empieza a jugar con R12");
        h1.jugarConRobot(r1);
        
        Hombre h2 = new Hombre();
        System.out.println("te toca pedro!!!");
        h2.jugarConRobot(r1);
        
        
    }
   
}
