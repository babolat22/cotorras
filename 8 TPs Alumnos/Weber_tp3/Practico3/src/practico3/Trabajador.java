package practico3;

public class Trabajador extends Persona implements Pasivo {
    
    /*por defecto el trabajador cobra 10500, solo para que funcione
    la implementación que nos pide el ejercicio*/
    
    double sueldo=10500;
    
    public Trabajador(String nombre, String dni, String fechaNac, String domicilio) {
        super(nombre, dni, fechaNac, domicilio);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void hacerAportes() {
        System.out.println("Aportes hechos");
    }
    
    @Override
    public void cobrar() {
        System.out.println("Monto a cobrar: $"+sueldo);
    }
}
