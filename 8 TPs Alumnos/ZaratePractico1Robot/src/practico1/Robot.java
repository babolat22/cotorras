/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1;

/**
 *
 * @author Lucas
 */
public class Robot {
    
    int energia=1000;

    boolean dormir;
    
    
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Robot() {
    }
    
    
     
    public void avanzar(double pasos) {
        double necesito = pasos*0.1;
        
        if (necesito <= this.energia){
                this.energia-=necesito;
        
        }
        else {System.out.println(" No hay energia");}
        
    }

   
    public void retroceder(double pasos) {
        avanzar(pasos);
    }

    
    public void Dormir(){
        this.dormir=true;
    }
    
    public void Despertar(){
        this.dormir=false;
    }
    
    
   
    public void Recargar() {
        energia=1000;
    }
    
    public boolean bateriaLlena(){
      if(energia==1000);{
    
    System.out.println("energia a tope!");
    
    }
        return true;
    }
    
    public boolean bateriaVacia(){
         if ( energia <= 0 );{
         System.out.println("baja energia, necesita recargar");
    }
        return false;
        
    }
    
   public int energiaActual(){
       return  getEnergia();
   }
}
