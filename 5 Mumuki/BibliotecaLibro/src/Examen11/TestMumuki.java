package Examen11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanj
 */
public class TestMumuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro("La divina comedia", "Dante", 2);
        Libro libro2 = new Libro("Patoruzú", "Isidoro cañones", 3);
        
        List<Libro> libros = new ArrayList<Libro>();   //List es clase abstracta no se instancia
        
        libros.add(libro1);
        libros.add(libro2);
        
        Biblioteca biblio = new Biblioteca("San Luis", libros);
        System.out.println("Biblioteca ubicada en: " + biblio.getLocalidad());
        System.out.println("Los libros que contiene son: " );
        biblio.mostrarLibros();
        
    }
    
}
