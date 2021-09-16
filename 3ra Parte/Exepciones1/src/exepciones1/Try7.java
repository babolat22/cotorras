package exepciones1;

         public class Try7
         {
	         public static void main(String arg[])
	         {/**
 La cláusula catch comprueba los argumentos en el mismo orden en que aparezcan en el programa. 
 Si hay alguno que coincida, se ejecuta el bloque y sigue el flujo de control por el bloque finally (si lo hay) 
 y concluye el control de la excepción.
 */
		         try
		         {
			         Exception e = new Exception("Este es mi propio error.");
			         throw e;
		         }
		         catch(Exception excepcion)
		         {
			         excepcion.printStackTrace();
		         }
		         finally
		         {
			         System.out.println("Se ejecuta finally");
		         }
	         }
         }
