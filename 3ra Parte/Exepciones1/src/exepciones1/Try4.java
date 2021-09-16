/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones1;

  public class Try4
         {
	         public static void main(String arg[])
	         {
		         int [] array = new int[20];
		         try
		         {
        //			array[-3] = 24;
       		int b = 0;
			         int a = 23/b;
         /*
			         String s = null;
			         s.equals("QQQQ");*/
		         }
		         catch(ArrayIndexOutOfBoundsException excepcion)
		         {
			         System.out.println(" Error de índice en un array");
		         }
		         catch(ArithmeticException e)
		         {
			         System.out.println(" Error Aritmetico: "+e);
		         }
		         catch(Exception excepcion)
		         {
			         System.out.println("Se ha generado un error que no es de índices, ni Aritmético");
			         System.out.println("El objeto error es de tipo " + excepcion);
                                 excepcion.printStackTrace();
		         }
	         }
         }