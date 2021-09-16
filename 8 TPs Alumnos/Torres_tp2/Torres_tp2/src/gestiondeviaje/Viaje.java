package gestiondeviaje;

import java.lang.Math;

public class Viaje {

    private double lugarOrigen;

    private double lugarDestino;

    private double distancia;

    private String tipoCombustible;

    private int cantPeaje;

    private Object vehiculo;
//Constructor aca inicializa los atributos vacios
    public Viaje() {
        this.lugarDestino=0;
        this.lugarDestino=0;
        this.distancia=0;
        this.tipoCombustible="";
        this.cantPeaje=0;
        this.vehiculo=null;  
    }
//Constructor inicializa con los valores que voy obteniendo
    public Viaje(double lugarOrigen, double lugarDestino, double distancia, String tipoCombustible, int cantPeaje, Object vehiculo) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.distancia = distancia;
        this.tipoCombustible = tipoCombustible;
        this.cantPeaje = cantPeaje;
        this.vehiculo = vehiculo;
    }

    public Object getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Object vehiculo) {
        this.vehiculo = vehiculo;
    }
  

    public double CalculoDeDistancia(double or, double dest) {
        double distancia = or-dest;
       return Math.abs(distancia);
    }

    
    

    public double CalculoDeCostoEnPeaje(Object vehiculo, int cantPeajes) {
        
        double costoTotalPeaje = 0;
        int PEAJE1 = 80;
        int PEAJE2 = 120;
        
        //instanceOf para controlar si son objetos del mismo tipo
        
        if(vehiculo instanceof Auto || vehiculo instanceof Camioneta){
            
            costoTotalPeaje = PEAJE1 * cantPeajes;
        
        }else{
          
            costoTotalPeaje = PEAJE2 * cantPeajes;
            
        }
        
        return costoTotalPeaje;
        
    }

    public double CalculoCostoCombustible(Vehiculo vehiculo, double precio, double distancia) {
        return vehiculo.CalculoCostoCombustible(distancia,precio);
        
        
    }

    public double CalculoCostoTotal(double peaje,double costoCombustible) {
        return peaje+costoCombustible;
    }
}
