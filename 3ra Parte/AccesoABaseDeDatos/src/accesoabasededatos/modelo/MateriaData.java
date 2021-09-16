package accesoabasededatos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MateriaData {
    private Connection connection = null;

    public MateriaData(Conexion conexion) {
        connection = conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        try{
            String sql = "INSERT INTO materia (nombre) VALUES (?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next())
                materia.setId(rs.getInt(1));
            else
               System.out.println("Error no hay ID");
            ps.close();

        }
        catch(SQLException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public List<Materia> obtenerMaterias(){
        List<Materia> materias = new ArrayList<Materia>(); //para el listado
        try {
            String sql = "Select * from materia";   
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();  //conjunto registros
            Materia materia;
            while(rs.next()){
               materia = new Materia();
               materia.setId(rs.getInt("id"));
               materia.setNombre(rs.getString("nombre"));
               materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }
    
    public Materia buscarMateria(int id){
    
        Materia materia=null;
   
            String sql = "SELECT * FROM materia WHERE id =?;";
        try {  
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                materia = new Materia();
                materia.setId(resultSet.getInt("id"));
                materia.setNombre(resultSet.getString("nombre"));
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        return materia;
    }
    public void borrarMateria (int id){
    try {
            String sql = "DELETE FROM materia WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una materia: " + ex.getMessage());
        }
     
    }
    public void actualizarMateria(Materia materia){
    try {
            
            String sql = "UPDATE materia SET nombre = ? WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, materia.getNombre());
            statement.setInt(2, materia.getId());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
     
        
    
    }
    }
    

