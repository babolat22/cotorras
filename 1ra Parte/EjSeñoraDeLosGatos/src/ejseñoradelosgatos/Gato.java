package ejseñoradelosgatos;
/**
 *
 * @author juanj
 */
public class Gato extends Mascota{
    boolean conPulgas;

    public Gato(String nombre, int edad) {
        super(nombre, edad);  // hace algo con estos datos
        conPulgas = false;   // no tiene pulgas
    }
 
    public boolean tienePulgas(){
        return conPulgas;
    }
    public void yaSeEmpulgo(){
        conPulgas=true;
    }
    
    @Override
    public void sePuedeVacunar(){   // polimorfico
        if(!tienePulgas())
            System.out.println("Se pudo vacunar a: "+ this.nombre);
        else
            System.out.println("Pero no se pudo vacunar a: "+ this.nombre);
    } 
    
    @Override
    protected void Chivatear(){
        System.out.println(this.nombre + " maulla: Miauu....Miauuuuu! ");
    }
    
}
