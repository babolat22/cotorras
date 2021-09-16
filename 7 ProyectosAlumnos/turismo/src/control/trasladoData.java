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
import modelo.traslado;

/**
 *
 * @author juanj
 */
public class trasladoData {
    private Connection miConn = null;

    public trasladoData(Conexion Conex) {
        try {
            miConn= Conex.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(trasladoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public void guardarTraslado(traslado tras){
    
        PreparedStatement ps;
        try {
            String SQL = "INSERT INTO traslado (tipo, maxPersonas, costoKilom) VALUES (?,?,?)";
             ps = miConn.prepareStatement(SQL);
             ps.setString(1, tras.getTipo());
             ps.setInt(2, tras.getMaxPersonas());
             ps.setDouble(3, tras.getCostoKilom());
             ps.executeUpdate();
             System.out.println(tras.getTipo()+ " " + tras .getCostoKilom());
             ps.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(trasladoData.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}    
    
    
}
