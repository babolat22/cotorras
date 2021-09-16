package saucedo.practico3;

public class Test {

    public static void main(String[] args) {
        Registro reg = new Registro();
        Trabajador bob = new Trabajador("bob", "unacalle 123", 38359883, 29, 6, 1994, 1200);
        Jubilado labeta = new Jubilado("norma", "direccion 456", 12345678, 5, 5, 1995);
        reg.procesarDatos(bob);
        System.out.println("");
        reg.procesarDatos(labeta);
    }
}
