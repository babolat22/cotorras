/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pooejercicios456;
import java.time.Period;
/**
 *
 * @author garba
 */
public class TP2POOEjercicios456 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Animal animalito=new Animal("Tortuga","Tomate",20);
    Perro perrito=new Perro("Sam","Dogchow",2,"Doberman");
    Gato gatito=new Gato("Garfield","Wishcash",1,"Negro");
    Caballo caballito=new Caballo("Dave","Pasto",5,"No");
    perrito.mostrar();
    gatito.mostrar();
    caballito.mostrar();
    perrito.vacunar(2017);
    gatito.vacunar(2018);
    caballito.vacunar(2019);
    animalito.vacunar(2018);
    }
    
}
