/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyecto;

import java.time.LocalDate;

/**
 *
 * @author juanj
 */
public class Alumno {
    private int legajo;  //20  20.6
    private long dni;
    String apellido;
    String nombre;
    private short edad;
    private LocalDate fechaNacimiento;  

    public int getLegajo() {
        return legajo;
    }
    
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", mail=" + mail + '}';
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    private String domicilio;
    private String mail;

    

    public Alumno(int legajo, String domicilio, String mail) {
        this.legajo = legajo;
        this.domicilio = domicilio;
        this.mail = mail;
    }

    public Alumno(int legajo, String apellido, String nombre, int dni) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    

    public Alumno(int legajo, long dni, String apellido, String nombre, short edad, LocalDate fechaNacimiento, String domicilio, String mail) {
        this.legajo = legajo;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.mail = mail;
    }
    public Alumno(){}

}
