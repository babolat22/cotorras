package tp2;

public class Combustible {

    private double precio;

    private String tipoCombustible;

    public Combustible(double p, String tipo) {
        this.precio = p;
        this.tipoCombustible = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    
}
