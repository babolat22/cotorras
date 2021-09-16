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
import javax.swing.JOptionPane;
/**
 *
 * @author Martin
 */
public class MateriaData {
     Connection con = null;
    
    public MateriaData(Conexion conexion){
        con= conexion.getConection();
    }
    
    public void guardarMateria(Materia materia) throws SQLException{
    
        String sql = "INSERT INTO materia (nombre,responsable,periodo) VALUES (?,?,?);";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, materia.getNombre());
        ps.setString(2, materia.getResponsable());
        ps.setString(3,materia.getPeriodo());
        ps.executeUpdate();
        
        ResultSet rs= ps.getGeneratedKeys();
        
        if (rs.next()){
        materia.setId(rs.getInt(1)); //recupero id de la materia de generado en labase de datos
        }
        else {
        System.out.println("No se pudo conectar");
        }
        ps.close();
        
        } catch (SQLException ex){
            
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            //System.out.println(ex.getMessage());
        }
                
    }//FIN INSERTAR
    
    public void actualizarMateria(Materia materia) {
    
        String sql = "UPDATE  materia SET nombre=?,responsable=?,periodo=? WHERE id_materia=?;";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, materia.getNombre());
        ps.setString(2, materia.getResponsable());
        ps.setString(3,materia.getPeriodo());
        ps.setInt(4, materia.getId());
        ps.executeUpdate();
        ps.close();
     
        } catch (SQLException ex){
            
            //Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("No se pudo actualizar");
        }
             System.out.println("Materia: id " + materia.getId() + "; Nombre: " + materia.getNombre() +"; Periodo: " + materia.getPeriodo() +"; Responsable: " +materia.getResponsable() ) ;         
    }//FIN ACTUALIZAR
    
    public boolean borrarMateria(int id) throws SQLException{
    
        String sql = "DELETE FROM  materia WHERE id_materia= ?;";
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,id);
        ps.executeUpdate();
        
        ps.close();       
        return true;
        } catch (SQLException ex){
            
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            //System.out.println(ex.getMessage());
             JOptionPane.showMessageDialog(null, "No se puede eliminar materia.\nVerifique si existe o si esta siendo utilizada en alguna cursada.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
     }//FIN BORRAR
    
     public Materia buscarMateria(int id) {
       
     
        Materia materia= null ;
        try{
        String sql = "SELECT * FROM materia WHERE id_materia = ?;";
        PreparedStatement ps = con.prepareStatement(sql);//, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);       
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        materia =new Materia() ;
        materia.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        materia.setNombre(rs.getString(2));
        materia.setResponsable(rs.getString(3));
        materia.setPeriodo(rs.getString(4));
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
           // Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Error al  buscar " + ex.getMessage());
        }
        // System.out.println("Materia: id " + materia.getId() + "; Nombre: " + materia.getNombre() +"; Periodo: " + materia.getPeriodo() +"; Responsable: " +materia.getResponsable() ) ;       
         return materia;
    }//FIN buscar
      public Materia buscarMateriaXNombre(String nombre) {
       
     
        Materia materia= null ;
        try{
        String sql = "SELECT * FROM materia WHERE nombre LIKE ?;";
        PreparedStatement ps = con.prepareStatement(sql);//, Statement.RETURN_GENERATED_KEYS);
      
        ps.setString(1, "%"+nombre+"%");
        
        ResultSet rs=  ps.executeQuery();
        
        while (rs.next()){
       
        materia =new Materia() ;
        materia.setId(rs.getInt(1));//recupero id de la materia de generado en labase de datos
        materia.setNombre(rs.getString(2));
        materia.setResponsable(rs.getString(3));
        materia.setPeriodo(rs.getString(4));
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
           // Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Error al  buscar " + ex.getMessage());
        }
        // System.out.println("Materia: id " + materia.getId() + "; Nombre: " + materia.getNombre() +"; Periodo: " + materia.getPeriodo() +"; Responsable: " +materia.getResponsable() ) ;       
         return materia;
    }//FIN buscar
     
     public List <Materia> obtenerMaterias(){
       List <Materia> materias = new ArrayList<Materia>();
          try {
            
            
            String sql= "SELECT * FROM materia;";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            Materia materia;
            
            while(rs.next()){
            materia= new Materia();
            materia.setId(rs.getInt("id_materia"));
            materia.setNombre(rs.getString("nombre"));
            materia.setResponsable(rs.getString("responsable"));
            materia.setPeriodo(rs.getString("periodo"));
            materias.add(materia);
            }
           ps.close();
          
          }   catch (SQLException ex) {
           // Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);obtener
            System.out.println("No se puede obtener lista de materias. ");
           
        }
          return materias;
          
      }
}
