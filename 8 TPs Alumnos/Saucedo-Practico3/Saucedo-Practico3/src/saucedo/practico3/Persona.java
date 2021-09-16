package saucedo.practico3;

import java.time.*;
import java.time.temporal.ChronoUnit;

abstract class Persona {

    protected String nombre;
    protected long dni;
    protected String domicilio;
    protected LocalDate fechaNacimiento;

    Persona(String n, String dom, long doc, int d, int m, int a) {
        nombre = n;
        domicilio = dom;
        dni = doc;
        fechaNacimiento = LocalDate.of(a, m, d);
    }

    abstract void cobrar();

    protected long calcularDiasVividos() {
        return ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now());
    }

    protected int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    //----------getters y setters-----------------------------------------------
    
    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected long getDni() {
        return dni;
    }

    protected void setDni(long dni) {
        this.dni = dni;
    }

    protected String getDomicilio() {
        return domicilio;
    }

    protected void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    protected LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    protected void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
