package clases;

public abstract class Vehiculo {

    protected String marca;
    protected String patente;
    protected Combustible combustible;
    protected int costoPeaje;

    protected Vehiculo(String m, String p, Combustible c) {
        marca = m;
        patente = p;
        combustible = c;
    }

    protected abstract double calcularCostoDeCombustible();

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String a) {
        marca = a;
    }

    protected String getPatente() {
        return patente;
    }

    protected void setPatente(String a) {
        patente = a;
    }

    protected Combustible getCombustible() {
        return combustible;
    }

    protected void setCombustible(Combustible a) {
        combustible = a;
    }

    protected int getCostoPeaje() {
        return costoPeaje;
    }
}
