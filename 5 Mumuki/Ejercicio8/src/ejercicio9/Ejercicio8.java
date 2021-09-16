/*
 ESTO ES UN COMENTARIO
 */
package ejercicio9;

/**
 *
 * @author juanj
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  // METODO PRINCIPAL
        // TODO code application logic here
        int balas;
        String modelo;
        Arma escopeta= new Arma(7,"Shotgun");
        Arma fusil = new Arma(46,"Remington");
        Arma lanzallamas = new Arma();
        escopeta.mostrarNombre();
        fusil.mostrarNombre();
        lanzallamas.mostrarNombre();
    }
    
}
