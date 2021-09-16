/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tootp1;

import javax.swing.JOptionPane;

/**
 *
 * @author Florencia
 */
public class Viaje {

    private double origen;  // km  origen 
    private double destino; // km             
    private double distancia=0.0;   //misma ruta=1890
    private String tipo_combustible;  //nafta o gasoil
    private String tipo_vehiculo; //auto 7,camioneta 10,camion 12
    private int peaje;  //10,12,14
    private String ruta;  // no es necesario

    public Viaje() {
    }
    
    
    public Viaje(double distancia, String tipo_combustible, String tipo_vehiculo, int peaje, String ruta) {
        this.distancia = distancia;
        this.tipo_combustible = tipo_combustible;
        this.tipo_vehiculo = tipo_vehiculo;
        this.peaje = peaje;
        this.ruta = ruta;
    }

    public Viaje(double origen, double destino, String tipo_combustible, String tipo_vehiculo, int peaje, String ruta) {
        this.origen = origen;
        this.destino = destino;
        this.tipo_combustible = tipo_combustible;
        this.tipo_vehiculo = tipo_vehiculo;
        this.peaje = peaje;
        this.ruta = ruta;
        this.distancia=origen-destino;
    }

    public double getOrigen() {
        return origen;
    }

    public void setOrigen(double origen) {
        this.origen = origen;
    }

    public double getDestino() {
        return destino;
    }

    public void setDestino(double destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public void Calculo_Distancia(){
        if (distancia==0.0)
            distancia=destino-origen;
    }
    public double consumo_combustible(String tipo_vehiculo, String tipo_combustible){
        
        if (tipo_vehiculo.equals("auto"))
        {
            if  (tipo_combustible.equals("nafta"))
                return (distancia*7)/100;
            else return (distancia*5)/100;
        }
        else if (tipo_vehiculo.equals("camioneta"))
        { 
            if (tipo_combustible.equals("nafta"))
               return (distancia*9)/100;
            else return (distancia*7)/100;
        }
        else{
            if (tipo_combustible.equals("nafta"))  // si camion
               return (distancia*11)/100;
            else return (distancia*9)/100;
        }
   }
    
    public double Costo_peaje(String tipo_vehiculo, int cant_peaje){
        if (tipo_vehiculo.equals("auto"))
            return 12.25*cant_peaje;
        else if (tipo_vehiculo.equals("camioneta"))
            return 20.34*cant_peaje;
        else
            return 52.34*cant_peaje;
     }
    
    public double costo_total (double distancia,double peaje, String tipo_vehiculo, String tipo_combustible, int cant_peaje){
        double temp= this.getDistancia() *this.consumo_combustible(tipo_vehiculo, tipo_combustible)+this.Costo_peaje(tipo_vehiculo, cant_peaje);
        JOptionPane.showMessageDialog(null, "el costo total es: "+String.valueOf((temp)));
    
        return this.consumo_combustible(tipo_vehiculo, tipo_combustible) + Costo_peaje(tipo_vehiculo,cant_peaje);
     }
}