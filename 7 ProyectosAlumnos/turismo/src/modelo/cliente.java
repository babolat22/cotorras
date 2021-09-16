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
public class cliente {
    private int id = -1;

    public int getId() {
        return id;
    }
    private int dni;
    private String nombreApe;
    private int celular;

    public cliente() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
}
