/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaescritura;

/**
 *
 * @author juanj
 */
public class SobrecargaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instrumento g, i = new Instrumento();
        i.tocar();
        g = new Guitarra();
        g.tocar();
    }
    
}

class Instrumento{
          
  public String tipo;

  public void tocar()
   {
    System.out.println("Tocar un Instrumento");
   }
}

class Guitarra extends Instrumento {
 
 @Override         
 public void tocar() {
    System.out.println("Tocar La Guitarra");
    
 }
 
}