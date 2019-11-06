/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author programador
 */
public class Conexion {
    private String url="jdbc:mysql://localhost:3306/zancheuniversidad";
    private String user="root";
    private String pass="";
    
    private Connection con;
    
    //public Connection geronexion (){
     public Connection  getConection()  {
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection(url,user,pass);
          System.out.println("Conexion exitosa!");
      }
      
      catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
      return con;
      
    
}
}
             
