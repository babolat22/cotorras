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
public class Camion extends Vehiculo{

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    double calcularCostoDeCombustible(double distancia) {
        return (combustible.getPrecio()*(distancia*0.12)) ;
    }
    
}
