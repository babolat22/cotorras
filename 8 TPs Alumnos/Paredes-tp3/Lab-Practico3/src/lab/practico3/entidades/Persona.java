/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico3.entidades;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author kevin
 */
public abstract class Persona {
    
    private String nombre, domicilio, tipo;
    private int dni;
    private LocalDate fechaNac;

    public Persona(String nombre, int dni, LocalDate fechaNac, String domicilio, String tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public int calcularEdad(){
        return (int)ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
    }
    
    public int calcularDiasVividos(){
        
        return (int)ChronoUnit.DAYS.between(fechaNac, LocalDate.now());
    }

    public String getTipo() {
        return tipo;
    }
    
    public abstract void cobrar();
}
