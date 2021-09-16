/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tootp1;

import javax.swing.JOptionPane;  // dependencia

/**
 *
 * @author Florencia
 */
public class TooTp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Viaje v1,v2,v3;
       double peaje, distancia;
       System.out.println("si km de origen km de destino, tipo de combustible,tipo de vehiculo cantidad de peaje, si es la misma ruta no cambia");
       v1 = new Viaje(12,1500,"nafta","auto",3,"igual");
       
       JOptionPane.showMessageDialog(null, "el costo de peaje: "+String.valueOf((v1.Costo_peaje("nafta", 3))));
       
       JOptionPane.showMessageDialog(null, "el costo de combustible: "+String.valueOf((v1.consumo_combustible("auto","nafta"))));
       peaje=v1.Costo_peaje("nafta",3);
       distancia=v1.getDistancia();
       JOptionPane.showMessageDialog(null, "el costo de combustible: "+String.valueOf((v1.costo_total(distancia, peaje,"auto","nafta",3))));
     
       v2 = new Viaje(1500,"nafta","auto",3,"distinta");
       
       v3=new Viaje();
       v3.setOrigen(0);
       v3.setDestino(800);
       v3.setTipo_combustible("gasoil");
       v3.setTipo_vehiculo("camion");
       v3.setPeaje(4);
       v3.setRuta("igual");
       
       JOptionPane.showMessageDialog(null, "el costo de peaje: "+String.valueOf((v3.Costo_peaje("gasoil", 4))));
       
       JOptionPane.showMessageDialog(null, "el costo de combustible: "+String.valueOf((v3.consumo_combustible("camion","gasoil"))));
       JOptionPane.showMessageDialog(null,"km destino de viaje 3 "+String.valueOf(v3.getDestino()));
    }
    
}
