/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico2;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Viaje {
    
    private Ciudad lugarOrigen;
    private Ciudad lugarDestino;
    private int cantPeajes;
    private Combustible combustible;
    private Vehiculo vehiculo;
    private int distancia;
    Scanner sr = new Scanner(System.in);

    public Viaje(Ciudad lugarOrigen, Ciudad lugarDestino, int cantPeajes, Combustible combustible, Vehiculo vehiculo) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.cantPeajes = cantPeajes;
        this.combustible = combustible;
        this.vehiculo = vehiculo;
        calculoDistancia();
    }
    
    public Viaje(Ciudad lugarOrigen, Ciudad lugarDestino, int cantPeajes, Combustible combustible, Vehiculo vehiculo, int distancia) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.cantPeajes = cantPeajes;
        this.combustible = combustible;
        this.vehiculo = vehiculo;
        this.distancia = distancia;
    }
    
    
    public void calculoDistancia(){
        int a;
        if(lugarOrigen.getNumRuta() == lugarDestino.getNumRuta()){
            distancia = lugarOrigen.getKlm() - lugarDestino.getKlm();
        }else{
            System.out.println("No estan en la misma ruta ingrese la distancia");
            a = sr.nextInt();
            distancia = a;
        }
    }
    
    public int costoPeajes(){
        
        return vehiculo.getCostPeaje() * cantPeajes;
    }
    
    public double costoCombustible(){
        return vehiculo.calcularCostoCombustible(distancia);
    }
    
    public double costoTotal(){
        return costoPeajes() + costoCombustible();
    }
}
