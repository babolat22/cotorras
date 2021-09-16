/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timers;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author juanj
 */
public class TimerFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){
           
            @Override
            public void run() {
                imprimir();
            }
            
            public void imprimir(){
                System.out.println("La tarea se ejecuto en " + new Date());
            }
            
        };
        timer.schedule(task,5000,1000);
    }
    
}
