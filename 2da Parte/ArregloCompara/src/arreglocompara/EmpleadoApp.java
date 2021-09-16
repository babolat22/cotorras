/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglocompara;

/**
 *
 * @author juanj
 */
public class EmpleadoApp {
 
    public static void main(String[] args) {
 
        Empleado empleados[]=new Empleado[3];
        empleados[0]=new Empleado(); //generico
        empleados[2]=new Repartidor(); //especifico
        //empleados[1]=new Desempleado();
       
        // para buscar lugar vacío en array
        int x = 0; boolean disponible=false;
        while(x < empleados.length && !disponible){
            if(empleados[x] == null) {
                empleados[x]=new Comercial(); //especifico
                disponible = true;  // condicion de corte
                System.out.println("Lugar " + x +" disponible. Se inserto el empleado");
            }else System.out.println("Lugar "+ x + " Ocupado");
            // En listas podemos usar if(nombres.size() == 0) { } 
            // o bien, if(nombres.isEmpty()) { 	System.out.println("Lista vacia."); }

            x++;
        }
        for(int i=0;i<empleados.length;i++){
            
            if(empleados[i] instanceof Empleado){
                System.out.println("El objeto en el indice "+i+" es de la clase Empleado");
            }
            if(empleados[i] instanceof Comercial){
                System.out.println("Este empleado "+i+" es de la clase Comercial");
            }
            if(empleados[i] instanceof Repartidor){
                System.out.println("Este empleado "+i+" es de la clase Repartidor");
            }
        }
    }
 
}
class Empleado{
}
class Repartidor extends Empleado{
}
class Comercial extends Empleado{
}
class Desempleado{
}

