package viajeterrestre3;

public class Combustible {

    private String tipoDeCombustible;

    private double precio;
                                //nafta           //50 80 
    public Combustible(String tipoDeCombustible, double precio) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.precio = precio;
    }


    public String getTipo() {
        return tipoDeCombustible;
    }

    public double getPrecio() {
        return precio;
    }
}
