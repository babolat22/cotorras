package ejseñoradelosgatos;

import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class EjSeñoraDeLosGatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dueño p = new Dueño("Marta", 34);
        Mascota m1 = new Gato("Manchita", 2);
        Gato m2 = new Gato("Walter", 1);
        Lechuza l = new Lechuza("Cachuza", 10);
        p.adoptarMascota(m1);   // ahora se conocen las clases
        p.adoptarMascota(m2);   // ahora se conocen las clases
        p.adoptarMascota(l);
        Perro m4 = new Perro("Firulais", 2);
        m2.yaSeEmpulgo();
        l.enojarse();
        p.adoptarMascota(m4);
        ArrayList<Mascota> susMascotas = p.verMascotas();
       //COMPARAR
        if (m1.getClass() == Gato.class) 
                System.out.println("la mascota m1, llamada "+ m1.getNombre() + ": Es un Gato"); 
        else 
            System.out.println("la mascota m1 No es Gato");
        //la condición es true si a es una instancia de X, pero no si a es una instancia de una subclase de X
      
        if (m1 instanceof Mascota) 
               System.out.println("m1 Es Mascota");
        if (m2 instanceof Mascota) 
               System.out.println("m2 Es Mascota");
        
        if (l instanceof Lechuza) 
               System.out.println("l Es Mascota");
        //En la instanceof, la condición es true si m2 es una instancia de Animal, o de una subclase de Animal.
        //if (Mascota.isInstance(m1)) { // do something }

        for (Mascota m: susMascotas) 
            m.sePuedeVacunar();       
       
        System.out.print("con Foreach ");
        susMascotas.forEach(m -> { 
            m.Chivatear();
        });
        m4.seEnfermo();
        m4.sePuedeVacunar();
        
        p.verMascotas().stream().forEach(masc -> {
            System.out.println("Mascota Stream: "+ masc.getNombre());
        });
        
        /* CLASE HOMBRE
        void JugarCoRobot(Robot r){
            r.Avanzar();
            r.getEnergia();
        }*/
        // (usa)DEPEND: Un metodo que usa otro objeto parametro (B b), acceso solo dentro del metodo
        // (tiene)ASOC: Un atributo de la otra clase(B)en esta clase(A)
        // (contiene)AGREG: Atributo (B en A) - Metodo ADD(B b){ } referencia 
        // (conforma)COMP: Atributo (B en A) - Metodo create(){ B = new B(); } valor
        // (Es un) Herencia: extends, implements
    } 
      
   
}
