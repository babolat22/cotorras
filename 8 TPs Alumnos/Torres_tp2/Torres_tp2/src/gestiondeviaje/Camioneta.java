package gestiondeviaje;

public class Camioneta extends Vehiculo {
    
    int CANTLTS = 10;

    public Camioneta() {
    }
    
    

    public Camioneta(String marca, String patente, String combustible) {
        super(marca, patente, combustible);
    }

    public double CalculoCostoCombustible(double distancia,double precio) {
        return (CANTLTS*distancia/100)*precio;
    }
}
