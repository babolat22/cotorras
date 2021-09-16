/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3_velazquez;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ulp
 */
public class Registro {
    public void procesarDatos(Persona persona){
        
        if (persona instanceof Trabajador){
            System.out.println("Mi nombre es " +persona.getNombre());
            persona.convertir();
            LocalDate hoy= LocalDate.now();
            long edad = ChronoUnit.YEARS.between(persona.getNacimiento(),hoy);
            System.out.println("Mi Edad es "+edad);
            persona.cobrar();
      }
        if (persona instanceof Jubilado){
 
            System.out.println("Mi nombre es " +persona.getNombre());
            persona.convertir();
            LocalDate hoy= LocalDate.now();
            long dias = ChronoUnit.DAYS.between(persona.getNacimiento(),hoy);
            System.out.println("Mis Dias vividos son "+dias);
            persona.cobrar();
    }
    }
        
}

