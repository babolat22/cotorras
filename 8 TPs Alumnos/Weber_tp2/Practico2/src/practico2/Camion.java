package practico2;

public class Camion extends Vehiculo{
    
    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
        costoPeaje=100;
    }

    @Override
    public double calcularCostoCombustible(double distancia) {
        return distancia*(0.12*combustible.getPrecio());
    }
    
}