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
public class Camion extends Vehiculo{
    int consumo = 12 ;
    

    public Camion(String xMarca, String xPatente, Combustible xCombustible) {
        super(xMarca, xPatente, xCombustible);
    }
    
    @Override
    int getConsumo (){
        return consumo;
    }
    
    
}
