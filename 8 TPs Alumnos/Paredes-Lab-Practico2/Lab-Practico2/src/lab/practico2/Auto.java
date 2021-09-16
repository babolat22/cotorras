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
public class Auto extends Vehiculo{

    public Auto(String marca, String patente, int costPeaje, Combustible combustible) {
        super(marca, patente, costPeaje, combustible);
    }

    
    
    @Override
    public double calcularCostoCombustible(int distancia){
        return (distancia * 0.07) * combustible.getPrecio();
    }
    
}
