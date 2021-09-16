package javaapplication31;
import java.util.HashSet;

/**
 *
 * @author usuario2
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias=new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
    
        if(materias.add(m))
            System.out.println("Materia Agregada");
        else 
            System.out.println("Materia Repetida");
    }
    
    public int cantidadMaterias(){
        if(materias!=null)
            return materias.size();
        else 
            return 0;
 }
}