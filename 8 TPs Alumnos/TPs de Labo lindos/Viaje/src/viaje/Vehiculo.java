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
public class Vehiculo {
    String marca;
    String patente;
    Combustible combustible;
    
    public Vehiculo(String xMarca ,String xPatente,Combustible xCombustible){
        this.marca = xMarca;
        this.patente = xPatente;
        this.combustible=xCombustible;
    }
    
    int getConsumo(){
        return 0;
    }
    
    double calcularCostoDeCombustible(double xKm){
        return getConsumo()*this.combustible.getPrecio() * (xKm / 100);
    }
    
    
}
