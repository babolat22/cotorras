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
public class Jubilado extends Persona {

    public Jubilado(String xNombre, String xDNI, String xFechaNacimiento, String xDomicilio) {
        super(xNombre, xDNI, xFechaNacimiento, xDomicilio);
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilacion.");
    }
    
    
    
    
}
