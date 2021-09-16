package tp2;

public class Auto extends Vehiculo {


    public Auto(String m, String p, Combustible c) {
        super(m,p,c);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return distancia * 7/100 * super.getCombustible().getPrecio();
    }

    @Override
    public double getCuotaPeaje() {
        return 90;
    }

   
    
}
