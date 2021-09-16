/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.alojamiento;
import modelo.cliente;

/**
 *
 * @author juanj
 */
public class alojamientoData {
    private Connection con = null;
    public alojamientoData(Conexion conex) {
        try {
            con = conex.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(alojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public boolean registrar(alojamiento alo){
        PreparedStatement ps;
        String sql ="INSERT INTO ALOJAMIENTO (direccion, cantCamas, fumadores, costo) VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            
            ps.setString(1, alo.getDireccion());
            ps.setInt(2, alo.getCantCamas());
            ps.setBoolean(3, alo.isFumadores());
            ps.setDouble(4, alo.getCosto());
            ps.executeUpdate();
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
