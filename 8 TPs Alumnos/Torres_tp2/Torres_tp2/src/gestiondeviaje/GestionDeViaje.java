/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviaje;
import java.util.Scanner;

/**
 *
 * @author Jannete
 */
public class GestionDeViaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Las ciudades estan sobre la misma ruta?");
        Scanner scan = new Scanner(System.in);
        //a la siguiente linea, el toLowerCase()convierte todas las letras en minuscula.
        String question = scan.nextLine().toLowerCase();
        Viaje viaje = new Viaje();
        double distancia = 0;
        
        if(question.equals("si")){
            System.out.println("Ingresa el KM de origen");
            double kmOrigen = scan.nextDouble();
            System.out.println("Ingresa el KM de destino");
            double kmDestino = scan.nextDouble();
            
            distancia = viaje.CalculoDeDistancia(kmOrigen, kmDestino);
            System.out.println("La distancia entre las ciudades es: "+distancia);
            
        }else{
            System.out.println("Ingrese la distancia: ");
            distancia = scan.nextDouble();
        }
        
            System.out.println("En que opcion se encuentra su vehiculo: ");
            System.out.println("1 Auto");
            System.out.println("2 Camioneta");
            System.out.println("3 Camion");
            int vehiculo = scan.nextInt(); 
            //para saltar la linea ya que nextInt() no lo hacia
            scan.nextLine();
            System.out.println("Ingrese marca: ");
            String marca = scan.nextLine();
            System.out.println("Ingrese patente: ");
            String patent = scan.nextLine();
            System.out.println("Ingrese tipo de combustible: ");
            String combust = scan.nextLine();
            
            
            if(vehiculo == 1){
                viaje.setVehiculo(new Auto(marca, patent, combust));
            }
            if(vehiculo == 2){
                viaje.setVehiculo(new Camioneta(marca, patent, combust));
            }
            if (vehiculo == 3){
                viaje.setVehiculo(new Camion(marca, patent, combust));
                    
            }
          

            System.out.println("Ingrese cantidad de peajes: ");
            int cantPeaje = scan.nextInt();
            double peaje = viaje.CalculoDeCostoEnPeaje(viaje.getVehiculo(),cantPeaje);
            System.out.println("Total del peaje es: "+peaje);
            
            System.out.println("El precio del combustible es: ");
            double precioCombustible = scan.nextDouble();
            double costoCombustible = viaje.CalculoCostoCombustible((Vehiculo)viaje.getVehiculo(),distancia,precioCombustible);
            
            System.out.println("El costo total del viaje es: "+ viaje.CalculoCostoTotal(peaje,costoCombustible));
    }   


            
        
    
}
