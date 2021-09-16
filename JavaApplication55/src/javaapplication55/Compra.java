/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juanj
 */
public class Compra {
    private int codFactura=-1;
    private LocalDate fecha;
    private List<lineaDetalle> lineas = new ArrayList<>();
    private double monto=0;

    /* public Compra(ArrayList<Producto> lp, int cantidad) {
          this.fecha = LocalDate.now();
          int nro=1;
          for (Producto prod : lp) {
             lineaDetalle ld = new lineaDetalle(nro, prod, cantidad);
             lineas.add(ld);
             nro++;
          }
    }*/
    
    public Compra(LinkedHashMap<Integer, Producto> lineasCompra) {
          this.fecha = LocalDate.now();
          int nro=1;
          // Imprimimos el Map con un Iterador
            Iterator it = lineasCompra.keySet().iterator();
          while(it.hasNext()){
            Integer key = (Integer) it.next();
              
            lineaDetalle ld = new lineaDetalle(nro, lineasCompra.get(key), key);  // creo la linea con nro, Prod, cantidad
            lineas.add(ld);                                                       // agrego la linea
            System.out.println("Cantidad: " + key + " -> Producto: " + lineasCompra.get(key));
            nro++;
          }
          
            for (lineaDetalle linea : lineas) {
                System.out.println(linea);     
            }
    }
    
    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<lineaDetalle> getLineas() {
        return lineas;
    }

    public void setLineas(List<lineaDetalle> lineas) {
        this.lineas = lineas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
