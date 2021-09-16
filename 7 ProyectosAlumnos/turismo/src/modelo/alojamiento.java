/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juanj
 */
public class alojamiento {
    private int idAloja;
    private String direccion;
    private int cantCamas;        
    private boolean fumadores;
    private double costo;

    public alojamiento() {
    }

    public int getIdAloja() {
        return idAloja;
    }

    public void setIdAloja(int idAloja) {
        this.idAloja = idAloja;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public boolean isFumadores() {
        return fumadores;
    }

    public void setFumadores(boolean fumadores) {
        this.fumadores = fumadores;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
