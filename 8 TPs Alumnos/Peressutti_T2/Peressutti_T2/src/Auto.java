public class Auto extends Vehiculo {
    
    public Auto(int costoPeaje , Combustible combustible, String m, String p) {
        super(costoPeaje , combustible , m , p);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return distancia*combustible.getPrecio();
    }
    
}
