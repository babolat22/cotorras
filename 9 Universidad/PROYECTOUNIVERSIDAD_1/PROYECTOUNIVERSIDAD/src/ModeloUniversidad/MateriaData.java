
package ModeloUniversidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @kaiserkey
 * 
 */
public class MateriaData {
   private Connection con;
   private ArrayList<Materia> materias = new ArrayList<Materia>();
   
   public MateriaData(Conexion con){
       this.con = con.getConexion();
       if (con == null){
           System.out.println("ERROR la conexion no se ha establecido en MateriaData");
       }else{
           System.out.println("MateriaData Conexion establecida");
       }
       
   }
    
    public ArrayList<Materia> getMateriasBD(){
        return this.materias;
    }
    
    public void guardarMateria(Materia materia){
        
            
           String sql = "INSERT INTO materia (nombre, responsable, periodo) VALUES (?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setString(2, materia.getResponsable());
            ps.setString(3, materia.getPeriodo());
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se guardo la materia correctamente!!");
            }else{
                System.out.println("No se puede guardar el ID de materia");
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo insertar..."+ex.getMessage());        
        }
    }
    
    public void buscarMateria(Materia materias){
    try {
            String sql = "SELECT * FROM materia WHERE id_materia =?;";//sentencia sql para obtener los alumnos por el id

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, materias.getIDMateria());
            
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            
            while(rs.next()){//Muestra los campos obtenidos
                System.out.println("\nMateria encontrada");
                System.out.println("Materias encontradas con el ID --> "+materias.getIDMateria());
                System.out.println("\nID: "+rs.getInt("id_materia"));
                materias.setIDMateria(rs.getInt("id_materia"));
                System.out.println("NOMBRE: "+rs.getString("nombre"));
                materias.setNombre(rs.getString("nombre"));
                System.out.println("RESPONSABLE: "+rs.getString("responsable"));
                materias.setResponsable(rs.getString("responsable"));
                System.out.println("PERIODO: "+rs.getString("periodo"));
                materias.setPeriodo(rs.getString("periodo"));
            }

            ps.close();//CERRAMOS EL STATEMENTS
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar materia..."+ex.getMessage());
        }
    }
    
    
    public void ListarMateriasBD(){
    try {
            String sql = "SELECT * FROM materia;";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while(rs.next()){
                materia = new Materia();
                materia.setIDMateria(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setResponsable(rs.getString("responsable"));
                materia.setPeriodo(rs.getString("periodo"));
                
                materias.add(materia);
            }

            ps.close();//CERRAMOS EL STATEMENTS
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar materia..."+ex.getMessage());
        }
    }
    
    
    
    public void borrarMateria (int id_materia){
    try {
            
            String sql = "DELETE FROM materia WHERE id_materia =?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_materia);
           
            
            int count = ps.executeUpdate();
            if(count > 0){
                System.out.println("Se ha borrado la materia con el ID: "+id_materia);
            }else{
                System.out.println("No se pudo borrar ya que el ID no existe");
            }
            ps.close();
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo borrar..."+ex.getMessage());
        }
        
    
    
    }
    public void actualizarMateria(Materia materia){
    try {
            String sql = "UPDATE materia SET nombre=?, responsable=?, periodo=?  WHERE id_materia=?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setString(2, materia.getResponsable());
            ps.setString(3, materia.getPeriodo());
            ps.setInt(4, materia.getIDMateria());
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se actualizo correctamente");
            }else{
                System.out.println("No se puede actualizar");
            }
            ps.close();//CERRAMOS EL STATEMENTS
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error al actualizar materia: " + ex.getMessage());
        }
 
    
    } 
}
