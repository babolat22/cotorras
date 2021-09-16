/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Admin
 */
public class Padre {
    private String nombre;
    private Auto auto;
    private Casa casa;

    public Padre(String nombre) {
        this.nombre = nombre;
        auto = new Auto("123asc","Azul");
        casa= new Casa("centro");
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    
    
    public void cantar(){
    
        System.out.println("Estoy cantando soy tu padre y me llamo "+this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
    
}
