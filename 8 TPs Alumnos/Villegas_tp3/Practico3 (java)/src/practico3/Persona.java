/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3;

import java.time.*;

/**
 *
 * @author Chony
 */
public abstract class Persona implements Pasivo{
    String nombre,domicilio;
    double dni;
    LocalDate fechaNac;
    
    public Persona(String nombre, String domicilio, double dni, LocalDate fechaNac) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    abstract String cobrar();
 
    @Override
    public boolean hacerAportes(){
        return true;
    }
        
    
    
    
    
}
