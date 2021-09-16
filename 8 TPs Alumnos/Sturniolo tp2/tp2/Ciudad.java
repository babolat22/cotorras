package tp2;

public class Ciudad {

    private String nombre;

    private int km;

    private int ruta;

    public Ciudad(String nom, int k, int r) {
        this.nombre = nom;
        this.km = k;
        this.ruta = r;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    
}
