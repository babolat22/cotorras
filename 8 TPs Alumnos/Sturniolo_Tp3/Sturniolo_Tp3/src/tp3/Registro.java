package tp3;

public class Registro {

    public void procesarDatos(Persona persona) {
        if(persona instanceof Trabajador){
            System.out.println(persona.getNombre());
            System.out.println(persona.calcularEdad() + " años");
            persona.cobrar();
        }else{
            System.out.println(persona.getNombre());
            System.out.println(persona.calcularDiasVividos() + " dias vividos");
            persona.cobrar();
        }
    }
}
