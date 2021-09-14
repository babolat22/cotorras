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
public abstract class Avenger {
    protected int atk;
    protected int def;
    protected int vida;

    public Avenger(int atk, int def, int vida) {
        this.atk = atk;
        this.def = def;
        this.vida = vida;
    }
    
    public abstract void Correr();  // abstracto
    public void Atacar(){
        System.out.println("Punch!");
    }
}
