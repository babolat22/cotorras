package practico3;


import java.time.LocalDate;

public class Jubilado extends Persona {

    public Jubilado(String nombre, long dni, LocalDate fechaDeNacimiento, String domicilio) {
        super(nombre, dni, fechaDeNacimiento, domicilio);
    }
    @Override
    public void cobrar(){
        System.out.println("Cobrando mi jubilacion");
        
    }
}
