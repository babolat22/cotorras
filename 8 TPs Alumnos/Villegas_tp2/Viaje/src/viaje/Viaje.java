/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje;

/**
 *
 * @author Chony
 */
public class Viaje {
    Peaje peajes;
    Ciudad origen;
    Ciudad destino;
    double distancia;
    Vehiculo vehiculo; 

    public Viaje(Peaje peajes, Ciudad origen, Ciudad destino, Vehiculo vehiculo) {
        this.peajes = peajes;
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
    }

    public Viaje(Peaje peajes, Ciudad origen, Ciudad destino, double distancia, Vehiculo vehiculo) {
        this.peajes = peajes;
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
    }
    
    public double calcularDistancia(){
           distancia=Math.abs(this.origen.km-this.destino.km);
           return distancia;
    }
    
    public double costoPeaje(){
       return peajes.costoEnPeaje();
        
    }
    public double costoCombustible(){
        return vehiculo.calcularCostoDeCombustible(distancia);
    }
    public double costoTotal(){
        return costoCombustible()+costoPeaje();
    }
}