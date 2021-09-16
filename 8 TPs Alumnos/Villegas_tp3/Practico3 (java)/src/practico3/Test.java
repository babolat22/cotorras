/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3;
import java.time.LocalDate;
/**
 *
 * @author Chony
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando las clases
        Registro registro1=new Registro();
        
        Trabajador jonathan = new Trabajador("Jonathan Villegas", "Rosales 123", 35315152, LocalDate.parse("1990-11-3"), 25000);
        Jubilado patricia= new Jubilado("Patricia ", "Orellana 1234", 15234521, LocalDate.parse("1990-11-3"));
    
        registro1.procesarDatos(jonathan);
        registro1.procesarDatos(patricia);
        
    }
    
}
