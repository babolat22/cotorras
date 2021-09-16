package accesoabasededatos.modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private String url;
    private String usuario;
    private String password;

    private Connection conexion; // atributo
    
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("org.mariadb.jdbc.Driver");
    }   
    public Connection getConexion() {
        if(conexion == null){  // si es la primera la vez que se usa
            try {
                // Setup the connection with the DB
               //conexion = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+ "&user=" 
                 //      + usuario + "&password=" + password);
           
               conexion = DriverManager.getConnection("jdbc:mariadb://localhost/universidad", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion;
    }   
}
