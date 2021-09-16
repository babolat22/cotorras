/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico2;

/**
 *
 * @author kevin
 */
public abstract class Vehiculo {
    
    private String marca;
    private String patente;
    private int costPeaje;
    protected Combustible combustible;

    public Vehiculo(String marca, String patente, int costPeaje, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.costPeaje = costPeaje;
        this.combustible = combustible;
    }

    

    

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public int getCostPeaje() {
        return costPeaje;
    }
    
    public abstract double calcularCostoCombustible(int distancia);
}
