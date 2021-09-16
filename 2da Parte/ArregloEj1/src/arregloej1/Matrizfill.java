/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloej1;

import java.util.Arrays;

/**
 *
 * @author juanj
 */
public class Matrizfill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Character[][] maze = new Character[10][10];
        fillArray(maze, fillArray(maze[0], '?'));
        for(int i = 0;i<10;i++){
            System.out.println();
            for(int j = 0;j<10;j++){
                System.out.print(maze[i][j]);
            }
        }
    }
    
    public static Object[] fillArray(Object[] arr,Object item){
        Arrays.fill(arr, item);
        return arr;
    }
    

    
}
