/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Jannete
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Robot robot1 = new Robot();
                
        Scanner scan = new Scanner(System.in);
        
        int cantidadPasos = 0;
        
        while(robot1.isEncendido()){
            
            
        
            System.out.println("Que desea hacer: ");

            System.out.println("Avanzar");

            System.out.println("Retroceder");

            System.out.println("Energia");

            System.out.println("Dormir");

            System.out.println("Recargar");

            String accion = scan.next().toLowerCase();

            if (accion.equals("avanzar") || accion.equals ("retroceder")){

                System.out.println("Ingresar cantidad de pasos: ");

                cantidadPasos = scan.nextInt();
                
            }
     

            Hombre hombre1 = new Hombre(robot1);

            hombre1.jugarConRobot(robot1,cantidadPasos,accion);
        
        }
           
    }
    
}
        
