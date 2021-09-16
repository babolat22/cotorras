
package tp8;


public class Matriz {
    private int[][] matriz;
    
    public Matriz(){
        matriz = new int[4][];
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
    }
    
    public  void armar(){
        int count = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                count++;
                matriz[i][j] = count * 3;
            }
        }
    }
    
    public void mostrar(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void mostrarPares(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){
                    System.out.print(matriz[i][j] + "\t");
                }                
            }
            System.out.println();
        }
    }
}
