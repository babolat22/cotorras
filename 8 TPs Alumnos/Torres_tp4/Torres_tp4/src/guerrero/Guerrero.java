package guerrero;

public class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero(boolean caballo, Position position, String nick) {
        super(position, nick);
        this.caballo = caballo;
    }
    
    @Override
    public void avanzar() {
        if (caballo){
            switch(orientacion){                
                case 'N': 
                    position.setY(position.getY()-10);//yo le doy un valor de acuerdo a operacion dentro del set            
                    break;
                case 'E': 
                    position.setX(position.getX()+10);
                    break;
                case 'S': 
                    position.setY(position.getY()+10);
                    break;
                case 'O': 
                    position.setX(position.getX()-10);
            } 
        }else{
            super.avanzar();
        }
    }

    @Override
    public void disparar() {
     super.disparar();
        if(energia<30){
           caballo = false;
        }
    }
}
