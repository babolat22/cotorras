package ejseñoradelosgatos;
/**
 *
 * @author juanj
 */
public abstract class Mascota {
    protected String nombre;
    protected int edad;
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    protected abstract void Chivatear();  //quiero que se herede y implemente
    protected abstract void sePuedeVacunar(); //quiero que se herede y implemente
}
