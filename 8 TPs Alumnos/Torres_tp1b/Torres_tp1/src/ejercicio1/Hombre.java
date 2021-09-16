/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Jannete
 */
public class Hombre {

    public Hombre(Robot robot) {
        
    }

    public Hombre() {
    }
    
    /*
     Método que juega con robot y tiene todas las acciones y relaciones con el mismo
     Recibe 3 parametros     
    */
    public void jugarConRobot(Robot robot, int cantPasos, String accion) {
        
        //Aca chequeo si el robot esta encendido
       
        if(robot.isEncendido()){
          switch(accion){
            //Equals se encarga de comparar si dos objetos son iguales
              case "avanzar":
               robot.Avanzar(cantPasos); 
                 break;
              case "retroceder":
               robot.Avanzar(20); 
                 break;
              case "energia":
                System.out.println(robot.energiaActual());  
                 break;
              case "recargar":
                robot.Recargar();
                break;
              case "dormir":
                robot.Dormir();
            }
      
     
       }
    }
}
    
 
    

