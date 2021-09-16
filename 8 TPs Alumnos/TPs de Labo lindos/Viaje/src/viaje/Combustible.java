/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje;

/**
 *
 * @author Ale
 */
public class Combustible {
    String tipo;
    double precio;
    
    
    public Combustible(String xTipo , double xPrecio){
        this.tipo = xTipo;
        this.precio = xPrecio;
    }
    
    String getTipo (){
        return tipo;
    }
    
    double getPrecio (){
        return precio;
    }
}
