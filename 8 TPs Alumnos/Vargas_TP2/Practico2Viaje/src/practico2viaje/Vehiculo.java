package practico2viaje;

public abstract class Vehiculo {
    
    private String marca;

    private String patente;

    private Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public abstract double calcularCostoDeCombustible(double distancia);
        
  
}
