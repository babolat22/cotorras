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
public class Perro extends Animal {
    private String raza;
    
public Perro(String nombre, String tipoAlimentacion, int edad, String raza){
    super(nombre,tipoAlimentacion,edad);
    this.raza=raza;
}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

public void mostrar(){
    super.mostrar();
    System.out.println("Raza: "+this.raza);
}
}
