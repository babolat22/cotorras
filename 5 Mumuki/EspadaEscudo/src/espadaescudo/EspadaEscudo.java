/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espadaescudo;

/**
 *
 * @author juanj
 */
public class EspadaEscudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escudo escudo = new Escudo(0,5);
        Espada espada= new Espada(10,1);
      
        Guerrero xena = new Guerrero(22, 2, espada);
        Guerrero conan = new Guerrero(18, 12, new Escudo());
  
        System.out.println("puntosDeAtaque XENA: "+ xena.puntosDeAtaque());   // 22 + 10 
        System.out.println("DEFENSA XENA: "+ xena.puntosDeDefensa());   // 2 + 1  
        conan.puntosDeAtaque();   // 18 + 2
        conan.puntosDeAtaque();   // 12 + 6
    }
    
}

