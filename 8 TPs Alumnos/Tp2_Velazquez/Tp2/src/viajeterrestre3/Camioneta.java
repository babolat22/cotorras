package viajeterrestre3;

public class Camioneta extends Vehiculo {
     private double consumo=10;
    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca,patente,combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return consumo/100;
    }

    @Override
    public int costoPeaje() {
        return 100;
    }

    
}
