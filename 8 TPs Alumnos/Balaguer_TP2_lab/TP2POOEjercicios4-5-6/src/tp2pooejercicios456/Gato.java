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
public class Gato extends Animal {
    private String color;

public Gato(String nombre, String tipoAlimentacion, int edad, String color){
    super(nombre,tipoAlimentacion,edad);
    this.color=color;
}

    public String getColor() {
        return color;
    }

    public void setRaza(String color) {
        this.color = color;
    }

public void mostrar(){
    super.mostrar();
    System.out.println("Color: "+this.color);
}    
}
