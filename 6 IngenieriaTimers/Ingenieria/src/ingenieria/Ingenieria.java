/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieria;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author juanj
 */
public class Ingenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int monto=0;
        ArrayList<Cliente> clientela = new ArrayList<Cliente>();
        ArrayList<Planta> preCompra = new ArrayList<Planta>();
        plantasVivero plantas = new plantasVivero();
        Planta p1 = new Planta(1, "Rosal", 20, 500.0);
        plantas.agregarPlanta(p1);
        Planta p2 = new Planta(1, "Amapola", 50, 200.0);
        plantas.agregarPlanta(p2);
        Planta p3 = new Planta(3, "Geraneos", 100, 40.0);
        plantas.agregarPlanta(p3);
        plantas.buscarPlanta("Geraneos");
        plantas.eliminarPlanta("Geraneos");
        
        Cliente Paula = new Cliente(20156784, "Paula");
        clientela.add(Paula);
        preCompra.add(plantas.buscarPlanta("Rosal"));
        //preCompra.add(plantas.buscarPlanta("Geraneos"));
        preCompra.add(plantas.buscarPlanta("Amapola"));
        for (Planta p : preCompra){
            monto +=p.getPrecio();
        }
        
        RegistrarCompra(Paula, monto);
    
           
    }
    
    public static void RegistrarCompra(Cliente cli, double monto){
        
            
        FacturaCompra fc = new FacturaCompra(0001, cli, monto); 
        System.out.println("Factura de compra creada por: " + monto);
    }
}
