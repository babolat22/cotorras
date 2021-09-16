/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieria;

/**
 *
 * @author juanj
 */
public class Cliente {
       private int dni;
       private String nombre;

    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
       
}
