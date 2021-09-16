package practico2;

public abstract class Vehiculo {
    
    protected String marca;
    protected String patente;
    protected Combustible combustible;
    
    protected double costoPeaje;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca      = marca;
        this.patente    = patente;
        this.combustible= combustible;
    }

    public abstract double calcularCostoCombustible(double Distancia);

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void setCostoPeaje(double costoPeaje) {
        this.costoPeaje = costoPeaje;
    }
    
}
