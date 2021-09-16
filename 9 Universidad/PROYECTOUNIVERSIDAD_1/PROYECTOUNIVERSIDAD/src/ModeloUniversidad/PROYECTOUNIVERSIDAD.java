
package ModeloUniversidad;

import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @kaiserkey
 * 
 */
public class PROYECTOUNIVERSIDAD {

    /**
     * 
     * @KAISERKEY
     * 
     */
    public static void main(String[] args) throws SQLException {
        Conexion con = new Conexion();
        con.crearConexion();
        con.getConexion();
        System.out.println("\nDIAGRAMA DE LA BASE DE DATOS");
        String bd = null;
        String tabla = "%";
        con.getDataBaseMetaDataTables();
        con.getDataBaseMetaDataColumns(bd,tabla);
        
/*
        Alumno a1 = new Alumno();
        a1.setNombre("Fernando");
        a1.setDni(37930187);
        a1.setDomicilio("Ramon Valdez 734");
        a1.setFechaNac(LocalDate.of(1994, 01, 24));
        AlumnoData ad= new AlumnoData(con);
        ad.guardarAlumno(a1);
        a1.setID_Alumno(24);
        ad.buscarAlumno(a1);
        //ad.borrarAlumno(20);

        //a1.setNombre("GONZALEZ");
        //a1.setDni(37930187);
        //a1.setDomicilio("Ramon Valdez 734");
        //a1.setFechaNac(LocalDate.of(1994, 01, 24));
        //ad.actualizarAlumno(a1);
        //ad.listarAlumnosBD();
       //ad.listAlumnos();
                            
        MateriaData md= new MateriaData(con);        
        Materia m = new Materia();
        //m.setNombre("Matematicas");
        //m.setPeriodo("PrimerC");
        //m.setResponsable("Fulanito");
        //md.guardarMateria(m);
        //md.borrarMateria(14);
       m.setIDMateria(18);
       md.buscarMateria(m);
       // md.actualizarMateria(m);
        
        CursadaData cd = new CursadaData(con);
        Cursada c = new Cursada();
        c.setNota(8);
        c.setAlumno(a1);
        c.setMateria(m);
       // cd.guardarCursada(c);
        c.setIDCursada(12);
        //cd.buscarCursadas(c, md, ad);
        //a1.setID_Alumno(24);
        //m.setIDMateria(18);
        //cd.obtenerCursadasXAlumno(a1);
        //cd.obtenerMateriasCursadas(m);
         //cd.borrarCursada(c);
        //cd.actualizarNotaCursada(a1, m, c);
        
        */
        
    }
    
}
