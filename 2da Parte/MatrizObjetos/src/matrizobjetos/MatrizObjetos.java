package matrizobjetos;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class MatrizObjetos {
    
    public static void main(String[] args) {
        //ejemplo IRREGULAR
        
        int [][] numeros = {{1,2,3,4},{5,6,7},{8}};
       
        for (int[] fila : numeros) { // trabajo con cada elem
            System.out.print("\n");
            for (int e = 0; e < fila.length; e++) {    
               System.out.print(" " + fila[e] + " ");     
            }
        }
        // EJEMPLO DE MESAS
        
        Scanner sc = new Scanner(System.in);
        String madera; double precio;
        Mesa [][] Deposito = new Mesa[2][2];
        for (int i = 0; i < Deposito.length; i++) {
            for (int j = 0; j < Deposito.length; j++) {
                    System.out.println("Madera: ");
                    madera = sc.next();   // alternativa a nextline
                    System.out.println(" ");
                    System.out.println("Precio: ");
                    precio = sc.nextDouble();
                    Deposito[i][j] = new Mesa(madera, precio);
                    System.out.println("Mesa cargada correctamente");
            }
        }
        //MOSTRAR MESAS
        for (int x=0; x < Deposito.length; x++) {
            for (int y=0; y < Deposito[x].length; y++) {
            System.out.println ("[" + x + "," + y + "] = " + Deposito[x][y].toString());
          }
        }
    }
}
