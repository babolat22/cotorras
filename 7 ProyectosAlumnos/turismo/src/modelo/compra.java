/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author juanj
 */
public class compra {
    private int codCompra;
    private LocalDate fechaIng;
    private LocalDate fechaEgre;
    private int dni;
    private int codPaquete;

    public compra() {
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public LocalDate getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(LocalDate fechaIng) {
        this.fechaIng = fechaIng;
    }

    public LocalDate getFechaEgre() {
        return fechaEgre;
    }

    public void setFechaEgre(LocalDate fechaEgre) {
        this.fechaEgre = fechaEgre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
    }
    
}
