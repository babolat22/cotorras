/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieria;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author juanj
 */
public class plantasVivero {
    Set<Planta> plantasVivero = new LinkedHashSet<Planta>();
    
    public void agregarPlanta(Planta p){
        plantasVivero.add(p);
    }
    
    public Set<Planta> ListarPlantas(){
        return plantasVivero;
    }
    
    public Planta buscarPlanta(String nombre){
        Planta plantaObj = null;
        for(Planta p : plantasVivero){
            if (p.getNompre().equals(nombre))
                plantaObj=p;
            else
                System.out.println("No existe la planta "+ nombre);
        }
        return plantaObj;
    }

    public void eliminarPlanta(Planta p) {
        plantasVivero.remove(p);
    }
}
