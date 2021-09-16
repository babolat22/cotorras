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
public class Peaje {
    double costoAutoCamioneta;
    double costoCamion;
    Vehiculo xVehiculo;

   void setVehiculo(Vehiculo xVehiculo){
       this.xVehiculo = xVehiculo;
   }
    
    public Peaje(double xCostoAutoCamioneta ,double xCostoCamion){
        this.costoAutoCamioneta = xCostoAutoCamioneta;
        this.costoCamion = xCostoCamion;
        
    }
    
    double CostoPeaje(){
        if (xVehiculo.getClass() == Auto.class || xVehiculo.getClass() == Camioneta.class){
            return this.costoAutoCamioneta;
        } else {
            return this.costoCamion;
        }
        
    }
}
