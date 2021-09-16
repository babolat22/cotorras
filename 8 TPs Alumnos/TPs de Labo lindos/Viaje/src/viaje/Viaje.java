/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;



/**
 *
 * @author Ale
 */
public class Viaje {
    Vehiculo xVehiculo;
    ArrayList <Peaje> xPeajes;
    Ciudad ciudadOrigen;
    Ciudad ciudadDestino;
    Scanner myObj = new Scanner(System.in);
    
    public Viaje (Vehiculo xVehiculo , ArrayList xPeajes,Ciudad ciudadOrigen , Ciudad ciudadDestino){
        this.xVehiculo = xVehiculo;
        this.xPeajes = xPeajes;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
    }
    
    int CalculoDeDistancia (){
        if (ciudadOrigen.ruta == ciudadDestino.ruta){
            int x;
            x = Math.abs(ciudadOrigen.km - ciudadDestino.km);
            System.out.println("Kilometros a recorrer: " + x);
            return x;
        }
        else {
            System.out.println("Las ciudades no se encuentran en la misma ruta , por favor ingresar distancia en Km");
            int xKm = parseInt(myObj.nextLine());
            System.out.println("Kilometros a recorrer: " + xKm);
            return xKm;
        }
    }
    
    double CalculoCostoPeajes(){
        double y = 0;
            for (int i = 0; i < xPeajes.size (); i++){
                xPeajes.get(i).setVehiculo(xVehiculo);
                y += xPeajes.get(i).CostoPeaje();
            }
        return y;
    }
    
    double CalculoCostoCombustible(){
        return xVehiculo.calcularCostoDeCombustible(CalculoDeDistancia());
    }
    
    double CalculoCostoTotal(){
        return CalculoCostoPeajes() + CalculoCostoCombustible();
    }
    
    public static void main(String[] args) {
        Combustible xNafta = new Combustible("Nafta",103.98);
        Peaje xPeaje = new Peaje(100,200);
        Peaje xPeaje2 = new Peaje(150,300);
        ArrayList xPeajeL = new ArrayList();
        xPeajeL.add(xPeaje);
        xPeajeL.add(xPeaje2);
        Vehiculo xVehiculo = new Auto("ford","ABC123",xNafta);
        Ciudad xCiudadOrigen = new Ciudad(1,10);
        Ciudad xCiudadDestino = new Ciudad (2,50);
        Viaje xViaje = new Viaje (xVehiculo,xPeajeL,xCiudadOrigen,xCiudadDestino);
        System.out.println("El costo total del viaje es: " + xViaje.CalculoCostoTotal());
    }
    
}
