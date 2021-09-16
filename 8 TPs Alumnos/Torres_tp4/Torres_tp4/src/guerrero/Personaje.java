package guerrero;

public class Personaje {

    public Position position;

    public String nick;

    public int vidas = 3;

    public int energia = 100;

    public char orientacion = 'N';

    public Personaje(Position position, String nick) {
        this.position = position;
        this.nick = nick;
    }

    
    public void disparar() {
        
        /*if(<condition>){
            
            //insert code here
        }*/
        
        if(energia >= 10){
            energia = energia - 10;
        }
        
    }

    public void Girar() {
     //lo que viene en switch "(valor)", se chequea en el case
     /*if(orientacion == 'N'){        es equivalente a   case 'N':
            orientacion = 'E';                               orientacion = 'E';
      }                                                      break;*/
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
        }
    }

    public void avanzar() {
        // si yo avanzo tengo que restarlo o sumarle a un posicion sea "X" o "Y"
        switch(orientacion){                
            case 'N': 
                position.setY(position.getY()-1);//yo le doy un valor de acuerdo a operacion dentro del set            
                break;
            case 'E': 
                position.setX(position.getX()+1);
                break;
            case 'S': 
                position.setY(position.getY()+1);
                break;
            case 'O': 
                position.setX(position.getX()-1);
        }
    }
}
