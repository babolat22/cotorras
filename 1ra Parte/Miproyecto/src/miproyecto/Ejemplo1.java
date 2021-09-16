/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyecto;

/**
 *
 * @author juanj
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno gomez, alumno1 = new Alumno(); //instanciadndo alumno1
        String mail = "mateosoloa@gmail.com";
        alumno1.setMail(mail);
       
        alumno1.nombre= "Juanjo";   // rompiendo encapsulamiento
        alumno1.setDomicilio("Las catitas 1123"); // IU publica accede oculto
        
        alumno1.getApellido();
        System.out.println("Su apellido: "+ alumno1.getApellido() + " " + alumno1.getNombre());
        System.out.println(alumno1);
        
    }
    
}
