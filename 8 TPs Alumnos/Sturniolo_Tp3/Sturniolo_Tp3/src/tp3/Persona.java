package tp3;

import java.time.*;
import java.time.temporal.ChronoUnit;

public abstract class Persona {

    private String nombre;

    private String dni;

    private LocalDate fechaNac;

    private String domicilio;

    public Persona(String nombre, String dni, LocalDate fechaNac, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long calcularEdad() {
        return ChronoUnit.YEARS.between(fechaNac, LocalDate.now());        
    }

    public long calcularDiasVividos() {
        return ChronoUnit.DAYS.between(fechaNac, LocalDate.now());
    }

    public abstract void cobrar();
}
