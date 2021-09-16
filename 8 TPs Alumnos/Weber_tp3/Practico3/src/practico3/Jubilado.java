package practico3;

public class Jubilado extends Persona{

    public Jubilado(String nombre, String dni, String fechaNac, String domicilio) {
        super(nombre, dni, fechaNac, domicilio);
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilacion");
    }
    
}
