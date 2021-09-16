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
public class Hijo extends Padre implements Madre, Hermano {
    private String nom;
    private double dinero;
    

    public Hijo(String nom, String nombre) {
        super(nombre);
        this.nom = nom;
        System.out.println("Soy el hijo "+this.nom+" mi padre es "+super.getNombre());
        dinero=0;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public void bailar(){
        System.out.println("Se bailar gracias a mi madre   ");
    
    
    }
    
    public void jugarFutbol(){
        System.out.println("Se jugar futbol gracias a mi hermano  ");
    
    
    }
    public void heredarDinero(double dinero){
    
     ;
     System.out.println("Hijo disfruta eta herencia  "+dinero +"pesos de tu madre la ROSA!!");
     
    }
}
