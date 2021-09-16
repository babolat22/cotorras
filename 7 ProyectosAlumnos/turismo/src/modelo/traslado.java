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
public class traslado {
    private int codTras=-1;
    private String tipo;
    private int maxPersonas;
    private double costoKilom;

    public traslado() {
    }

    public int getCodTras() {
        return codTras;
    }

    public void setCodTras(int codTras) {
        this.codTras = codTras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public double getCostoKilom() {
        return costoKilom;
    }

    public void setCostoKilom(double costoKilom) {
        this.costoKilom = costoKilom;
    }
    
}
