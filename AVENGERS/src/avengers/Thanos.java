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
public class Thanos extends Avenger {
    
    public Thanos(int atk, int def, int vida) {
        super(atk, def, vida);
    }
    
    @Override
    public void Correr() {
        System.out.println("Corriendo con mis guanteletee...");
    }
    
}
