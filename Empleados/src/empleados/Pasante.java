/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author juanj
 */
public class Pasante extends Empleado{
   private int dinero=0;  //0
   
   public Pasante(String nombre, int cant){
       super(nombre);
       this.dinero = cant;
   }
  
   @Override
   public int sueldoPorHora(){
     return 100;
   }
   
   @Override
   public boolean genteACargo(){
     return false;
   }
  
         
}
