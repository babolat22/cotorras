
package ModeloUniversidad;

import java.sql.*;

/**
 *
 * @KAISERKEY
 * 
 */
public class Conexion {
    private Connection con;
    private String url="jdbc:mysql://localhost:3306/universidad?useServerPrepStmts=true";//Direccion donde esta ubicada la base de datos
    // Es necesario useServerPrepStmts=true para que los PreparedStatement
   // se hagan en el servidor de bd. Si no lo ponemos, funciona todo
   // igual, pero los PreparedStatement se convertirán internamente a
   // Statements.
    private String user="root";// usuario por defecto de la base de datos
    private String password="";//contraseña por defecto de la base de datos
    private String driver = "org.mariadb.jdbc.Driver";//driver de conexión BASE DE DATOS
    
    //Retorna la conexion
    public Connection getConexion()
    {
        return con;
    }
    
    //Creamos la conexion con la base de datos
    public boolean crearConexion(){
        System.out.println("Conectando…");
        try{
            Class.forName(driver);//registra el driver de conexión para la base de datos
                                   //PERO NO ES NECESARIO A PARTIR DE JAVA6
            con = DriverManager.getConnection(url, user, password);
            
        }catch(SQLException ex){
            ex.printStackTrace();//Nos dice qué sucedió y en qué parte del código sucedió el error
            System.out.println( "ERROR: Problema con la conexion a la BD..."+ex.getMessage());
            return false;
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: Problemas con el Driver de conexion..."+ex.getMessage());
            return false;
        }
        System.out.println("Conectado!!");
        return true;
    }
    
    /**Para ver qué catálogos, esquemas, tablas, tipos de tablas, columnas de las tablas 
     * y demás de una base de datos, tenemos la clase DataBaseMetaData. 
     * Una vez establecida la conexión, podemos obtener la instancia correspondiente 
     * de dicha clase con el método getDataBaseMetaDataTables() de la Connection
     * */
    
    public void getDataBaseMetaDataTables() throws SQLException{
        DatabaseMetaData metaDatos = con.getMetaData();
        ResultSet rs = metaDatos.getTables(null, null, "%", null);
        /**donde los cuatro parámetros que hemos pasado son:
         * CATALOGO de la base de datos. Al poner null, estamos preguntando por el catálogo actual, 
         * que en nuestro programa es de la cadena de conexión, "UNIVERSIDAD".
         * ESQUEMA de la base de datos. Al poner null, es el actual.
         * PATRON para las tablas en las que tenemos interés. En SQL el caracter que indica "todo" es %, 
         * equivalente al * a la hora de listar ficheros. Esto nos dará todas las tablas del catálogo y 
         * esquema actual. Podríamos poner cosas como "person%", con lo que obtendríamos todas las tablas 
         * cuyo nombre empiece por "person".
         * EL CUARTO parámetro es un ARRAY de String, en el que pondríamos qué tipos de tablas 
         * queremos (normales, vistas, etc). Al poner null, nos devolverá todos los tipos de tablas.
         * */
        int count = 0;
        System.out.println("\nTABLAS QUE CONTIENE");
        while (rs.next()) {
           /** El contenido de cada columna del ResultSet se puede ver
            * en la API, en el metodo getTables() de DataBaseMetaData.
            * La columna 1 es TABLE_CAT
            * y la 3 es TABLE_NAME
            * */
           count++;
           String bD = rs.getString(1);
           String tabla = rs.getString(3);
           System.out.println("Base De Datos=" + bD + "-->Tabla " +count+" -->" + tabla);
        }
    }
    
    public void getDataBaseMetaDataColumns(String bD, String tabla) throws SQLException{
        DatabaseMetaData metaDatos = con.getMetaData();
        ResultSet rs = metaDatos.getColumns(bD, null, tabla, null);
        /**
         * en el que los parámetros de la llamada son:
         * EL NOMBRE DEL CATALOGO al que pertenece la tabla.
         * EL NOMBRE DEL ESQUEMA, null para el esquema actual.
         * EL NOMBRE DE LA TABLA. Nuevamente podríamos poner comodines al estilo SQL para obtener, por ejemplo, 
         * las columnas de todas las tablas "person%" que empiecen por person.
         * EL NOMBRE DE LAS COLUMNAS buscadas, usando comodines. null nos devuelve todas las columnas.
         */
        
        /*
        El contenido del ResultSet será una fila por cada columna de la tabla
        si queremos el nombre de la columna y el nombre del tipo de dato de la columna, 
        debemos hacer caso a las columnas 4 y 6 del ResultSet.
        */
        int count = 0;
        System.out.println("\nCOLUMNAS Y TIPOS DE DATOS");
        while (rs.next()) {
            // El contenido de cada columna del ResultSet se puede ver en
            // la API de java, en el metodo getColumns() de DataBaseMetaData
            // El 3 corresponde al TABLE_NAME
            // La 4 corresponde al COLUMN_NAME
            // y la 6 al TYPE_NAME
            count++;
            String nombreTable = rs.getString(3);
            String nombreColumna = rs.getString(4);
            String tipoColumna = rs.getString(6);
            System.out.println("NOMBRE DE LA TABLA= "+nombreTable+" COLUMNA "+count+", NOMBRE=" + nombreColumna
               + " DE TIPO = " + tipoColumna);
        }
        
    }
}
