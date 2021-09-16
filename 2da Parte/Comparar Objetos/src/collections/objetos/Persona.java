/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.objetos;

/**
 *
 * @author juanj
 */
public class Persona implements Comparable {
    private int dni;
    private String nombre;

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    public Persona(int dni,String nombre){
        this.dni=dni;this.nombre=nombre;
    }
    @Override
    public String toString(){
        return dni+" "+nombre;
    }
    @Override
    public int compareTo(Object ob){
        int doc =((Persona)ob).dni;
        return dni < doc ?-1 :(dni==doc ?0:1); 
    }
}
