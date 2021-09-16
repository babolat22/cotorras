/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ale
 */
public class Trabajador extends Persona implements xInterface{
    double sueldo;

    public Trabajador(String xNombre, String xDNI, String xFechaNacimiento, String xDomicilio,double xSueldo) {
        super(xNombre, xDNI, xFechaNacimiento, xDomicilio);
        this.sueldo = xSueldo;
    }
    
    double getSueldo (){
        return sueldo;
    }
    
    void setSueldo(double xSueldo){
        this.sueldo = xSueldo;
    }
    
    @Override
    public void cobrar() {
       System.out.println("Monto a cobrar " + sueldo);
    }

    @Override
    public void hacerAportes() {
        
    }
    
    
    
    
    
    
}
