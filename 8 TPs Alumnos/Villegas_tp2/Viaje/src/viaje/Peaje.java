/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje;

/**
 *
 * @author Chony
 */
public class Peaje {
    
    int cantPeaje;
    double precio;

    public Peaje( int cantPeaje, double precio) {
        
        this.cantPeaje = cantPeaje;
        this.precio = precio;
    }

    Peaje() {
        
    }

    public int getCantPeaje() {
        return cantPeaje;
    }

    public void setCantPeaje(int cantPeaje) {
        this.cantPeaje = cantPeaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double costoEnPeaje(){
    return cantPeaje*precio;
    }
}
