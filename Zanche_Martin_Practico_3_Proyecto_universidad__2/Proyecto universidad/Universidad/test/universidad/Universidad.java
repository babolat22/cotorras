/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import modelo.Materia;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Alumno;
import modelo.AlumnoData;
import modelo.Conexion;
import modelo.Cursada;
import modelo.CursadaData;
import modelo.MateriaData;


/**
 *
 * @author programador
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      // TODO code application logic here
      
//       Conexion con = new Conexion();
//       AlumnoData ad = new AlumnoData(con);
//       MateriaData md = new MateriaData(con);
//       CursadaData cd = new CursadaData(con);
//       
//       // ---------------------------------
//       //GUARDAR ALUMNO
//       //Alumno alu1 = new Alumno(2345888,"Julio Sosa", "Koles 12");
//       //Alumno alu2 = new Alumno(746768,"Laura tica", "cameHouse");
//       // alu2.setId(2);
//       //Alumno alu3 = new Alumno(32889400,"Gonzalo Ganzua", "jhj 11, San Luis");
//       // ad.guardarAlumno(alu1);
//       // ad.guardarAlumno(alu2);
//       // ad.guardarAlumno(alu3);*/
//       // AlumnoData ad = new AlumnoData(con);
//     
//       //BORRAR ALUMNO
//       // ad.borrarAlumno(5);
//      // ---------------------------------
//     // ACTUALIZAR ALUMNO 
//   //  Alumno alu1 = new Alumno ();
//   //   alu1= ad.buscarAlumno(4);
//   //   alu1.setFechaNac(LocalDate.of(1995,03,22)); //ACTUALIZA EL CAMPO EN EL OBJETO PARA LUEGO ACTUALIZAR EN LA BASE
//   //  ad.actualizarAlumno(alu1);
//        
//     // --------------------------------- 
//     //BUSCAR ALUMNO
//      Alumno alu1 = ad.buscarAlumno(4);
//         System.out.println("\nALUMNO ");
//        System.out.println("DNI: " + alu1.getDni() + ", Nombre: "  + alu1.getNombre() + ", DOMICICLIO: " + alu1.getDomicilio()  + ", FECHA: " + alu1.getFechaNac()+"\n");
//  
//      //alu1= ad.buscarAlumno(3);
//     
//    //GUARDAR MATERIA
//    // Materia mat1 = new Materia("Fisica", "Jorge Asis", "1er Cuatrimestre");
//    //Materia mat2 = new Materia("Matematica", "Alberto Gomez", "1er Cuatrimestre");
//    //Materia mat3 = new Materia("Ciencias Sociales", "Gabriela Misheti", "1er Cuatrimestre");
//    //Materia mat5 = new Materia("Ingles", "Carlos Melconian", "2do Cuatrimestre");
//     
//    //md.guardarMateria(mat1);
//    //md.guardarMateria(mat5);
//    //md.guardarMateria(mat3);
//    // System.out.println("Se guardaron materias en la tabla materias");
//    // ---------------------------------
//    //BUSCAR MATERIA
//    Materia mat1= md.buscarMateria(6);
//    System.out.println("\nMATERIA ");
//    System.out.println("NOMBRE MATERIA: " + (mat1.getNombre()) + ", RESPONSABLE: " + (mat1.getResponsable()) 
//     + ", PERIODO: " + (mat1.getPeriodo()) + ", ID MATERIA: " + (mat1.getId()));
//  
//    // ---------------------------------
//   
//     //BORRAR MATERIA
//     // md.borrarMateria(4);
//     
//    // --------------------------------
//     
//    //PRUEBA ACTUALIZAR MATERIA
//    // Materia mat1 = new Materia();
//    //mat1= md.buscarMateria(6);
//    //mat1.setResponsable("Profesor Jamez");
//    // md.actualizarMateria(mat1);
//    // -- --------------------------------
//   
//    //GUARDAR CURSADA
//    /* Alumno alu1 = new Alumno ();
//     alu1= ad.buscarAlumno(4);
//     Materia mat1 = new Materia();
//     mat1= md.buscarMateria(6);
//     Cursada cur1 = new Cursada(alu1,mat1,4.50);
//     cd.guardarCursada(cur1);*/
//     
//    //----------------------------------
//     //BUSCAR CURSADA POR ALUMNO
//    //Cursada cur1= new Cursada();
//     List <Cursada> cursadas ;//= new ArrayList<>();
//     cursadas=cd.buscarCursadaPorAlumno(1);
//      System.out.println("\nMATERIAS DEL ALUMNO");
//      System.out.println("DNI: " + cursadas.get(0).getAlumno().getDni() + ", Nombre: "  + cursadas.get(0).getAlumno().getNombre());
//      System.out.println("MATERIAS: ");
//      for (int i = 0; i < cursadas.size(); i++) {
//      System.out.println("ID CURSADA: " + (cursadas.get(i).getId()) + ", NOMBRE MATERIA: " + (cursadas.get(i).getMateria().getNombre()) 
//       + ", NOTA: " + (cursadas.get(i).getNota()) + ", RESPONSABLE: " + (cursadas.get(i).getMateria().getResponsable()) +
//       ", PERIODO: " + (cursadas.get(i).getMateria().getPeriodo()));
//       }//FIN BUSQUEDA POR ALUMNO
//      
//     // ---------------------------------------
//   //  BUSQUEDA DE CURSADA POR MATERIA
//      cursadas=cd.buscarCursadaPorMateria(5);
//      System.out.println("\nCURSADA DE MATERIA ");
//      System.out.println("ID CURSADA: " + (cursadas.get(0).getId()) + ", NOMBRE MATERIA: " + (cursadas.get(0).getMateria().getNombre()) 
//       + ", RESPONSABLE: " + (cursadas.get(0).getMateria().getResponsable()) +
//       ", PERIODO: " + (cursadas.get(0).getMateria().getPeriodo()));
//       System.out.println("ALUMNOS EN CURSADA: ");
//       for (int i = 0; i < cursadas.size(); i++) {      
//       System.out.println("DNI: " + cursadas.get(i).getAlumno().getDni() + ", Nombre: "  + cursadas.get(i).getAlumno().getNombre()  + ", NOTA: " + (cursadas.get(i).getNota()));
//      
//    }
//       Cursada cur1= cd.buscarCursadaPorMateriaYDniAlumno(5, 98738);
//       System.out.println("\nCURSADA POR ID MATERIA Y DNI ALUMNO");
//       System.out.println("ID CURSADA: " + (cur1.getId()) + ", NOMBRE MATERIA: " + (cur1.getMateria().getNombre()) 
//       + ", RESPONSABLE: " + (cur1.getMateria().getResponsable()) +
//       ", PERIODO: " + (cur1.getMateria().getPeriodo()));
//       System.out.println("DNI: " + cur1.getAlumno().getDni() + ", Nombre: "  + cur1.getAlumno().getNombre()  + ", NOTA: " + (cur1.getNota()));
//      //BORRAR CURSADA
//      //cd.borrarCursadaPorIdDeCursada(8);
//      
//     // ---------------------------------
//      //ACTUALIZAR NOTA DE CURSADA 
//    // Cursada cur2= cd.buscarCursadaPorMateriaYDniAlumno(5, 98738);
//     //cd.actualizarNotaCursada(cur2, 8.5);
//     
//     cursadas=cd.obtenerCursadas();
//          System.out.println("\nLISTA DE CURSDAS");
//           for (int i = 0; i < cursadas.size(); i++) {
//      System.out.println("ID CURSADA: " + (cursadas.get(i).getId()) + ", NOMBRE MATERIA: " + (cursadas.get(i).getMateria().getNombre()) 
//       + ", NOTA: " + (cursadas.get(i).getNota()) + ", RESPONSABLE: " + (cursadas.get(i).getMateria().getResponsable()) +
//       ", PERIODO: " + (cursadas.get(i).getMateria().getPeriodo()) + ", ALUMNO DNI: " + cursadas.get(i).getAlumno().getDni() + ", Nombre: "  + cursadas.get(i).getAlumno().getNombre()  + ", NOTA: " + (cursadas.get(i).getNota()));
//       }//FIN BUSQUEDA POR ALUMNO
//           
 }
}