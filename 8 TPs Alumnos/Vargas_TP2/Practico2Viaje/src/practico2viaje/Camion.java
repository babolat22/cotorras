package practico2viaje;


import practico2viaje.Vehiculo;

public class Camion extends Vehiculo {
    

    private int peaje = 150;
    
    private String marca;

    private String patente;

    private Combustible combustible;

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
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

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public double calcularCostoDeCombustible(double distancia) {
        return 12*distancia/100;//esto es la cantidad de litros que gasta   
    }
}
