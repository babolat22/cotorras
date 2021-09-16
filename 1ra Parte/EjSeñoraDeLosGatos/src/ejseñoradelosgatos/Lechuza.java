package ejseñoradelosgatos;
/**
 *
 * @author juanj
 */
public class Lechuza extends Mascota{
    boolean calmada=true;
    String ululato;
      
    public Lechuza(String nombre, int edad) {
        super(nombre, edad);
        ululato = "Chuzear";
    }
 
    public String ulular(){
        return ululato;
    }
    public void enojarse(){
        ululato="Graznar";
        calmada = false;
    }
    public void calmarse(){
        ululato="Chuzear";
        calmada =true;
    }
    
    @Override
    public void sePuedeVacunar(){
        if(calmada)
            System.out.println("Se pudo vacunar a: "+ this.nombre);
        else
            System.out.println("aunque no se pudo vacunar a: "+ this.nombre);
    } 
    
    @Override
    protected void Chivatear(){
        System.out.println(this.nombre + " ulula: Hooo Hoo....Hoo Hooo! ");
    }
    
}
