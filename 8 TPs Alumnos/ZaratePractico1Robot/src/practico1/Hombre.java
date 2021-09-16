/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1;

import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Hombre extends Robot  {
    Scanner entrada=new Scanner (System.in);
    private Robot robot;
    
    public void jugarConRobot(Robot r1){
        do{
        r1.Despertar();
        System.out.println("¿Cantidad de pasos a realizar?");
        int mover =entrada.nextInt();
        r1.avanzar(mover);
        System.out.println("R12 se movio"+" "+mover+" "+"pasos");
       
        
        System.out.println("¿cuantos pasos para retroceder?");
        int retroceder = entrada.nextInt();
        r1.retroceder(retroceder);
        System.out.println("R12 retrocedio"+retroceder+"pasos");
        
        
        System.out.println("Energia actual"+" "+r1.energiaActual());
        
       
        System.out.println("R12 dormir?...se fue a dormir");
         
        r1.Dormir();
        break;
        }while(r1.dormir==true);
        
        
        
    }
    
    
    
}
