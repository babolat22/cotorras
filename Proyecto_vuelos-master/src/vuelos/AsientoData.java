/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jonathan Saez
 */
public class AsientoData {
    private Connection connection = null;

    public AsientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarAsiento(Asiento asiento){
        try {
            String sql = "INSERT INTO asiento (id_vuelo, precio, ubicacion, disponibilidad) VALUES ( ? , ? , ? , ?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, asiento.getId_vuelo().getId());
            statement.setDouble(2, asiento.getPrecio());
            statement.setString(3, asiento.getUbicacion());
            statement.setInt(4, asiento.getDisponibilidad());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                asiento.setId_asiento(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            statement.close();
        } catch (SQLException ex){
            System.out.println("Error al insertar un asiento: " + ex.getMessage());
        }
    }
    
}
