/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autojunit;

/**
 *
 * @author juanj
 */
public class AutoJUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
           auto a = new auto("Audi A3", 10000);
           auto.impuesto = 20f;
           System.out.println("Precio Final: "+ a.precioFinal(10f));  // con 10% de desc
    }
    
}
