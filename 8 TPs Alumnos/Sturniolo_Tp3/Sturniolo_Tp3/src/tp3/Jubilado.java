package tp3;

import java.time.*;

public class Jubilado extends Persona {

    public Jubilado(String nombre, String dni, LocalDate fechaNac, String domicilio) {
        super(nombre,dni,fechaNac,domicilio);
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilacion");
    }

    
}
