/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;

/**
 *
 * @author juanj
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precioUnitario;

    public Producto() {
    }

    
    public Producto(int codigo, String nombre, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public Producto buscar(int codigo){
        if (this.codigo == codigo)
           return this;
        else 
           return null;
    }

    @Override
    public String toString() {
        return nombre + " - " + precioUnitario+"$";
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
