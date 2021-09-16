/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Admin
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Padre p=new Padre("Lopez");
        Hijo h= new Hijo("Juan Carlos", p.getNombre());
        h.jugarFutbol();
        h.bailar();
        h.cantar();
        h.getAuto().avanzar(100);
        h.getCasa().getZona();
        h.heredarDinero(4000000);
        
        
    }
    
}
