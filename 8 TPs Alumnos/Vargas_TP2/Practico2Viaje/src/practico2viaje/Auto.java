package practico2viaje;


import practico2viaje.Vehiculo;

public class Auto extends Vehiculo {
    
    
    private int peaje = 100; 
    
    private String marca;

    private String patente;

    private Combustible combustible;

    public Auto(String marca, String patente, Combustible combustible) {
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
    
    
    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return   7*distancia/100;//esto es la cantidad de litros que gasta   
    }
}
