package collections;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author juanj
 */
public class Collections {
    public static void main(String[] args) {
        //Creamos un arrayList
		ArrayList<String> lista; 
		lista = new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3"); 
		lista.add("Elemento 4");
		lista.add("Elemento 5");
	
		//Creamos un iterador
		Iterator<String> iterador = lista.iterator();  //paso1
	 
		//Usamos el método hasNext, para comprobar si hay algun elemento
		while(iterador.hasNext())  // itero con HAS NEXT
			//El iterador devuelve el proximo elemento
			System.out.println(iterador.next());
		  
                ArrayList coleccion=new ArrayList();
                coleccion.add("Simba");
                coleccion.add("Timón");
                coleccion.add("Pumba");
                coleccion.add("Mufasa");
                coleccion.add("Scar");

                Object arreglo[];
                arreglo = coleccion.toArray();//devuelve un arreglo de Objects.
                
                for(Object o:arreglo){  // muestra el arreglo
                    System.out.println(o);
                    if (o.equals("Scar")) {
                        System.out.println("Encotre a Scar");
                    }
                }
                coleccion.remove("Mufasa");  // de la lista de objects
                System.out.println("Luego de pasarlo al arreglo y eliminar a Mufasa..");
                for(Iterator it=coleccion.iterator();  it.hasNext();){
                    System.out.println(it.next());
                }
        }
 }
