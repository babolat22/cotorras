package ArrayListMatrix;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author juanj
 */
public class ArrayListMatrix {

    public static void main(String args[]){
                
        ArrayList<String> arrayL= new ArrayList<>();
        arrayL.add("2664315840");
        arrayL.add("2665456788");
        arrayL.remove(1);
        System.out.println("elemento get "+ arrayL.get(0));
        
        List<ArrayList<Integer>> a = new ArrayList<>();
   //   int a
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(4);
        a2.add(5);
        a2.add(6);

        a3.add(7);
        a3.add(8);
        a3.add(9);

        a.add(a1);
        a.add(a2);
        a.add(a3);
        //a3.remove(0);  // ¿que borra?
        //a.remove(1);  // ¿que borra?
        for(ArrayList obj:a){

            ArrayList<Integer> temp = obj;

            for(Integer job : temp){
                System.out.print(job+" ");
            }
            System.out.println();
        }     
   }
}
