
package timers;
import java.util.Timer;
import java.util.TimerTask;

public class Timers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){
            int tic=0;
            @Override
            public void run() {
               if (tic%2==0)
                   System.out.println("Tic...");
               else
                   System.out.println("Toc!");
               tic++;
            }
            
        };
        timer.schedule(task,20,2000);   // tarea, retraso, intervalo
        //le pasamos tarea, el tiempo a partir cuando empieza, y cada cuanto se ejecuta
        //valores en milisegundos
    }
    
}
