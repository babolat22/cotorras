package accesoabasededatos.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnoData{
    private Connection conexion = null;
    
    public AlumnoData(Conexion conexion){
        this.conexion = conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno a){    // obj alumno sin id valido
        String query = "INSERT INTO alumno(nombre, fecNac, activo) VALUES (?,?,?)";  //1
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS); //2
            ps.setString(1, a.getNombre());
            ps.setDate(2, Date.valueOf(a.getFecNac()));
            ps.setBoolean(3, a.getActivo());
            ps.executeUpdate();     // 3
            ResultSet rs = ps.getGeneratedKeys();  // recupero y asigno
            if(rs.next())
                a.setId(rs.getInt(1));
            else
                System.out.println("No se pudo tener ID");
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Alumno buscarAlumno(int id){
        Alumno a= null;
        String query = "SELECT * FROM alumno WHERE id=?";  // 1
        try {
            PreparedStatement ps = conexion.prepareStatement(query); //2
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();  //3
            while(rs.next()){     //4
                a = new Alumno();
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                a.setFecNac(rs.getDate("fechaNac").toLocalDate());
                a.setActivo(rs.getBoolean("activo"));
                
            }
            ps.close();   // 5
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    public List<Alumno> listarAlumnos(int id){
        Alumno a= null;
        List<Alumno> alumnos = new ArrayList<Alumno>();     
        String query = "SELECT * FROM alumno";  // 1
        try {
            PreparedStatement ps = conexion.prepareStatement(query); //2
            ResultSet rs = ps.executeQuery();  //3
            while(rs.next()){     //4
                a = new Alumno();
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                a.setFecNac(rs.getDate("fechaNac").toLocalDate());
                a.setActivo(rs.getBoolean("activo"));
                alumnos.add(a);
            }
            ps.close();   // 5
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alumnos;
    }
    
    public void actualizarAlumno(Alumno a){
        
       String query = "UPDATE alumno SET nombre =?, fecNac= ? ,activo=? WHERE id = ?";  //1
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query); //2
            ps.setString(1, a.getNombre());
            ps.setDate(2, Date.valueOf(a.getFecNac()));
            ps.setBoolean(3, a.getActivo());
            ps.setInt(4, a.getId());
            ps.executeUpdate();     // 3
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        } 
   }
    
    public void borrarAlumno(int id){
            
        String query = "DELETE FROM alumno WHERE id = ?";  //1
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query); //2
            ps.setInt(1, id);
            ps.executeUpdate();     // 3
            
            ps.close();  // 4
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}

