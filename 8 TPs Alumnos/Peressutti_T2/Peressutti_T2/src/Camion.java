public class Camion extends Vehiculo {

    public Camion(int costoPeaje , Combustible combustible, String m, String p) {
        super(costoPeaje , combustible , m , p);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return distancia*combustible.getPrecio();
    }
}
