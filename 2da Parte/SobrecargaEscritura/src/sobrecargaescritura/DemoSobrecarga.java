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

  class DemoSobrecarga{
   // Agrego mitipo(byte)
   void mitipo (byte x){
       System.out.println("Mi tipo (byte): "+x);
   }
    void mitipo (int x){
        System.out.println("Mi tipo (int): "+x);
    }
   void mitipo(double x){
       System.out.println("Mi tipo (double): "+x);
   }
}
class Sobrecarga{
    public static void main(String[] args) {
        DemoSobrecarga sc= new DemoSobrecarga();
        int i=10;
        double d= 10.1;
        byte b= 99;
        short s=10;
        float f=11.5F;
        sc.mitipo(i);
        sc.mitipo(d);
        sc.mitipo(b); //NO HAY CONVERSION DE TIPO
        sc.mitipo(s); //Conversión de tipo, llamando a sc.mitipo(int)
        sc.mitipo(f); //Conversión de tipo, llamando a sc.mitipo(double)
    }
  
}
