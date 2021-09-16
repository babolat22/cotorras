/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico3.entidades;

import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class Jubilado extends Persona{

    public Jubilado(String nombre, int dni, LocalDate fechaNac, String domicilio, String tipo) {
        super(nombre, dni, fechaNac, domicilio, tipo);
    }
    
    public void cobrar(){
        System.out.println("Cobrar mi jubilacion");
    }
}
