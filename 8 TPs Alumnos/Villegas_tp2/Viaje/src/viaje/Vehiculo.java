
package viaje;

/**
 *
 * @author Chony
 */
abstract class Vehiculo {
    //atributos de la clase
    String marca,patente;
    Combustible combustible;
 
    

    /**
     *
     * @param marca
     * @param patente
     * @param combustible
     */
    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible=combustible;
       
    }

    abstract double calcularCostoDeCombustible(double distancia);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

}
