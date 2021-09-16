package collections.objetos;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author juanj
 */
public class CollectionsObjetos {
     public static void main(String[] args) {
       ArrayList lista= new ArrayList();
       lista.add(new Persona(23492009,"Luis"));
       lista.add(new Persona(20314619,"Pablo"));
       lista.add(new Persona(21569856,"Antonio"));
       Persona buscar = new Persona(21314619,"Julian");
       
       int posicion = Collections.binarySearch(lista, buscar);
       System.out.println("posicion devuelta: " + posicion);
       System.out.println(lista.get(posicion));
    }
    }
    

