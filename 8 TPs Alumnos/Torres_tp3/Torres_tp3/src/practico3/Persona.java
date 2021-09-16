package practico3;


import java.time.*;
import java.time.temporal.ChronoUnit;

public abstract class Persona {

    private String nombre;

    private long dni;

    private LocalDate fechaDeNacimiento;

    private String domicilio;

    public Persona(String nombre, long dni, LocalDate fechaDeNacimiento, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }
//Casteo: le digo a un objeto el tipo que se espera, cuando tienen relacion
    public int calcularEdad() {
        return (int)ChronoUnit.YEARS.between (fechaDeNacimiento,LocalDate.now());
    }

    public int calcularDiasVividos() {
        return (int)ChronoUnit.DAYS.between (fechaDeNacimiento,LocalDate.now());
    }

    public abstract void cobrar();
}
