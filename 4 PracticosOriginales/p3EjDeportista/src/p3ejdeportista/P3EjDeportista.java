package p3ejdeportista;
/**
 *
 * @author juanj
 */
public class P3EjDeportista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Agustin",31185963,21,"Las catitas");
        persona1.andar();
        persona1.correr();
        Deportista deportista = new Deportista("Kaká",32890345,20,"Av Brasil",25);
        deportista.andar();
        deportista.correr();
        deportista.setNombre("Federer");
        deportista.getNombre();
        persona1.setNombre("Juanjo");
        persona1.getNombre();

    }
    
}
