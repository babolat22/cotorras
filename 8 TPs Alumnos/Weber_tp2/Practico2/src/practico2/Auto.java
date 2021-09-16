package practico2;

public class Auto extends Vehiculo{
    
    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
        costoPeaje = 32.5;
    }

    @Override
    public double calcularCostoCombustible(double distancia) {
        return distancia*(0.07*combustible.getPrecio());
    }
    
}
