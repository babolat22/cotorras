package ejemplo.bucles;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class EjemploBucles {
    /**
     * @param args the command line arguments
     */
 
    public static void main(String args[])
    {
        int x = 1;
        boolean encuentro;
         // Salir cuando x llega a ser mayor que 4
        while (x <= 4) {
            System.out.println("Valor de x: " + x);
             //incrementa el valor de x para la siguiente iteración
            encuentro = true;
            x++;
        }
    
        for (int i = 2; i <= 4; i++)
            System.out.println("Valor de i: " + i);
        int nros[][] ={{2,2},{3,3},{1,4}};
        String personajes[] = {"Ron", "Harry", "Hermione"};
        //mejorado para for
        for (String p : personajes) {
            System.out.println("El personaje es " + p);
        }
        
        
        int  matriz1[][] = new int[8][6];
        int[][] matriz = new int[7][7];
        
        //bucle for para la misma función
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
      
        int numerito = 21;
        do {
           //El código dentro del do se imprime incluso si la condición es falsa
            System.out.println("Valor de numerito :" + numerito);
            numerito++;
        } while (numerito < 20);
        
        int entrada; 
        Scanner sc = new Scanner(System.in);     // por consola
        do {
            System.out.println("Valor de nuevo!");
            entrada = sc.nextInt();
        } while (entrada <0 || entrada > 10);
        
          System.out.println("Valor correcto!");      
        // OJO! BUCLE INFINITO porque la condición no es apta
        // la condición; debería haber sido num>0.
        for (int num = 5; num != 0; num -= 2){
            System.out.println(num);
        }
      
    int var = 5; 
        // OJO! bucle infinito porque la actualización
        // no se proporciona
    boolean b = true;
        while (b)
        {
            System.out.println("En el bucle...forever");
           // b=false;
        }
      
    }

    
    
    
    
}
