package viajeterrestre3;

public class Camion extends Vehiculo {
    private double consumo=12;
    public Camion(String marca, String patente, Combustible combustible) {
        super(marca,patente,combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return consumo/100; // 
    }

    @Override
    public int costoPeaje() {
        return 150;
    }

}
