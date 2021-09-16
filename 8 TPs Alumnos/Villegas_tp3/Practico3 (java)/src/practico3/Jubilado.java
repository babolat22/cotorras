/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Chony
 */
public class Jubilado extends Persona implements Pasivo{

    public Jubilado(String nombre, String domicilio, double dni, LocalDate fechaNac) {
        super(nombre, domicilio, dni, fechaNac);
    }
    
    public int edad(){
       
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
    return periodo.getDays();
    
       
    }
    @Override
    String cobrar() {
        return "Cobrando mi jubilación \n";
    }
    @Override
    public String toString(){
        return "el nombre del jubilado es: " + getNombre()+ "los dias que ha vivido son: "+edad() + cobrar();
    }

    @Override
    public boolean hacerAportes() {
        return false;
    }
    
}
