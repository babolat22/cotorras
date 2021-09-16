/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico3.entidades;

/**
 *
 * @author kevin
 */
public class Registro {
    
    
    public void procesarDatos(Persona persona){
        if(persona.getTipo() == "trabajador"){
            System.out.println(""+ persona.getNombre());
            System.out.println(""+ persona.calcularEdad());
            persona.cobrar();
        }else{
            System.out.println(""+ persona.getNombre());
            System.out.println("dias vividos "+ persona.calcularDiasVividos());
            persona.cobrar();
        }
    }
}
