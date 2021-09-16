package pruebaHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author juanj
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Map<String, String> dic = new HashMap<>();
        dic.put("alopecia", "Ausencia o caída del pelo en las zonas que lo poseen");
        dic.put("escrutinio", "Recuento de los votos de una elección");
        dic.put("edificio", "Edificio para habitar. Una casa de ocho plantas");
        
        
        System.out.println("" + dic.get("alopecia"));
        System.out.println("" + dic.get("democracia"));
        System.out.println(""+ dic.getOrDefault("rareza", "No es una palabra de la RAE"));
        System.out.println(""+ dic.getOrDefault("escrutinio", "No es una palabra de la RAE"));
       
        
        Map<String, Integer> telefonitos = new HashMap<>();
        telefonitos.put("Renzo", 266431584);
        telefonitos.put("Profe", 266466666);
        System.out.println("" + telefonitos.get("Profe"));
        System.out.println("" + telefonitos.get("Renzo"));
        
//si hago map.getOrDefault ("key1", nuevo Object ()), incluso si el objeto está presente para key1 en el mapa, 
// new Object() igual se crea.      Aunque el método no lo devuelve, todavía lo crea. Por ejemplo,
        Map<String, Empl> map = new HashMap<String, Empl>();
        Empl imp = new Empl("timon");
        map.put("1", imp);
        System.out.println(map.getOrDefault("1", new Empl("dumnba"))); // puede ser un msj u otra cosa
        
    }
    
}
