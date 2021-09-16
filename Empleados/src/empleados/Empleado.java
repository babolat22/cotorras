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
public abstract class Empleado {
    String nombre;
    int dinero;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract int sueldoPorHora();
    public abstract boolean genteACargo();
    int getDinero(){
        return dinero;
    }
    void trabajar(int d){
      dinero += d*sueldoPorHora();
    }
}
