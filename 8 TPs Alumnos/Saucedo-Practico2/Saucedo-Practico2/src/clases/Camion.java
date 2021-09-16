package clases;

public class Camion extends Vehiculo {

    public Camion(String m, String p, Combustible c) {
        super(m, p, c);
        costoPeaje=200;
    }

    @Override
    protected double calcularCostoDeCombustible() {
        return 0.12 * combustible.getPrecio();
    }
}
