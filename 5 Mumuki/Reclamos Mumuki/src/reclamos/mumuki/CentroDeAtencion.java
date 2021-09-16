/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reclamos.mumuki;

import java.util.LinkedList;
import java.util.List;

public class CentroDeAtencion {
 
  LinkedList<Reclamo> reclamados = new LinkedList<>(); // aca agrego todos
 
  public void aceptarReclamo(Reclamo r){
        r.agregate(reclamados); // polimorfismo
  
  }
 
  public List<Reclamo> mostrarReclamos(){
     return reclamados;
  }
    
  public static void main(String[] args) {
        // TODO code application logic here
        Reclamo r1 = new ReclamoComun("Falta una birome");
        Reclamo r2 = new ReclamoPrioritario("Incendio Total!!!!");
        Reclamo r3 = new ReclamoPrioritario("La pamdemia ha llegado la oficina!!");
        CentroDeAtencion centro = new CentroDeAtencion();
        Reclamo r4 = new ReclamoComun("incendio", "pandemia");
        
        centro.aceptarReclamo(r2);
        centro.aceptarReclamo(r1);
        centro.aceptarReclamo(r3);
        List<Reclamo> listaRecibida = centro.mostrarReclamos();
        for(Reclamo r : listaRecibida){
            System.out.println("Elemento: "+ r.getNombre());
        }
       
  }
        
  }

///-----------------------------------------------------------------
interface Reclamo {
    void agregate(LinkedList<Reclamo> reclamados);// implementenme!!!
    public String getNombre();
}

interface Reclamo2 {
     final String prioridad = "A"; 
}
//------
class ReclamoComun implements Reclamo{
    public String nombre;
    public ReclamoComun(String nombre){
         this.nombre=nombre;
    }
    public ReclamoComun(String nombre, String reclamoadicional){
    }
    public void agregate(LinkedList<Reclamo> reclamados){  //polimorfismo
        reclamados.addLast(this);
    }

    public String getNombre() {
        return nombre;
    }
    
}
//---------------------------------------------
class ReclamoPrioritario implements Reclamo, Reclamo2 {
    public String nombre;

    public ReclamoPrioritario(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregate(LinkedList<Reclamo> reclamados){  //polimorfismo
        reclamados.addFirst(this);
    }

    public String getNombre() {
        return nombre;
    }
    
}