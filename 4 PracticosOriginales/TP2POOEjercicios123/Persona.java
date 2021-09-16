/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2POOEjercicios123;

/**
 *
 * @author garba
 */
public class Persona {
    private String nombre;
    protected int dni;
    protected int edad;
    protected String domicilio;

    public Persona(String nombre, int dni, int edad, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.domicilio = domicilio;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public void Andar()
    {
        System.out.println(nombre+" está andando");
    }
    
    public void Correr()
    {
        System.out.println(nombre+" está corriendo");
    }
}
