package pelijuegos;
public class PeliJuegos {
    public static void main(String[] args) {
        Serie s1, s2, s3, s4,s5;
        Videojuego listaVideojuegos[]=new Videojuego[5];  //Creamos array de videojuegos
  
        s1=new Serie();
        s2=new Serie("Juego de tronos", "George R. R. Martin ");
        s3=new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        s4=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        s5=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
        
       //  System.out.println("Series: " + s1 + s2);
        //
        /*
         //Creamos un objeto en cada posicion del array
        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Assasin creed 2", 30, "Aventura", "EA");
        listaVideojuegos[2]=new Videojuego("God of war 3", "Santa Monica");
        listaVideojuegos[3]=new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");
       
        
        for(int i=0;i<listaVideojuegos.length;i++)
            System.out.println("Juegos: " + listaVideojuegos[i]);
        */
    }
}
