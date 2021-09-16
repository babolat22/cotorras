package accesoabasededatos.modelo;
import java.time.LocalDate;

public class Alumno {
    private int id = -1;
    private String nombre;    // VARCHAR
    private LocalDate fecNac;  // parsea DATETIME
    private boolean activo;   //TINYINT

    public Alumno(int id, String nombre, LocalDate fecNac, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    public Alumno(String nombre, LocalDate fecNac, boolean activo) {
        this.id = -1;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }
    public Alumno(){
        this.id = -1;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecNac() {
        return fecNac;
    }
    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public String toString(){
    
        return id+"-"+nombre;
    }
    
}
