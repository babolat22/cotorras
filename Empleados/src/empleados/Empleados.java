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
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pasante pasante = new Pasante("Sergio", 500);
        System.out.println("Hola: " +pasante.getDinero());
        pasante.trabajar(8);
        System.out.println("despues de trabajar: " +pasante.getDinero());
       // Empleado e = new Empleado();
        Empleado e1 = new Pasante("Sebastian", 450);
        
    }
    
}
