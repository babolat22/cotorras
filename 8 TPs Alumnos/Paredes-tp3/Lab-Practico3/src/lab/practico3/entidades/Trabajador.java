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
public class Trabajador extends Persona implements Pasivo{
    
    private double sueldo;

    public Trabajador(double sueldo, String nombre, int dni, LocalDate fechaNac, String domicilio, String tipo) {
        super(nombre, dni, fechaNac, domicilio, tipo);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void cobrar(){
        System.out.println("Monto a cobrar " + sueldo);
    }
    
    public void hacerAportes(){
        System.out.println("Aportes");
    };
}
