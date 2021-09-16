package practico3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Persona {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    protected String nombre;
    protected final String dni;
    protected final LocalDate fechaNac;
    protected String domicilio;
    

    public Persona(String nombre, String dni, String fecha, String domicilio) {
        this.fechaNac = LocalDate.parse(fecha,f);
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    
    public Long calcularEdad(){
        LocalDate hoy = LocalDate.now();
        Long edad = ChronoUnit.YEARS.between(fechaNac,hoy);
        return edad;
    }
    
    public Long calcularDiasVividos(){
        LocalDate hoy = LocalDate.now();
        Long dias = ChronoUnit.DAYS.between(fechaNac, hoy);
        return dias;
    }
    
    public abstract void cobrar();
}
