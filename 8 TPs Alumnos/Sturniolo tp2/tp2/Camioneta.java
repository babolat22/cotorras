package tp2;

public class Camioneta extends Vehiculo {


    public Camioneta(String m, String p, Combustible c) {
        super(m,p,c);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return distancia * 10/100 * super.getCombustible().getPrecio();
    }

    @Override
    public double getCuotaPeaje() {
        return 90;
    }
    
    
}
