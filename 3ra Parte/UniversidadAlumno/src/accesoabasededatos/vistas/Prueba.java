
package accesoabasededatos.vistas;

import accesoabasededatos.modelo.Alumno;
import accesoabasededatos.modelo.AlumnoData;
import accesoabasededatos.modelo.Conexion;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba {
    private AlumnoData alumnoData;
    private Conexion conexion;
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        LocalDate fecha = LocalDate.now();
        Alumno estudioso = new Alumno("LaPopis", fecha ,false);//0
        new Prueba().conectar(estudioso);
        
    } 
    
    void conectar(Alumno estudioso){
        try {
           conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
           alumnoData = new AlumnoData(conexion);
           alumnoData.guardarAlumno(estudioso);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 
        