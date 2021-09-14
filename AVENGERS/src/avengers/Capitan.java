/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengers;

/**
 *
 * @author juanj
 */
public class Capitan extends Avenger implements Saludar{
    private Escudo escudo=null;
    public Capitan(int atk, int def, int vida) {
        super(atk, def, vida);
        this.escudo= new Escudo();
    }

    @Override
    public void Correr() {
        System.out.println("Corriendo...con mi escudo de vibranio!!");
        super.Atacar();
    }
    
    public void saludar(){
        System.out.println("Hola amigos...");
    }
  
    
}

class Escudo{
    private int dmg =150;
    private int def =500;
}
