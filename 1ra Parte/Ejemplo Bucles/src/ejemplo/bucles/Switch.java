/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.bucles;

import java.util.Scanner;

/**
 *
 * @author juanj
 */

public class Switch {
    public static void main(String[] args)    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese opcion: (1) IDI, 2(ICA), (3) ICT, (4) Otros/UNTREF");
        
        String instituto = "IDI";  // IDI, ICT, ICA;
        instituto = sc.nextLine();
        int año = 2;
                switch (instituto){ // switch anidado
                
                    case "IDI":
                    case "ICA":
                        System.out.println("Materias : Semiotica, Lengua");
                        break;
                    case "ICT":
                        switch(año){
                            case 2:
                                System.out.println("Materias : Labo1, Ingles, EDA, MateI");
                                break;
                            case 1:
                                System.out.println("Materias : Mumuki-Programacion 1");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Tecnicas de estudio");
                }
    }			
}

