
package ModeloUniversidad;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @kaiserkey
 * 
 */
public class AlumnoData {
    private Connection con;
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    public AlumnoData(Conexion con){
        this.con = con.getConexion();
        if (con == null){
            System.out.println("ERROR la conexion no se ha establecido en MateriaData");
        }else{
            System.out.println("AlumnoData Conexion establecida");
        }

    }
    
    
    
    public void listAlumnos(){
        
        for(int x = 0;x < alumnos.size(); x++){
            System.out.println("\nID--> "+alumnos.get(x).getIDAlumno());
            System.out.println("NOMBRE--> "+alumnos.get(x).getNombre());
            System.out.println("DNI--> "+alumnos.get(x).getDNI());
            System.out.println("DOMICILIO--> "+alumnos.get(x).getDomicilio());
            System.out.println("FECHA DE NACIMIENTO--> "+alumnos.get(x).getFechaNac());
        }
    }
    
    public ArrayList<Alumno> getAlumnosBD(){
        return this.alumnos;
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (nombre, domicilio, dni, fecha_nacimiento) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getDomicilio());
            ps.setInt(3, alumno.getDNI());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se guardo el alumno correctamente!!");
            }else{
                System.out.println("No se puede guardar el ID de alumno");
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo insertar..."+ex.getMessage());
        }
    }
    
    public void actualizarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET dni=?, nombre=?, domicilio=?, fecha_nacimiento=? WHERE id_alumno=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDNI());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getDomicilio());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIDAlumno());
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se actualizo correctamente");
            }else{
                System.out.println("No se puede actualizar");
            }
            ps.close();//CERRAMOS EL STATEMENTS
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo actualizar..."+ex.getMessage());
        }
    }
    
    public void borrarAlumno(int id_alumno){
    try {
            
            String sql = "DELETE FROM alumno WHERE id_alumno =?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
                      
            int count = ps.executeUpdate();
            if(count > 0){
                System.out.println("Se ha borrado el alumno con el ID: "+id_alumno);
            }else{
                System.out.println("No se pudo borrar ya que el ID no existe");
            }
            
            ps.close();
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo borrar..."+ex.getMessage());
        }
        
    
    }
    
    public void buscarAlumno(Alumno alumno){
    try {
            
            String sql = "SELECT * FROM alumno WHERE id_alumno =?;";//sentencia sql para obtener los alumnos por el id

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIDAlumno());
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            while(rs.next()){//Muestra los campos obtenidos
                System.out.println("\nAlumnos encontrados con el ID --> "+alumno.getIDAlumno());
                System.out.println("\nID: "+rs.getInt("id_alumno"));
                alumno.setID_Alumno(rs.getInt("id_alumno"));
                System.out.println("NOMBRE: "+rs.getString("nombre"));
                alumno.setNombre(rs.getString("nombre"));
                System.out.println("DOMICILIO: "+rs.getString("domicilio"));
                alumno.setDomicilio(rs.getString("domicilio"));
                System.out.println("DNI: "+rs.getInt("dni"));
                alumno.setDni(rs.getInt("dni"));
                System.out.println("FECHA DE NACIMIENTO: "+rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setFechaNac(rs.getDate("fecha_nacimiento").toLocalDate());
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar alumno..."+ex.getMessage());
        }
        
    }

    public void listarAlumnosBD(){
        
        try {
            String sql = "SELECT * FROM alumno;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while(rs.next()){
                alumno = new Alumno();
                alumno.setID_Alumno(rs.getInt("id_alumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setDomicilio(rs.getString("domicilio"));
                alumno.setFechaNac(rs.getDate("fecha_nacimiento").toLocalDate());
                alumnos.add(alumno);
                
            }      
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: No se pudo obtener..."+ex.getMessage());
        }
    }
}
