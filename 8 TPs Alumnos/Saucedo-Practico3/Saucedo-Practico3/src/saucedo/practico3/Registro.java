package saucedo.practico3;

public class Registro {

    Registro() {
    }

    public void procesarDatos(Trabajador t) {
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Edad: " + t.calcularEdad());
        t.cobrar();
    }

    public void procesarDatos(Jubilado j) {
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Dias vividos: " + j.calcularDiasVividos());
        j.cobrar();
    }

    /*
    public void procesarDatos(Persona p){
        if (p instanceof Trabajador){
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Edad: "+p.calcularEdad());
            p.cobrar();
        } else {
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Dias vividos: "+p.calcularDiasVividos());
            p.cobrar();
        }
    }
     */
}
