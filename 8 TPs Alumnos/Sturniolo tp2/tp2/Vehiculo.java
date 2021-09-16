package tp2;

public abstract class Vehiculo {

    private String marca;

    private String patente;

    private Combustible combustible;

    public Vehiculo(String m, String p, Combustible c) {
        //puse los this por convencion, si bien no hacen falta(y tmb decicidi hablar como Yoda XD)
        this.marca = m;
        this.patente = p;
        this.combustible = c;
    }

    public abstract double calcularCostoDeCombustible(double distancia);
    public abstract double getCuotaPeaje(); 

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

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    
}
