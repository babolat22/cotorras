package saucedo.practico3;

public class Jubilado extends Persona {

    Jubilado(String n, String dom, long doc, int d, int m, int a) {
        super(n, dom, doc, d, m, a);
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilacion.");
    }
}
