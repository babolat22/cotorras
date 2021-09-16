/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajeterrestre3;

/**
 *
 * @author Ulp
 */
public class ViajeTerrestre3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Combustible c1= new Combustible("nafta", 50);
        Auto a1 = new Auto("Peugeot","xxx 01",c1);
        Ciudad sanLuis = new Ciudad(200,7);
        Ciudad villaMer = new Ciudad (100,7);
        Viaje v1= new Viaje(sanLuis,villaMer,2,a1);
        
        System.out.println(v1.costoTotal());
      
      
    }
}
