package herencia;

public class Hijo extends Padre implements Madre, Hermano {  
// HERENCIA MULTIPLE SIMULADA
    private String nom;
    double dinero;
    

    public Hijo(String nom, String apellido, Auto auto) {
        super(apellido, auto);
        this.nom = nom;
        System.out.println("Soy el hijo "+this.nom+" herede de mi padre su apellido: "+super.getApellido());
        dinero=0;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
     // implemento habidades   
    public void bailar(){
        System.out.println("Se bailar gracias a mi madre   ");
    }
    
    public void jugarFutbol(){
        System.out.println("Se jugar futbol gracias a mi hermano  ");
    }
    
    public void heredarDinero(double dinero){
      this.dinero= dinero;
      System.out.println("MSJ de mamá: Hijo disfruta esta herencia  "+this.dinero +"pesos de tu madre la ROSA!!");
    }
}