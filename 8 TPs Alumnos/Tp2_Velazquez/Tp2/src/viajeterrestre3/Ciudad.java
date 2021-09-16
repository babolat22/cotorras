package viajeterrestre3;

public class Ciudad {

    private double km;

    private double ruta;


    public Ciudad(int km, int ruta) {
        this.km = km;
        this.ruta = ruta;
    }

    public double getKm() {
        return km;
    }

    public double getRuta() {
        return ruta;
    }
}
