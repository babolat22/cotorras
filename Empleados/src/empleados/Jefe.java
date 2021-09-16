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
public class Jefe extends Empleado{
    int sueldo;
    public Jefe(String nombre) {
        super(nombre);
        this.sueldo=50000;
    }
    
   public int sueldoPorHora(){
     return 200;
   }
   public boolean genteACargo(){
     return true;
   }
  
   @Override
   void trabajar(int x){
     this.sueldo += sueldoPorHora()*sueldo; //5*100
   }
}
