package collections.queue;
/**
 *
 * @author juanj
 */
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsQueue {

    public static void main(String[] args) {
        Queue<String> cola1 = new LinkedList<String>();
        System.out.println("-Insertamos los profes en la cola- ");
        cola1.add("Cristina");
        cola1.add("JuanJo");
        cola1.add("Pedro");
        cola1.add("Luis");
        System.out.println("Cantidad de elementos en la cola: " + cola1.size());
        System.out.println("Extraemos un elemento de la cola: " + cola1.poll());
        System.out.println("Elementos en la cola sin Cristina: " + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo: Profe " + cola1.peek());
        System.out.println("No variaron los elementos en cola: " + cola1.size());
        System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía:");
        while (!cola1.isEmpty())   // CON WHILE
            System.out.print(cola1.poll() + "-");
        System.out.println();

        Queue<Integer> cola2 = new LinkedList<Integer>(); // de ENTEROS
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento : cola2)   // CON FOREACH
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la cola");
           cola2.clear();
        System.out.println("Cantidad de elementos en la cola de ENTEROS:" + cola2.size());
       
        //Cuando se agregan elementos a la cola se organiza según su valor
        //ejemplo si es un número se ingresan de menor a mayor
        PriorityQueue<Integer> colaPrioridad = new PriorityQueue<Integer>();
        colaPrioridad.add(70);
        colaPrioridad.add(120);
        colaPrioridad.add(6);
        System.out.println("Imprimimos la cola con prioridades de enteros");
        while (!colaPrioridad.isEmpty())
            System.out.print(colaPrioridad.poll() + "-");
    
    }
}