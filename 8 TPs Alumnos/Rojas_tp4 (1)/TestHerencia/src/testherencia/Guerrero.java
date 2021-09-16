/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author Ale
 */
public class Guerrero extends Personaje {
    boolean caballo;
       
    @Override
    void Avanzar (){
      if (!caballo){  
        switch(orientacion){
            case 'N':
                ubicacion.y -= 1;
                break;
            case 'E':
                ubicacion.x += 1;
                break;
            case 'S':
                ubicacion.y += 1;
                break;
            case 'O':
                ubicacion.x -= 1;
                break;
    }
      }
        else{
                switch(orientacion){
            case 'N':
                ubicacion.y -= 10;
                break;
            case 'E':
                ubicacion.x += 10;
                break;
            case 'S':
                ubicacion.y += 10;
                break;
            case 'O':
                ubicacion.x -= 10;
                break;
            }
    }
    }
@Override
void Disparar (){
        if(energia >= 10){
        energia -= 10;
        }
        else if (energia<30){
            caballo = false;
        }
        else{
        System.out.println("No hay suficiente energia");
        }
    }
}