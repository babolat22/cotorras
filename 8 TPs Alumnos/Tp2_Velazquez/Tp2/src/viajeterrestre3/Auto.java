package viajeterrestre3;

public class Auto extends Vehiculo {
    private double consumo=7;
    
    public Auto(String marca, String patente, Combustible combustible) {
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
