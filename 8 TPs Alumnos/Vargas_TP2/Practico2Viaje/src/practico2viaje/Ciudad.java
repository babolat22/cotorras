
package practico2viaje;


public class Ciudad {
    private String nombre;
    private int ruta;
    private int km;

    public Ciudad(String nombre, int ruta, int km) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
            
    
}
