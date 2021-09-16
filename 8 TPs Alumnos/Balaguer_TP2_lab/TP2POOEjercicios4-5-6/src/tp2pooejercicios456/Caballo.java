/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pooejercicios456;

/**
 *
 * @author garba
 */
public class Caballo extends Animal{
    
    private String competidor;
public Caballo(String nombre, String tipoAlimentacion, int edad, String competidor){
    super(nombre,tipoAlimentacion,edad);
    this.competidor=competidor;
}

    public String getComptidor() {
        return competidor;
    }

    public void setCompetidor(String competidor) {
        this.competidor = competidor;
    }

public void mostrar(){
    super.mostrar();
    System.out.println("Competidor: "+this.competidor);
}
}
