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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Registro xRegistro = new Registro();
        Persona xJubilado = new Jubilado("Luis Rojas","8654876","1951-02-05","Cortaderas");
        Persona xTrabajador = new Trabajador("Alejandro Rojas","32250615","1986-05-16","Rodeo de los Cocos 1045",15000);
        xRegistro.procesarDatos(xJubilado);
        xRegistro.procesarDatos(xTrabajador);
        
    }
}
