package tp3;

import java.time.*;

public class Trabajador extends Persona implements Pasivo {

    private double sueldo;

    public Trabajador(String nombre, String dni, LocalDate fechaNac, String domicilio, double sueldo) {
        super(nombre,dni,fechaNac,domicilio);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }    

    @Override
    public void cobrar() {
        System.out.println("Monto a cobrar: " + getSueldo());
    }

    @Override
    public void hacerAportes() {
    }

    
}
