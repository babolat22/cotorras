package clases;

public class Ciudad {
    private final String nombre;
    private int km;

    public Ciudad(String n, int k) {
        nombre=n;
        km = k;
    }

    public String getNombre() {
        return nombre;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

}
