
package ModeloUniversidad;

import java.time.LocalDate;

/**
 *
 * @kaiserkey
 * 
 */
public class Alumno {
   private  int id_alumno;
   private  String nombre;
   private  String domicilio;
   private int dni;
   private LocalDate fechaNac;

    public Alumno(int id_alumno, String nombre, String domicilio, int dni, LocalDate fecha) {
        this.id_alumno = id_alumno;
        this.fechaNac=fecha;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
    }
    
    public Alumno(){
        
    }
    
    public void setID_Alumno(int id_alumno){
        this.id_alumno=id_alumno;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }

    public void setDni(int dni){
        this.dni=dni;
    }
    public void setFechaNac(LocalDate fecha){
        this.fechaNac=fecha;
    }

    public LocalDate getFechaNac(){
        return this.fechaNac;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String getDomicilio(){
        return this.domicilio;
    }

    public int getDNI(){
        return this.dni;
    }
   
   public int getIDAlumno(){
       return this.id_alumno;
   }
   
}
