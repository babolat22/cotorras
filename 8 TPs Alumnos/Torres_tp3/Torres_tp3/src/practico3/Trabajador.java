package practico3;


import java.time.*;

public class Trabajador extends Persona implements Pasivo {

    private double sueldo;
//
    @Override
    public void hacerAportes() {
        
    }

    
  
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Trabajador(String nombre, long dni, LocalDate fechaDeNacimiento, String domicilio) {
        super(nombre, dni, fechaDeNacimiento, domicilio);
    }

    @Override
    public void cobrar() {
        System.out.println("Monto a cobrar: "+ sueldo);
    }
    
    
  

    
}
