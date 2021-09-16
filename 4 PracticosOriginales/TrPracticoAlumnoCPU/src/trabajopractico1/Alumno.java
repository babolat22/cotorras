package trabajopractico1;

import java.util.List;

public class Alumno {
     long dni;   
     String nombre;
     int celular=0;
     Computadora compu=null;
     List<Computadora> Computadoras;
    //constructor sin parametros
    public Alumno(long dni, String nom, int cel){
        nombre = nom;
        celular = cel;
        this.dni = dni;
    }
    public Alumno(long dni, String nom){
        nombre = nom;
        this.dni = dni;
    }
    public Alumno(){
        
    }
    public String Hablar(){
        String textoLocal;
        textoLocal = "Hola";
        return textoLocal;
    }
    public void ComprarCompu(Computadora nuevaCompu){
        compu=nuevaCompu;
        Computadoras.add(compu);
    }

    public Computadora mostrarComputadora() {
        return compu;
    }
    public List<Computadora> mostrarComputadoras() {
        return Computadoras;
    }
    
}
