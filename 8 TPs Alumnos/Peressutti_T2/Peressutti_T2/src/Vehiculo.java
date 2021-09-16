public abstract class Vehiculo {
    
    private int costoPeaje;
    
    Combustible combustible;

    private String marca;

    private String patente;

    public Vehiculo(int costoPeaje, Combustible combustible, String marca, String patente) {
        this.costoPeaje = costoPeaje;
        this.combustible = combustible;
        this.marca = marca;
        this.patente = patente;
    }

    

    public abstract double calcularCostoDeCombustible(double distancia);

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCostoPeaje() {
        return costoPeaje;
    }

    public void setCostoPeaje(int costoPeaje) {
        this.costoPeaje = costoPeaje;
    }
    
    

}
