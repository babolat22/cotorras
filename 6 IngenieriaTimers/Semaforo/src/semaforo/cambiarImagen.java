/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;


/**
 *
 * @author juanj
 */
public class cambiarImagen {
    static int contador =0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int velocidad =2000;  // en milisegundos =2seg
        Timer timer = new Timer();
        TimerTask tarea;
        frmSemaforo semaforo = new frmSemaforo();
        semaforo.setVisible(true);
        
        tarea = new TimerTask() {
            @Override
            public void run() {
                    Icon icono;
                    switch(contador){
                        case 0:
                            contador=1;
                            icono=new ImageIcon(getClass().getResource("/iconos/verde.png"));
                            semaforo.lblSemaforo.setIcon(icono);
                            break;
                        case 1:
                           contador=2;
                            icono=new ImageIcon(getClass().getResource("/iconos/amarillo.png"));
                            semaforo.lblSemaforo.setIcon(icono);
                            break;
                        case 2:
                            contador=0;
                            icono=new ImageIcon(getClass().getResource("/iconos/rojo.png"));
                            semaforo.lblSemaforo.setIcon(icono);
                            break;
                    } 
                 
            }
           
        };
        
        timer.scheduleAtFixedRate(tarea,2,velocidad);
    }
    
}
