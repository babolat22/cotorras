/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author programador
 */
public class Alumno {
    private int id;
    private int dni;
    private  String nombre;
    private String domicilio;
    private LocalDate fechaNac;

    public Alumno(int dni, String nombre, String domicilio, LocalDate fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNac=   fechaNac;
    }

    public Alumno(int id, int dni, String nombre, String domicilio, LocalDate fechaNac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
    }
   
    
    public Alumno(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

     public String toString(){
     return nombre;
    }
    
    
    
}

