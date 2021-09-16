/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import modelo.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author juanj
 */
public class usuarioData {
    private Connection con = null;
    
    public usuarioData(Conexion conex){
        try{
           con = conex.getConexion(); 
        }        
        catch(SQLException e){
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
       
    
    public boolean registrar(usuario usu){
        PreparedStatement ps;
        String sql ="INSERT INTO USUARIO (Apellido, Nombre, Mail) VALUES (?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getApellido());
            ps.setString(2, usu.getNombre());
            ps.setString(3, usu.getMail());
            ps.execute();
            System.out.println("Gusrdo!!!!");
            return true;
        }
        catch(SQLException e){
            System.err.print(e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.print(e);
            return false;
            }
        }
    }
    public List<usuario> obtenerUsuarios(){
        List<usuario> usuarios = new ArrayList<usuario>();         //Listado            

        try {
            String sql = "SELECT * FROM usuario;";           //1
            PreparedStatement statement = con.prepareStatement(sql);  //2
            ResultSet resultSet = statement.executeQuery();     //3
            usuario usu;
            while(resultSet.next()){                                //4
                usu = new usuario();
                usu.setApellido(resultSet.getString("Apellido"));
                usu.setNombre(resultSet.getString("Nombre"));
                usu.setMail(resultSet.getString("Mail"));

                usuarios.add(usu);                            // 5
            }      
            statement.close();                                  //6
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return usuarios;
    }
}

