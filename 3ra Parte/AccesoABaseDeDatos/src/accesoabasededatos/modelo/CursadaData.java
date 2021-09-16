/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CursadaData {
    private Connection connection = null;
    private Conexion conexion;

    public CursadaData(Conexion conexion) {
        this.conexion=conexion;
        connection = conexion.getConexion();
    }
    
    
    public void guardarCursada(Cursada cursada){
        try {
            
            String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursada.getAlumno().getId());
            statement.setInt(2, cursada.getMateria().getId());
            statement.setInt(3, cursada.getNota());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cursada.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    public List<Cursada> obtenerCursadas(){
        List<Cursada> cursadas = new ArrayList<Cursada>();
        //necesito crear una lista para recuperar las cursadas    

        try {
            String sql = "SELECT * FROM cursada;";                          //1
            PreparedStatement statement = connection.prepareStatement(sql); //2
            ResultSet resultSet = statement.executeQuery();                 //3
            Cursada cursada;  // armo un objeto cursada
            while(resultSet.next()){                                        //4
                cursada = new Cursada();    //instanciado
                cursada.setId(resultSet.getInt("id"));  //id de cursada
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));    //4A- creamos un alumno con ALUMNO DATA
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria")); //4B- creamos una materia con materia DATA
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);                                      //5
            }      
            statement.close();                                              //6
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return cursadas;                 //retornar la lista de cursadas                           
    }
    public List<Cursada> obtenerCursadasXAlumno(int id){
        List<Cursada> cursadas = new ArrayList<Cursada>();
            

        try {
            String sql = "SELECT * FROM cursada WHERE idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);             // filtrar para un alumno
            ResultSet resultSet = statement.executeQuery();
            Cursada cursada;
            while(resultSet.next()){
                cursada = new Cursada();
                cursada.setId(resultSet.getInt("id"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return cursadas;
    }

    
    public Alumno buscarAlumno(int id){
            // permite reestructurar un objeto Alumno desde un id
        AlumnoData ad=new AlumnoData(conexion);
        
        return ad.buscarAlumno(id);
        
    }
    
    public Materia buscarMateria(int id){
             // permite reestructurar un objeto materia desde un id
        MateriaData md=new MateriaData(conexion);
        return md.buscarMateria(id);
    
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();  // solo si hay una cursada a esa materia se agrega!
            

        try {
            String sql = "SELECT idMateria, nombre FROM cursada, materia WHERE cursada.idMateria = materia.id\n" +
"and cursada.idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setId(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            
                // aquellas que no estan en la subconsulta, o grupo. De las que cursa, no elegir ninguna
        try {
            String sql = "Select * from materia where id not in "
                    + "(select idMateria from cursada where idAlumno =?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setId(resultSet.getInt("id"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public void borrarCursadaDeUnaMateriaDeunAlumno(int idAlumno,int idMateria){
    
        try {
            
            String sql = "DELETE FROM cursada WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idAlumno);
            statement.setInt(2, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        
        
        
    
    }
    public void actualizarNotaCursada(int idAlumno,int idMateria, int nota){
                //modificar una cursada...solo seria para la nota en este caso.
        try {
            
            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        
        
        
    
    }
    
}
