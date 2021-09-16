/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author juanj
 */
public class Arma {
    private String modelo;  //declaro
    private int Balas=12;  //declaro e inicializar
    
    public Arma(int balas, String nombre){
        modelo = nombre;
        Balas = balas;
    }
    public Arma(){
        modelo = "Lanzallamas Loco";
    }
    public void mostrarNombre(){
        System.out.print("su nombre es: "+ modelo);
        System.out.print("sus balas: "+ Balas);
    } //function
}
