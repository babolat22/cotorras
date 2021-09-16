/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin
 */
public class CursadaData {
      Connection con = null;
      Conexion conexion;

    public CursadaData(Conexion conexion) {
        con= conexion.getConection();  
        this.conexion=conexion;
         
        
        
    }
     
    
      public void guardarCursada(Cursada cursada) throws SQLException{
       
          
        String sql = "INSERT INTO cursada (id_alumno,id_materia) VALUES (?,?);";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, cursada.getAlumno().getId());
        ps.setInt(2, cursada.getMateria().getId());
       // ps.setDouble(3,cursada.getNota());
        ps.executeUpdate();
        
        ResultSet rs= ps.getGeneratedKeys();
        
        if (rs.next()){
        cursada.setId(rs.getInt(1)); //recupero id del usuario de generado en labase de datos
        }
        else {
        System.out.println("No se pudo insertar");
        }
        ps.close();
        
        } catch (SQLException ex){
            
           // Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("No se puede guardar alumno");
        }
                
    }//FIN INSERTAR
    
         public void actualizarNotaCursada(Cursada cursada, double nota) {
    
        String sql = "UPDATE  cursada SET nota=? WHERE id_cursada=?;";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        //ps.setInt(1, cursada.getAlumno().getId());
       // ps.setInt(2, cursada.getMateria().getId());
        ps.setDouble(1,nota);
        ps.setInt (2,cursada.getId());
        ps.executeUpdate();
        ps.close();
     
        } catch (SQLException ex){
            
            //Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("No se pudo actualizar");
        }
              System.out.println("Materia: id " + cursada.getId() + "; Nombre: " + cursada.getAlumno() +"; : " + cursada.getMateria() + " " + cursada.getNota()) ;         
    }//FIN ACTUALIZAR
      
         
         public void borrarCursadaPorIdDeCursada(int id_cursada) throws SQLException{
    
        String sql = "DELETE FROM  cursada WHERE id_cursada= ? ;";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,id_cursada);
        ps.executeUpdate();
        
        ps.close();       
        
        } catch (SQLException ex){
            
           // Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
           System.out.println("No se puede borrar. " + ex.getMessage());
        }
     }//FIN BORRAR
         
         public Cursada buscarCursadaXId(int id_cursada){
          Cursada cursada= null;
       
       String sql="SELECT * FROM cursada WHERE id_cursada=?;";
           try {
               PreparedStatement ps= con.prepareStatement(sql);
               ps.setInt(1, id_cursada);
               ResultSet rs= ps.executeQuery();
               
               while (rs.next()){
               cursada = new Cursada();
               cursada.setId(rs.getInt(1));
               Alumno alumno= buscarAlumno(rs.getInt(2));
               cursada.setAlumno(alumno);
               Materia materia= buscarMateria(rs.getInt(3));
               cursada.setMateria(materia);
               cursada.setNota(rs.getDouble(4));
               
               
               }
               
               ps.close();
           } catch (SQLException ex) {
               System.out.println("No se encontro cursada " + ex.getMessage());
           }
       return cursada;
         }
         
       //BUSCAR CURSADA POR ALUMNO, DEVUELVE LAS MATERIAS CURSADAS DE UN AULUMNO  
       public List <Cursada> buscarCursadaPorAlumno(int id_alumno) {
       
        List <Cursada> cursadas = new ArrayList<>();
        Cursada cursada ;
        Alumno alumno;
        Materia materia;
   
       try{
           String sql = "SELECT cursada.id_cursada, cursada.nota, alumno.id_alumno,alumno.dni,alumno.nombre,"
                + "alumno.domicilio,materia.id_materia,materia.nombre,materia.responsable,materia.periodo "
                + "FROM cursada "
                + "JOIN alumno on alumno.id_alumno= cursada.id_alumno "
                + "JOIN materia on cursada.id_materia=materia.id_materia WHERE cursada.id_alumno=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id_alumno);       
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        cursada =new Cursada() ;
        alumno= new Alumno();
        materia = new Materia();
        cursada.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        cursada.setNota(rs.getDouble(2));
        alumno.setId(rs.getInt(3));        
        alumno.setDni(rs.getInt(4));
        alumno.setNombre(rs.getString(5));
        alumno.setDomicilio(rs.getString(6));
        materia.setId(rs.getInt(7));
        materia.setNombre(rs.getString(8));
        materia.setResponsable(rs.getString(9));
        materia.setPeriodo(rs.getString(10));
        cursada.setAlumno(alumno);
        cursada.setMateria(materia);
               
        cursadas.add(cursada);
        }
         ps.close();
        
        } catch (SQLException ex){
        
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         return cursadas;
    }//FIN BUSCAR CURSADA POR ALUMNO
       
       //BUSCAR CURSADA POR ALUMNO, DEVUELVE LAS MATERIAS CURSADAS DE UN AULUMNO  
       public List <Cursada> buscarCursadaPorMateria(int id_materia) {
       
        List <Cursada> cursadas = new ArrayList<>();
        Cursada cursada ;
        Alumno alumno;
        Materia materia;
   
       try{
           String sql = "SELECT cursada.id_cursada, cursada.nota, alumno.id_alumno,alumno.dni,alumno.nombre,"
                + "alumno.domicilio,materia.id_materia,materia.nombre,materia.responsable,materia.periodo "
                + "FROM cursada "
                + "JOIN alumno on alumno.id_alumno= cursada.id_alumno "
                + "JOIN materia on cursada.id_materia=materia.id_materia WHERE cursada.id_materia=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id_materia);       
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        cursada =new Cursada() ;
        alumno= new Alumno();
        materia = new Materia();
        cursada.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        cursada.setNota(rs.getDouble(2));
        alumno.setId(rs.getInt(3));        
        alumno.setDni(rs.getInt(4));
        alumno.setNombre(rs.getString(5));
        alumno.setDomicilio(rs.getString(6));
        materia.setId(rs.getInt(7));
        materia.setNombre(rs.getString(8));
        materia.setResponsable(rs.getString(9));
        materia.setPeriodo(rs.getString(10));
        cursada.setAlumno(alumno);
        cursada.setMateria(materia);
               
        cursadas.add(cursada);
        }
         ps.close();
        
        } catch (SQLException ex){
        
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         return cursadas;
    }//FIN BUSCAR CURSADA POR ALUMNO
       
        //BUSCAR CURSADA POR ALUMNO, DEVUELVE LAS MATERIAS CURSADAS DE UN AULUMNO  
       public Cursada buscarCursadaPorMateriaYDniAlumno(int id_materia, int dni_alumno) {
       
      //  List <Cursada> cursadas = new ArrayList<>();
        Cursada cursada=null;
        Alumno alumno;
        Materia materia;
   
       try{
           String sql = "SELECT cursada.id_cursada, cursada.nota, alumno.id_alumno,alumno.dni,alumno.nombre,"
                + "alumno.domicilio,materia.id_materia,materia.nombre,materia.responsable,materia.periodo "
                + "FROM cursada "
                + "JOIN alumno on alumno.id_alumno= cursada.id_alumno "
                + "JOIN materia on cursada.id_materia=materia.id_materia WHERE cursada.id_materia=? AND alumno.dni=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id_materia);   
        ps.setInt(2, dni_alumno);  
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        cursada =new Cursada() ;
        alumno= new Alumno();
        materia = new Materia();
        cursada.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        cursada.setNota(rs.getDouble(2));
        alumno.setId(rs.getInt(3));        
        alumno.setDni(rs.getInt(4));
        alumno.setNombre(rs.getString(5));
        alumno.setDomicilio(rs.getString(6));
        materia.setId(rs.getInt(7));
        materia.setNombre(rs.getString(8));
        materia.setResponsable(rs.getString(9));
        materia.setPeriodo(rs.getString(10));
        cursada.setAlumno(alumno);
        cursada.setMateria(materia);
               
        }
         ps.close();
        
        } catch (SQLException ex){
        
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         return cursada;
    }//FIN BUSCAR CURSADA POR ALUMNO
       
      public Alumno buscarAlumno(int id){
           AlumnoData ad= new AlumnoData(conexion);
           return ad.buscarAlumno(id);
       }
       
       public Materia buscarMateria(int id){
           MateriaData md= new MateriaData(conexion);
           return md.buscarMateria(id);
       }
       
       public List <Cursada> obtenerCursadas(){
       List<Cursada> cursadas = new ArrayList<>();
       Cursada cursada= null;
       
       String sql="SELECT * FROM cursada;";
           try {
               PreparedStatement ps= con.prepareStatement(sql);
               ResultSet rs= ps.executeQuery();
               
               while (rs.next()){
               cursada = new Cursada();
               cursada.setId(rs.getInt(1));
               Alumno alumno= buscarAlumno(rs.getInt(2));
               cursada.setAlumno(alumno);
               Materia materia= buscarMateria(rs.getInt(3));
               cursada.setMateria(materia);
               cursada.setNota(rs.getDouble(4));
               cursadas.add(cursada);
               
               }
               
               ps.close();
           } catch (SQLException ex) {
               System.out.println("No se encontro cursada " + ex.getMessage());
           }
       return cursadas;
       }
       
}
 