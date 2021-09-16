package practico2;

public class Ciudad {
    protected String nombre;
    protected double km;
    protected int ruta;
    
    public Ciudad(String nombre,double km,int ruta){
        this.nombre =nombre;
        this.km     =km;
        this.ruta   =ruta;
    }

    public double getKm() {
        return km;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRuta() {
        return ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
    
}
