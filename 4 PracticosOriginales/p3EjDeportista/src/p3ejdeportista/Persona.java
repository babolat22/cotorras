/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3ejdeportista;

/**
 *
 * @author juanj
 */
public class Persona {
    
private String nombre;
private int dni;
private int edad;
private String domicilio;
public Persona(String nombre,int dni, int edad ,String domicilio){
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
public void andar(){
System.out.println("Andar como persona " + getNombre());
}
public void correr(){
System.out.println("Correr como persona");
}

}

