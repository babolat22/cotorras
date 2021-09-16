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
public class lineaDetalle {
    private int nro;
    private Producto producto;
    private int cant;
    private double subtotal;

    public lineaDetalle(int nro, Producto producto, int cant) {
        this.nro=nro;
        this.producto = producto;
        this.cant = cant;
        this.subtotal = calcularSubtotal();
        
    }

    public double calcularSubtotal(){
        this.subtotal = this.producto.getPrecioUnitario()* cant;
        return subtotal;
    }

    @Override
    public String toString() {
        return "lineaDetalle{" + "nro=" + nro + ", producto=" + producto + ", cant=" + cant + ", subtotal($)=" + subtotal + '}';
    }


}
