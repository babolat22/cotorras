/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico3;

import java.time.LocalDate;
import lab.practico3.entidades.*;

/**
 *
 * @author kevin
 */
public class LabPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1995, 10, 26);
        Registro reg = new Registro();
        Trabajador trab = new Trabajador(400000,"Kevin", 39137254, fecha,"la punta","trabajador");
        Jubilado jub = new Jubilado("Kevin", 39137254, fecha,"la putan","jubilado");
        
        reg.procesarDatos(trab);
        System.out.println("------------------------------------------------------------");
        reg.procesarDatos(jub);
    }
    
}
