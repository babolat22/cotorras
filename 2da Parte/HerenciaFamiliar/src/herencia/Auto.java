package herencia;

public class Auto {
    private String patente;
    private String modelo;
    private double combustible;

    public Auto() {
        combustible = 50;
    }

    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        combustible = 50;
    }
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void avanzar(double metros) {
        double necesito = 0.1 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Avanzo " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void retroceder(double metros) {
        double necesito = 0.1 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Retocedio " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void llenarTanque() {
        combustible = 50;
    }

}
