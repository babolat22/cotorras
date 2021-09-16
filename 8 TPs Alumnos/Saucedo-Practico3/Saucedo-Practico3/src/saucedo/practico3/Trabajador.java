package saucedo.practico3;

public class Trabajador extends Persona implements Activo {

    double sueldo;

    Trabajador(String n, String dom, long doc, int d, int m, int a, double s) {
        super(n, dom, doc, d, m, a);
        sueldo = s;
    }

    @Override
    public void hacerAportes() {
        System.out.println("Generando aportes.");
    }

    @Override
    public void cobrar() {
        System.out.println("Monto a cobrar: $" + sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
