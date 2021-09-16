
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
public class CursadaData{
    private Connection con;
    ArrayList<Cursada> cursadas = new ArrayList<Cursada>();
    ArrayList<Materia> materias = new ArrayList<Materia>();
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
   public CursadaData(Conexion con){
       this.con = con.getConexion();
       if (con == null){
           System.out.println("ERROR la conexion no se ha establecido en CursadaData");
       }else{
           System.out.println("CursadaData Conexion establecida");
       }
       
   }
   
   public ArrayList<Cursada> getCursadasBD(){
       return this.cursadas;
   }
    
    public void guardarCursada(Cursada cursada){
        try {
            
            String sql = "INSERT INTO cursada (id_alumno, id_materia, nota) VALUES ( ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cursada.getAlumno().getIDAlumno());
            ps.setInt(2, cursada.getMateria().getIDMateria());
            ps.setDouble(3, cursada.getNota());
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se guardo el alumno correctamente!!");
            }else{
                System.out.println("No se puede guardar cursada");
            }
            ps.close();//CERRAMOS EL STATEMENTS
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo guardar CursadaData..."+ex.getMessage());
        }
    }
    

    
    public void buscarCursadas(Cursada cursada, MateriaData materias, AlumnoData alumnos){
            
        try {
            String sql = "SELECT * FROM cursada WHERE id_cursada = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cursada.getIDCursada());
            ResultSet rs = ps.executeQuery();
            Materia materia;
            Alumno alumno;
            while(rs.next()){
                materia = new Materia();
                alumno = new Alumno();
                System.out.println("Cursadas Obtenidas: ");
                System.out.println("ID_CURSADA: "+rs.getInt("id_cursada"));
                System.out.println("ID_MATERIA: "+rs.getInt("id_materia"));
                System.out.println("ID_ALUMNO: "+rs.getInt("id_alumno"));
                
                materia.setIDMateria(rs.getInt("id_materia"));
                materias.buscarMateria(materia);
                cursada.setMateria(materia);
                System.out.println("NOTA: "+rs.getInt("nota"));
                cursada.setNota(rs.getInt("nota"));
                alumno.setID_Alumno(rs.getInt("id_alumno"));
                alumnos.buscarAlumno(alumno);
                cursada.setAlumno(alumno);
            }      
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar cursada..."+ex.getMessage());
        }
    }
    
    public void obtenerCursadasXAlumno(Alumno alumno){
        try {
            String sql = "SELECT * FROM alumno AS a, "
                    + "materia AS b, "
                    + "cursada AS c "
                    + "WHERE a.id_alumno = ? AND c.id_alumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,alumno.getIDAlumno());
            ps.setInt(2, alumno.getIDAlumno());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("|| ID: "+rs.getInt("c.id_cursada")+
                        "||"+rs.getString("a.nombre")+
                        "||"+rs.getString("b.nombre")+
                        "||"+rs.getInt("c.nota")+"||");
            }      
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
    }
    
    public void obtenerMateriasCursadas(Materia materias){
        try {
            String sql = "SELECT * FROM alumno AS a, "
                    + "materia AS b, "
                    + "cursada AS c "
                    + "WHERE b.id_materia = ? AND c.id_materia = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, materias.getIDMateria());
            ps.setInt(2, materias.getIDMateria());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("|| ID: "+rs.getInt("c.id_cursada")+
                        "||"+rs.getString("b.nombre"));
            }      
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
    }
    
    public void listarCursadasBD(){
        try{
            String sql = "SELECT * FROM cursada";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            Materia materia;
            Cursada cursada;
            while(rs.next()){
                cursada = new Cursada();
                alumno = new Alumno();
                materia = new Materia();
                
                cursada.setIDCursada(rs.getInt("id_cursada"));
                cursada.setNota(rs.getInt("nota"));
                alumno.setID_Alumno(rs.getInt("id_alumno"));
                cursada.setAlumno(alumno);
                materia.setIDMateria(rs.getInt("id_materia"));
                cursada.setMateria(materia);
                cursadas.add(cursada);
            }      
            ps.close();
            
        }catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: No se pudo obtener..."+ex.getMessage());
        }
    }
    
    public void borrarCursada(Cursada cursadas){
    
        try {
            
            String sql = "DELETE FROM cursada"
                    + " WHERE id_alumno=? AND id_materia=?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cursadas.getAlumno().getIDAlumno());
            ps.setInt(2, cursadas.getMateria().getIDMateria());

            int count = ps.executeUpdate();
            if(count > 0){
                System.out.println("Se ha borrado el alumno con el ID: "+cursadas.getAlumno().getIDAlumno());
            }else{
                System.out.println("No se pudo borrar ya que el ID no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo borrar..."+ex.getMessage());
        }
    }
    public void actualizarNotaCursada(Alumno alumno,Materia materia, Cursada cursada){
        try {
            
            String sql = "UPDATE cursada SET nota = ? WHERE id_alumno =? and id_materia =? and id_cursada = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cursada.getNota());
            ps.setInt(2, alumno.getIDAlumno());
            ps.setInt(3, materia.getIDMateria());
            ps.setInt(4, cursada.getIDCursada());
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se actualizo correctamente");
            }else{
                System.out.println("No se puede actualizar");
            }
            ps.close();//CERRAMOS EL STATEMENTS
    
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo borrar..."+ex.getMessage());
        }
    }
}
