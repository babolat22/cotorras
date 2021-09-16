package ejseñoradelosgatos;
/**
 *
 * @author juanj
 */
public class Perro extends Mascota{
    boolean garrapatas;
    boolean enfermoMoquillo;
    
    public Perro(String nombre, int edad) {
        super(nombre, edad);
        enfermoMoquillo = false;
        garrapatas = false;
    }
 
    public boolean tieneGarrapatas(){
        return garrapatas;
    }
    public void contrajoGarrapatas(){
        garrapatas = true;
    }
    public void seEnfermo(){
        enfermoMoquillo = true;
    }
    @Override
    public void sePuedeVacunar(){   //solo se vacuna a un perro con moquillo que NO tiene garrapatas
        if(!tieneGarrapatas() && enfermoMoquillo)
            System.out.println("Al enfermarse, se pudo vacunar a: "+ this.nombre);
        else
            System.out.println("Se enfermó, y no se puede vacunar a: "+ this.nombre);
    } 
    
    @Override
    protected void Chivatear(){
        System.out.println(this.nombre + " Ladra: Guuau Guau! ");
    }
    
}
