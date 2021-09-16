package clases;

public class Camioneta extends Vehiculo {

    public Camioneta(String m, String p, Combustible c) {
        super(m, p, c);
        costoPeaje=100;
    }

    @Override
    protected double calcularCostoDeCombustible() {
        return 0.1 * combustible.getPrecio();
    }
}
