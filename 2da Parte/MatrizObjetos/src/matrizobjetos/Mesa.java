package matrizobjetos;

/**
 *
 * @author juanj
 */
public class Mesa {
    private String madera;
    private double precio;

    public Mesa(String madera, double precio) {
        this.madera = madera;
        this.precio = precio;
    }

    public Mesa() {
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mesa{" + "madera=" + madera + ", precio=" + precio + '}';
    }
    
}
