package testmatriz;
import java.io.IOException;
public class TestMatriz {

 public static void main(String[] args) throws IOException {

         // TODO code application logic here
        
        Matriz m1=new Matriz();
        int[][] matriz1={{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
        m1.armar(matriz1);
        
        System.out.println("");
        m1.visualizarPares(matriz1);
      
        System.out.println("");
        m1.visualizar(matriz1);
    }
}