/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.cliente;

/**
 *
 * @author juanj
 */
public class clienteData {
    private Connection con = null;
    
    public clienteData(Conexion conex){
        try{
           con = conex.getConexion(); 
        }        
        catch(SQLException e){
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
       
    
    public boolean registrar(cliente cli){
        PreparedStatement ps;
        String sql ="INSERT INTO CLIENTE (dni, nombreApe, celular) VALUES (?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getDni());
            ps.setString(2, cli.getNombreApe());
            ps.setInt(3, cli.getCelular());
            ps.execute();
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
}
