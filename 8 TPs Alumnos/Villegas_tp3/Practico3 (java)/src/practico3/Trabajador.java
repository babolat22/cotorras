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
public class Trabajador extends Persona implements Pasivo{
    double sueldo;
    

    Trabajador(String nombre, String domicilio, double dni, LocalDate fechaNac, double sueldo) {
        super(nombre, domicilio, dni, fechaNac);
        this.sueldo=sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public int edad(){
       
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
    return periodo.getYears();
    
    }
    
    @Override
    String cobrar() {
        return "Monto a cobrar: $"+ getSueldo();
    }
    
    @Override
    public boolean hacerAportes(){
        return true;
    }
    
    @Override
    public String toString(){
        return "el nombre del trabajador es: " + getNombre()+ "su edad es de: "+ edad()+" "+cobrar();
    }
    
}
