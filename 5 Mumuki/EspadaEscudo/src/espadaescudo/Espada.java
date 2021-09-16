/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espadaescudo;

/**
 *
 * @author juanj
 */
public class Espada implements Arma{
    int ataque;
    int defensa;
    
    public Espada(int ataque, int defensa){
        this.ataque=ataque;
        this.defensa=defensa;
    }
    public Espada(){
    }
    public int refuerzoOfensivo(){
        ataque=10;
        return(ataque);
    }
    public int refuerzoDefensivo(){
        defensa=1;
        return defensa;    
    }
    
    
}

