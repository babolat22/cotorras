/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import control.Conexion;
import control.clienteData;
import control.usuarioData;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.usuario;

/**
 *
 * @author juanj
 */
public class TestIndividualFebrero {
    public static Conexion miCon;
    public static usuario sr1;
    public static usuarioData ud;
    public static List<usuario> listada;  // PARA EL 2DO METODO
    // para el EXAMEN
    public static void main(String[] args) {
        try {
            miCon = new Conexion("jdbc:mysql://localhost/turismo", "root", "");
           ud = new usuarioData(miCon);
            /* sr1 = new usuario("Sosa", "Cristian", "gusmanc@gmail.com");
            
            ud.registrar(sr1);              // PARA EL 1er METODO
            */
            listada = ud.obtenerUsuarios();
            listada.forEach((u) -> {
                System.out.println("Usuario--> "+ u.getApellido() +" " + u.getNombre() + ". Correo: " + u.getMail());
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCli.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    
          
    }
}
