package guerrero;

public class testHerencia {

    public static void main(String[] args) {
        Position position = new Position();
        position.setX(100);
        position.setY(200);
        Personaje personaje1 = new Guerrero(false,position,"Thor");
        System.out.println("Energia inicial " + personaje1.energia);
        //Gira 3 veces hasta el Oeste
        for (int i = 0; i < 3; ++i) {
            personaje1.Girar();
        }
        
        //Avanza 5 pasos
        for (int i = 0; i < 5; ++i) {
            personaje1.avanzar();
        }
        System.out.println("La posicion de "+ personaje1.nick + " es x = "+personaje1.position.getX()+" y = "+personaje1.position.getY() );
        //Disparar 8 veces
        for (int i = 0; i < 8; ++i) {
            personaje1.disparar();
        }
        System.out.println("Energia final " + personaje1.energia);
    }

}
