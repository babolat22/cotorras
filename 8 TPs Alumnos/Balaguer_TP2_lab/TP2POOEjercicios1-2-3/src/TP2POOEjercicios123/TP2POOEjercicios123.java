/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2POOEjercicios123;

/**
 *
 * @author garba
 */
public class TP2POOEjercicios123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona personita=new Persona("juani",38752605, 24,"virorco");
        Deportista undeportista=new Deportista("Pepe",22223422, 32, "Bolivar",100);
        personita.Andar();
        personita.Correr();
        undeportista.Andar();
        undeportista.Correr();
      
    }
    
}
