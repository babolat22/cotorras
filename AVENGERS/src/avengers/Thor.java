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
public class Thor extends Avenger{
    private Martillo martillo=null;
    
    public Thor(int atk, int def, int vida){
        super(atk, def, vida);
        this.martillo = new Martillo();
    }
    
    public Martillo getMartillo(){
        return martillo;
    }
    
    @Override
    public void Correr() {
        System.out.println("Yo no corro ... puedo volaaaar..");
    }
}

class Martillo{
    int dmg=350;
    int def=0;
    
    
}
