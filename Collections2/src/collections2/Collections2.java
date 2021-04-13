package collections2;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author juanj
 */
public class Collections2 {
        public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(20);
        conjunto1.add(10);
        conjunto1.add(1);
        conjunto1.add(5);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto1.add(20);
        // La impresión NO asegura un orden específico
        for (int elemento : conjunto1)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto2 = new TreeSet<Integer>();
        conjunto2.add(20);
        conjunto2.add(10);
        conjunto2.add(1);
        conjunto2.add(5);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto2.add(20);
        // Los elementos se muestran de MENOR a MAYOR
        for (int elemento : conjunto2)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        // El valor 20 no se inserta en el conjunto DUPLICADO
        conjunto3.add(20);
        // Los elementos se muestran en el ORDEN DE INSERCION
        for (int elemento : conjunto3)
            System.out.print(elemento + " - ");
        System.out.println();
        
// Generar otro valor aleatorio y lo agregamos al conjunto, como ya sabemos
        // si el valor ya existe en el conjunto1 luego el método 'add' no lo agrega
       
        Set<Integer> conjunto4 = new TreeSet<Integer>();
        while (conjunto4.size() < 10) {
            int aleatorio = (int) (Math.random() * 100) + 1;
            conjunto4.add(aleatorio);
        }
        System.out.println(conjunto4);
    }
} 