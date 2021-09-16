package gestiondeviaje;

public class Camion extends Vehiculo {
    
    int CANTLTS = 12;

    public Camion() {
    }
    
    

    public Camion(String marca, String patente, String combustible) {
        super(marca, patente, combustible);
    }

    public double CalculoCostoCombustible(double distancia,double precio) {
        return (CANTLTS*distancia/100)*precio;
    }
}
