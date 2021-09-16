package carreramortal;
import java.util.List;

public class CarreraMortal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //Creo un objeto del tipo Auto y lo asigno a la variable "auto1"
        Auto auto1 = new Auto("RRR 232", "Azul");
        
        //creo cinco instancias de la clase Rueda
        Rueda rueda1 = new Rueda("Michelin");
        Rueda rueda2 = new Rueda("Fate");
        Rueda rueda3 = new Rueda("Bridgestone");
        Rueda rueda4 = new Rueda("GoodYear");
        Rueda rueda5 = new Rueda("Yokohama");
        
        //Asigno los objetos del tipo Rueda al auto1
        auto1.setRueda(rueda5);
        auto1.colocarRueda(rueda1);
        auto1.colocarRueda(rueda2);
        auto1.colocarRueda(rueda3);
        auto1.colocarRueda(rueda4);
        
        
        auto1.inflarTodas();  // navegacion desde AUTO a sus RUEDAS
        rueda1.desinflar();
        /*
         La clase Auto no acepta mas de 4 ruedas por lo que al tratar de 
         asignar la rueda5 me mostrara un mensaje que indica que esa rueda no 
         se puede colocar
        */
        auto1.colocarRueda(rueda5);
        
        auto1.avanzar(40);
       
        //Con streams
        auto1.getRuedas().stream().forEach(r -> {
            System.out.println(r.getMarca());
        });      
        
        //Con un for recorro las ruedas del auto
        List<Rueda> ruedas = auto1.getRuedas();
        for (Rueda rueda : ruedas) {
            System.out.println("La rueda "+ ruedas.indexOf(rueda) +"  marca: " + rueda.getMarca() );
            rueda.inflar(ruedas.indexOf(rueda));
        }

        //Utilizo los métodos de la clase Auto para quitar una rueda
        auto1.reemplazarRueda(rueda1, rueda2);
        //Sobrecarga del método quitar rueda
        auto1.quitarRueda(3);

        //Con un for
        for (int i = 0; i<ruedas.size(); i++ ) {
            if(ruedas.get(i) != null)
                System.out.println("La rueda "+ i +"  marca: " + ruedas.get(i).getMarca() );
            else{
                System.out.println("La rueda " + i +"  falta no está colocada");
            }
        }
        
    }
    
}
