/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author programador
 */
public class AlumnoData {
    Connection con = null;
    
    public AlumnoData(Conexion conexion){
        con= conexion.getConection();
    }
    
    public void guardarAlumno(Alumno alumno) throws SQLException{
    
        String sql = "INSERT INTO alumno (dni,nombre,domicilio,fechaNac) VALUES (?,?,?,?);";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, alumno.getDni());
        ps.setString(2, alumno.getNombre());
        ps.setString(3,alumno.getDomicilio());
        ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
                
        ps.executeUpdate();
        
        ResultSet rs= ps.getGeneratedKeys();
        
        if (rs.next()){
        alumno.setId(rs.getInt(1)); //recupero id del usuario de generado en labase de datos
        }
        else {
        System.out.println("No se pudo conectar");
        }
        ps.close();
        
        } catch (SQLException ex){
            
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE,null,ex);
            //System.out.println(ex.getMessage());
        }
                
    }//FIN INSERTAR
    
     public void actualizarAlumno(Alumno alumno) {
    
        
        try{
            
        String sql = "UPDATE  alumno SET dni=? ,nombre=? ,domicilio=? , fechaNac=? WHERE id_alumno=?;";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, alumno.getDni());
        ps.setString(2, alumno.getNombre());
        ps.setString(3,alumno.getDomicilio());
        ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
        ps.setInt(5, alumno.getId());
        ps.executeUpdate();
        ps.close();
        /*ResultSet rs= ps.getGeneratedKeys();
        
        if (rs.next()){
        alumno.setId(rs.getInt(1)); //recupero id del usuario de generado en labase de datos
        }
        else {
        System.out.println("No se pudo actualizar");
        }
          ps.close();
         */ 
        } catch (SQLException ex){
            
           // Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE,null,ex);
            //System.out.println(ex.getMessage());
               System.out.println("No se pudo actualizar");
        }
         System.out.println("Alumno: id: " + alumno.getId() + "; Nombre:  " + alumno.getNombre() +"; Dni: " + alumno.getDni() +"; Domicilio:  " +alumno.getDomicilio()) ;       
     }//FIN ACTUALIZAR
     
      public boolean borrarAlumno(int id) throws SQLException{
        
        String sql = "DELETE FROM  alumno WHERE id_alumno=?;";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,id);
        ps.executeUpdate();
        
        ps.close();       
        return true;
        } catch (SQLException ex){
            
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE,null,ex);
            //System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se puede eliminar alumno.Verifique si existe o si esta inscripto en alguna materia", "Error", JOptionPane.ERROR_MESSAGE);
          return false;
        }
     }//FIN BORRAR
     
      /* public Alumno buscarAlumno(int id,String nombre,int dni) {
           
        Alumno alumno= null ;
        try{
        //String sql = "SELECT * FROM alumno WHERE id_alumno = ?;";
        String sql ="SELECT * FROM alumno WHERE id_alumno = ? or nombre LIKE'%?%'or dni LIKE '%?%';";
        PreparedStatement ps = con.prepareStatement(sql);//, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);  
        ps.setString(2, nombre); 
        ps.setInt(3, dni); 
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        alumno =new Alumno() ;
        alumno.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        alumno.setDni(rs.getInt(2));
        alumno.setNombre(rs.getString(3));
        alumno.setDomicilio(rs.getString(4));
        alumno.setFechaNac(rs.getDate(5).toLocalDate());
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
           // Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         //System.out.println("Alumno: id: " + alumno.getId() + "; Nombre:  " + alumno.getNombre() +"; Dni: " + alumno.getDni() +"; Domicilio:  " +alumno.getDomicilio()) ;       
         return alumno;
    }//FIN buscar*/
      
      public Alumno buscarAlumno(int id) {
       
     
        Alumno alumno= null ;
        try{
        String sql = "SELECT * FROM alumno WHERE id_alumno = ?;";
       // String sql ="SELECT * FROM alumno WHERE id_alumno = ? or nombre LIKE' %?%'or dni LIKE '%?%';";
        PreparedStatement ps = con.prepareStatement(sql);//, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);  
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        alumno =new Alumno() ;
        alumno.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        alumno.setDni(rs.getInt(2));
        alumno.setNombre(rs.getString(3));
        alumno.setDomicilio(rs.getString(4));
        alumno.setFechaNac(rs.getDate(5).toLocalDate());
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
           // Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         //System.out.println("Alumno: id: " + alumno.getId() + "; Nombre:  " + alumno.getNombre() +"; Dni: " + alumno.getDni() +"; Domicilio:  " +alumno.getDomicilio()) ;       
         return alumno;
    }//FIN buscar
      
      public Alumno buscarAlumnoXDNI(int dni) {
       
     
        Alumno alumno= null ;
        try{
        String sql = "SELECT * FROM alumno WHERE dni = ?;";
       // String sql ="SELECT * FROM alumno WHERE id_alumno = ? or nombre LIKE' %?%'or dni LIKE '%?%';";
        PreparedStatement ps = con.prepareStatement(sql);//, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, dni);  
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        alumno =new Alumno() ;
        alumno.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        alumno.setDni(rs.getInt(2));
        alumno.setNombre(rs.getString(3));
        alumno.setDomicilio(rs.getString(4));
        alumno.setFechaNac(rs.getDate(5).toLocalDate());
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
           // Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         //System.out.println("Alumno: id: " + alumno.getId() + "; Nombre:  " + alumno.getNombre() +"; Dni: " + alumno.getDni() +"; Domicilio:  " +alumno.getDomicilio()) ;       
         return alumno;
    }//FIN buscar x dni
      
      public Alumno buscarAlumnoXNombre(String nombre) {
       
     
        Alumno alumno= null ;
        try{
        String sql = "SELECT * FROM alumno WHERE nombre LIKE ?;";
       // String sql ="SELECT * FROM alumno WHERE id_alumno = ? or nombre LIKE' %?%'or dni LIKE '%?%';";
        PreparedStatement ps = con.prepareStatement(sql);//, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, "%"+nombre+"%");  
      //  preparedStatement.setString(1, "%" + DT + "%");
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        alumno =new Alumno() ;
        alumno.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        alumno.setDni(rs.getInt(2));
        alumno.setNombre(rs.getString(3));
        alumno.setDomicilio(rs.getString(4));
        alumno.setFechaNac(rs.getDate(5).toLocalDate());
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         //System.out.println("Alumno: id: " + alumno.getId() + "; Nombre:  " + alumno.getNombre() +"; Dni: " + alumno.getDni() +"; Domicilio:  " +alumno.getDomicilio()) ;       
         return alumno;
    }//FIN buscar x nombre
      
      
      public List <Alumno> obtenerAlumnos(){
       List <Alumno> alumnos = new ArrayList<Alumno>();
          try {
            
            
            String sql= "SELECT * FROM alumno;";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            Alumno alumno;
            
            while(rs.next()){
            alumno= new Alumno();
            alumno.setId(rs.getInt("id_alumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setDomicilio(rs.getString("domicilio"));
            alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
            alumnos.add(alumno);
            }
           ps.close();
          
          }   catch (SQLException ex) {
           // Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);obtener
            System.out.println("No se puede obtener lista de alumnos. ");
           
        }
          return alumnos;
          
      }
}

   
   

