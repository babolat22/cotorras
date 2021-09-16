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
public class Escudo implements Arma{   // herencia
    int ataque;
    int defensa;
    
    public Escudo(int ataque, int d){
        this.ataque=ataque;
        defensa=d;
    }
    public Escudo(){}
    
    public int refuerzoOfensivo(){
        ataque =2;
        return ataque;
    }
    public int refuerzoDefensivo(){
        defensa =6;
        return defensa;
    }
}

