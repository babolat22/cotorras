package ejseñoradelosgatos;
import java.util.ArrayList;
/**
 *
 * @author juanj
 */
public class Dueño {
    private String nombre;
    private int edad;
    private final ArrayList<Mascota> mascotas = new ArrayList();  // este

    public ArrayList<Mascota> verMascotas() {
        return mascotas;
    }
    
    public void adoptarMascota(Mascota m){
        this.mascotas.add(m);
    }
    public Dueño(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
