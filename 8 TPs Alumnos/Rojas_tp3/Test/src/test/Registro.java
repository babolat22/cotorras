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
public class Registro {
    void procesarDatos(Persona xPersona){
        if (xPersona.getClass() == Trabajador.class){
            
            
            
            
            
            System.out.println(xPersona.getNombre());
            System.out.println(xPersona.calcularEdad());
            xPersona.cobrar();
            
        }
        else{
            System.out.println(xPersona.getNombre());
            System.out.println(xPersona.calcularDiasVividos());
            xPersona.cobrar();
        }
    }
}
