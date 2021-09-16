package p1ejercicio3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class P1ejercicio3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Fecha f = new Fecha(2,2,1908);
        
        LocalDate f0 = LocalDate.now();  // toma la fecha actual
        int anio = f0.getYear();   //2020
        int mes = f0.getMonthValue();   // 3
        int dia = f0.getDayOfMonth(); // 25
        
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
                
        f.calculaEdad(d, 01, 1981);
        // dias con fecha igual o superior
        System.out.printf("Faltan: "+ f.diasQueFaltan(25, 24, 3, 3, 2020, 2020) +" días\n");
        //  dias con fecha pasada
        System.out.printf("Faltan: "+ f.diasQueFaltan(25, 24, 3, 3, 2020, 2017) +" días\n");
        f.diasVividos(3, 1, 1981);
        
        System.out.printf("Faltan: "+ f.diasQueFaltan2(3, 1, 1981) +" días\n");
        System.out.printf("Faltan: "+ f.diasQueFaltan2(9, 10, 1981) +" días\n");
    }
    
}
