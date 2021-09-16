/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ale
 */
public abstract class Persona {
    String nombre;
    String dni;
    LocalDate fechaNacimiento;
    String domicilio;
    
    public Persona (String xNombre , String xDNI, String xFechaNacimiento,
        String xDomicilio){
        this.nombre=xNombre;
        this.dni=xDNI;
        this.fechaNacimiento=LocalDate.parse(xFechaNacimiento);
        this.domicilio=xDomicilio;
    }

        
    String getNombre () {
        return this.nombre;
    }
    
    String getDNI (){
        return this.dni;
    }
    
    LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    String getDomicilio(){
        return this.domicilio;
    }
            
    void setNombre (String xNombre){
        this.nombre = xNombre;
    }
    
    void setDNI (String xDNI){
        this.dni = xDNI;
    }
    
    void setFechaNacimiento (LocalDate xFechaNacimiento){
        this.fechaNacimiento = xFechaNacimiento;
    }
    
    void setDomicilio (String xDomicilio){
        this.domicilio =  xDomicilio;
    }
    
    long calcularEdad (){
        return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }
    
    long calcularDiasVividos(){
        return ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now());
    }
    
    public abstract void cobrar();
    
}