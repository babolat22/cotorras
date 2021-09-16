/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author nacho
 */
public class TestMatriz {


    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        m1.armar();
        m1.mostrar();
        System.out.println("Filtrar pares: ");
        m1.mostrarPares();
    }
    
}
