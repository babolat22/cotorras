package javaapplication31;

/**
 *
 * @author usuario2
 */
public class Colegio {
    
public static void main(String...arg){

    Materia m1=new Materia(1,"Inglés 1",1);
    Materia m2=new Materia(2,"Matematicas",2);
    Materia m3=new Materia(3,"Laboratorio 1",1);
    
    Alumno a=new Alumno(2,"Lopez","Juan");
    Alumno b=new Alumno(3,"Martinez","Brenda");

    a.agregarMateria(m1);
    a.agregarMateria(m2);
    a.agregarMateria(m3);
    
    b.agregarMateria(m1);
    b.agregarMateria(m2);
    b.agregarMateria(m3);
    b.agregarMateria(m3);
    
    System.out.println("Cantidad de materias "+a.cantidadMaterias());
    System.out.println("Cantidad de materias "+b.cantidadMaterias());

}
    
    
}
