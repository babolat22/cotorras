public class Camioneta extends Vehiculo {

    public Camioneta(int costoPeaje ,Combustible combustible, String m, String p) {
        super(costoPeaje , combustible , m , p);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return distancia*combustible.getPrecio();
    }
}
