/*
 * To change this license hieader, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico4velazquez;

/**
 *
 * @author Ulp
 */
public class Personaje {
    
protected Posicion ubicacion;
protected String nick;
protected int energia;
protected int vida;
protected char orientacion;

    public Personaje( String nick ,Posicion ubicacion) {
        this.nick = nick;
        this.ubicacion = ubicacion;
        energia=100;
        vida=3;
        orientacion='N';
    }

public void girar(){
        switch (getOrientacion()){
        case 'E':
            this.setOrientacion('S');
        break;
        case 'S':
            this.setOrientacion('O');
        break;
        case 'N':
            this.setOrientacion('E');
        break;
        case 'O':
            this.setOrientacion('N');
        break;

        } 
}

public void avanzar(){

        switch (getOrientacion()){
        case 'E':
            ubicacion.setX(ubicacion.getX()+1);
        break;
        case 'S':
            ubicacion.setY(ubicacion.getY()+1);
        break;
        case 'N':
            ubicacion.setY(ubicacion.getY()-1);
        break;
        case 'O':
           ubicacion.setX(ubicacion.getX()-1);
        break;

        }
}
public void disparar(){
        if(energia>=0){
        energia-=10;
        }
}

public String getNick() {
        return nick;
    }

public void setNick(String nick) {
        this.nick = nick;
    }
public int getEnergia() {
        return energia;
    }

public void setEnergia(int energia) {
        this.energia = energia;
    }

public int getVida() {
        return vida;
    }

public void setVida(int vida) {
        this.vida = vida;
    }
public char getOrientacion() {
        return orientacion;
    }

public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }


}
