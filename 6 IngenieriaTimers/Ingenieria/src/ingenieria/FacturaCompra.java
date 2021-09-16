/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieria;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class FacturaCompra {
    int codigoCompra;
    LocalDate fecha;
    Cliente cliente;
    ArrayList<Planta> clientela = new ArrayList<Planta>();
    double monto;

    public FacturaCompra(int codigoCompra, Cliente cliente, double monto) {
        this.codigoCompra = codigoCompra;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.monto = monto;
    }
    
       
}
