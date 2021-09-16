package practico3;

public class Registro {
    
    public void procesarDatos(Persona persona){
        if (persona instanceof Trabajador){
        System.out.println("Nuestro trabajador se llama "+persona.getNombre());
        System.out.println("Y tiene "+persona.calcularEdad()+" años de edad");
        persona.cobrar();            
        }
        else {
        System.out.println(persona.getNombre()+" ya ha vivido "+persona.calcularDiasVividos()+" dias en toda su vida");
        persona.cobrar();
        }
    }
    
}
