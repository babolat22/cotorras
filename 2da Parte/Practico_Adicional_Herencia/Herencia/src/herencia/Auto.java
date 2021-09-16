/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Auto {
    private String patente;

    private String color;

    private double combustible;

   

    public Auto() {
        combustible = 50;
    }

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
        combustible = 50;
    }

    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void avanzar(double metros) {
        double necesito = 0.1 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Avanzo " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void retroceder(double metros) {
        double necesito = 0.1 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Retocedio " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void llenarTanque() {
        combustible = 50;
    }

}
