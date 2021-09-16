/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3_velazquez;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ulp
 */
public class Practico3_velazquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registro r1= new Registro();
         Trabajador t1 = new Trabajador("Mauri",37639812,"07-11-1993","Hornero",25000);
        
        Jubilado j1 = new Jubilado("Carlos",11600074,"08-11-2000","Hornero 2");
        
        r1.procesarDatos(t1);
        r1.procesarDatos(j1);
    }
  
    
}
