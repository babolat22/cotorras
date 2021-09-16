/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author Ale
 */
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guerrero Thor = new Guerrero ();
        Thor.ubicacion.x =100;
        Thor.ubicacion.y = 200;
        Thor.Girar();
        Thor.Girar();
        Thor.Girar();
        Thor.Avanzar();
        Thor.Avanzar();
        Thor.Avanzar();
        Thor.Avanzar();
        Thor.Avanzar();
        Thor.Disparar();
        Thor.Disparar();
        Thor.Disparar();
        Thor.Disparar();
        Thor.Disparar();
        Thor.Disparar();
        Thor.Disparar();
        Thor.Disparar();
        System.out.println(Thor.energia);
        System.out.println(Thor.ubicacion.x + " "+ Thor.ubicacion.y);
        
        
                
}
}