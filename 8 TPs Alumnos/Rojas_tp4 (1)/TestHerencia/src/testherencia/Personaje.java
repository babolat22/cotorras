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
public class Personaje {
    Position ubicacion = new Position();
    String nick;
    int vidas = 3;
    int energia = 100;
    char orientacion = 'N';

    
    
    
    
    void Disparar (){
        if(energia >= 10){
        energia -= 10;
    }
        else{
        System.out.println("No hay suficiente energia");
        }
    }
    
    void Girar(){
        switch(orientacion){
            case 'N':
                orientacion = 'E';
                break;
            case 'E':
                orientacion = 'S';
                break;
            case 'S':
                orientacion = 'O';
                break;
            case 'O':
                orientacion = 'N';
                break;
    }
    }
    void Avanzar (){
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
    

    
    
}
