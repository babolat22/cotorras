/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaescritura;

/**
 *
 * @author juanj
 */
class Muchosmains{
    // El método main()
    public static void main(String[] args) {
        System.out.println("Hola Javeros (desde el main)");
        Muchosmains.main("Java");
    }
    // Sobrecargando el método main()
    public static void main(String arg1) {
        System.out.println("Hola, " + arg1);
        Muchosmains.main("El profe y su ","sobrecarga de métodos");
    }
    public static void main(String arg1, String arg2) {
        System.out.println("Tercero, " + arg1 + ", " + arg2);
    }
}
