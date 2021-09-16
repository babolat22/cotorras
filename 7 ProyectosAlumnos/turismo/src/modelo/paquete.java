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
public class paquete {
    private int codPaquete;
    private int codAloja;
    private int dni;
    private String descripcion;

    public paquete() {
    }

    public int getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
    }

    public int getCodAloja() {
        return codAloja;
    }

    public void setCodAloja(int codAloja) {
        this.codAloja = codAloja;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
