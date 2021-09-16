/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2POOEjercicios123;

/**
 *
 * @author garba
 */
public class Deportista extends Persona{
    private int resistencia;
    public Deportista(String nombre, int dni, int edad, String domicilio, int resistencia) {
        super(nombre, dni, edad, domicilio);
        this.resistencia=resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public void Andar(){
        
    super.Correr();
    System.out.println(" más rápido");
    }
    @Override
    public void Correr(){
         
    super.Correr();
    System.out.println(" más rápido");
    }
    
}
