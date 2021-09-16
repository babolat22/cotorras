package tp2;

public class Camion extends Vehiculo {


    public Camion(String m, String p, Combustible c) {
        super(m,p,c);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return distancia * 12/100 * super.getCombustible().getPrecio();
    }

    @Override
    public double getCuotaPeaje() {
        return 125;
    }
}
