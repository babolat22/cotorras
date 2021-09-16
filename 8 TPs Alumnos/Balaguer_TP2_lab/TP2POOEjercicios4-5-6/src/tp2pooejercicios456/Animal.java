/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pooejercicios456;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author garba
 */
public class Animal {
    private String nombre;
    private String tipoAlimentacion;
    private int edad;
    public Animal (String nombre, String tipoAlimentacion, int edad){
        this.nombre=nombre;
        this.tipoAlimentacion=tipoAlimentacion;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void vacunar(int añovacunacion){
        
        if(añovacunacion>=LocalDate.now().getYear()) {
            System.out.println("Todavía no te toca vacunar a tu animal");
        } else {
            System.out.println("A tu animal le toca la vacuna! ");
        }
        
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Tipo alimentación: "+this.tipoAlimentacion);
        System.out.println("Edad: "+this.edad);
    }
}
