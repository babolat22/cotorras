package practico3;

public class Registro {

    public void procesarDatos(Persona p) {
        
        
        if (p instanceof Trabajador){
            System.out.println("Hola "+p.getNombre());
            System.out.println("Tu edad es: "+p.calcularEdad());
            p.cobrar();
             
             
     //muestre su nombre, edad y cobrar  
     //p instanceof Jubilado;
     // muestre su nombre y los días que ha vivido y cobrar
     
        }else if (p instanceof Jubilado){
            System.out.println("Hola "+p.getNombre());
            System.out.println("Dias vividos: " +p.calcularDiasVividos());
            p.cobrar();
             
        }
       
    }
}
