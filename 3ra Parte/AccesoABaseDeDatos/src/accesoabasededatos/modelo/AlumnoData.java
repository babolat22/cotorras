package accesoabasededatos.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlumnoData {
    private Connection connection = null;

    public AlumnoData(Conexion conexion) {
        connection = conexion.getConexion();
    }
        
    public void guardarAlumno(Alumno alumno){
        try {
            
            String sql = "INSERT INTO alumno (nombre, fecNac, activo) VALUES ( ? , ? , ?);";   // 1

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, alumno.getNombre());
            statement.setDate(2, Date.valueOf(alumno.getFecNac()));             //2
            statement.setBoolean(3, alumno.getActivo());
           
            statement.executeUpdate();                                          //3
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                alumno.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            statement.close();                                                  //4
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnos(){
        List<Alumno> alumnos = new ArrayList<Alumno>();         //Listado            

        try {
            String sql = "SELECT * FROM alumno;";           //1
            PreparedStatement statement = connection.prepareStatement(sql);  //2
            ResultSet resultSet = statement.executeQuery();     //3
            Alumno alumno;
            while(resultSet.next()){                                //4
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);                            // 5
            }      
            statement.close();                                  //6
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return alumnos;
    }
    
    public void borrarAlumno(int id){
    try {
            
            String sql = "DELETE FROM alumno WHERE id =?;";         //1

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);                            //2
           
            
            statement.executeUpdate();                          //3
            
            
            statement.close();                                      //4
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarAlumno(Alumno alumno){
    
        try {
            
            String sql = "UPDATE alumno SET nombre = ?, fecNac = ? , activo =? WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, alumno.getNombre());
            statement.setDate(2, Date.valueOf(alumno.getFecNac()));
            statement.setBoolean(3, alumno.getActivo());
            statement.setInt(4, alumno.getId());  // a quien?
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    
    }
    
    public Alumno buscarAlumno(int id){
    Alumno alumno=null;
        try {
            
            String sql = "SELECT * FROM alumno WHERE id =?;";           //1

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);                                    //2
           
            
            ResultSet resultSet=statement.executeQuery();               //3
            
            while(resultSet.next()){                                    //4
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                
            }      
            statement.close();                                           //5   
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        return alumno;
    }
    
}
