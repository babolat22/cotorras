package practico2;

public class Camioneta extends Vehiculo{
    
    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
        costoPeaje = 57.5;
    }

    @Override
    public double calcularCostoCombustible(double distancia) {
        return distancia*(0.1*combustible.getPrecio());
    }
    
}