package clases;

public class Auto extends Vehiculo {

    public Auto(String m, String p, Combustible c) {
        super(m, p, c);
        costoPeaje=100;
    }

    @Override
    protected double calcularCostoDeCombustible() {
        return 0.07 * combustible.getPrecio();
    }
}
