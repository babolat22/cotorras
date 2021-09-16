/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3_velazquez;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ulp
 */
public abstract class Persona {

    private String nombre;

    private long dni;

    private String fechaDeNacimiento;
    
    private LocalDate nacimiento;

    private String domicilio;

    public Persona(String nombre, long dni, String fechaDeNacimiento, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
 
        
     public void convertir(){
         DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         nacimiento = LocalDate.parse(getFechaDeNacimiento(),f);
         
     }   
     
     public LocalDate getNacimiento(){
         return nacimiento;
     }
     


    

    
   
    public abstract void cobrar();
}

