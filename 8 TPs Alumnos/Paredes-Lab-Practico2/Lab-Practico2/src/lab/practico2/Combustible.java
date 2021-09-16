/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico2;

/**
 *
 * @author kevin
 */
public abstract class Combustible {
    
    private int precio = 30;
    private String nombre = "asd";
    
    public Combustible(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
}
