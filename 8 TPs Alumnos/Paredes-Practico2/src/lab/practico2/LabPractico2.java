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
public class LabPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ciudad a = new Ciudad("Santio de Chile", 147, 120);
        Ciudad b = new Ciudad("San luis", 3, 50);
        Ciudad c = new Ciudad("BS AS", 147, 50);
        
        Nafta naf = new Nafta();
        Diesel die = new Diesel();
        
        Auto autito = new Auto("toyota", "asd123", 50, naf);
        Camion camion = new Camion("BMW", "QWE321", 120, die);
        
        Viaje viaje = new Viaje(a, b, 4, naf, camion);
        Viaje viaje2 = new Viaje(a, c, 5, die, autito);
        
        System.out.println("Costo del viaje total " + viaje.costoTotal());
        
        System.out.println("Costo del viaje total " + viaje2.costoTotal());
    }
    
}
