
package viaje;

/**
 *
 * @author Chony
 */
public class Combustible {
    
    private String tipo;
    
    private double precio;

    public Combustible(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

  
    public double getPrecio() {
        return precio;
    }

  
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
