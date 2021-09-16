/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico4velazquez;

/**
 *
 * @author Ulp
 */
public class Guerrero extends Personaje{
    
    private boolean caballo;
    public Guerrero(String nick,Posicion ubicacion){
        super(nick,ubicacion);
        this.caballo=true;
    }
    

    @Override
    public void avanzar(){
        
        if (caballo==true){
        switch (getOrientacion()){
        case 'E':
            ubicacion.setX(ubicacion.getX()+10);
        break;
        case 'S':
            ubicacion.setY(ubicacion.getY()+10);
        break;
        case 'N':
            ubicacion.setY(ubicacion.getY()-10);
        break;
        case 'O':
           ubicacion.setX(ubicacion.getX()-10);
        break;

        }
        }
        else  switch (getOrientacion()){
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
        break;}
}

    @Override
   public void disparar(){
       
       if(energia>30){
           setCaballo(false);
           energia-=10;
       }
       else energia-=10;
       
   }
    
    
    public boolean getCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }
    
    
}
