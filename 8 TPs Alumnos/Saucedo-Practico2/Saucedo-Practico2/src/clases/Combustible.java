package clases;

public class Combustible {

    private String tipo;
    private double precio;

    public Combustible(String t, double p) {
        tipo = t;
        precio = p;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String a) {
        tipo = a;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float a) {
        precio = a;
    }
}
