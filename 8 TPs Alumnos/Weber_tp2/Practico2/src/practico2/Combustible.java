package practico2;

public class Combustible {
    
    protected String tipo;
    protected double precio;
    
    public Combustible(String tipo, double precio){
        this.tipo   =tipo;
        this.precio =precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
}
