/*
  */
package tallerreparacion;


import java.util.logging.Level;
import java.util.logging.Logger;

/**

 */
public class TallerReparacion {

    public static void main(String[] args) {
        
        try{
        Conexion con = new Conexion();
        Cliente cl = new Cliente ("sr tlf", 8888, "ate", 5555777);
        ClienteData cld = new ClienteData(con);
        cld.guardarCliente(cl);
        //cld.borrarCliente(123456);
        //cld.actualizarCliente(cl);
        
        Servicio ser = new Servicio ( "rotura", 111);
        ServicioData serdat = new ServicioData (con);
        serdat.guardarServicio(ser);
        
        Aparato apar = new Aparato (555,"TV 40 pulg",cl);
        AparatoData apardat = new AparatoData (con);
        apardat.guardarAparato(apar);
        
       /* Reparacion rep = new Reparacion (apar, "pantalla rota");
        ReparacionData repData = new ReparacionData (con);
        repData.guardarReparacion(rep);
        
        funciona pero: Error al guardar reparacion: (conn=341) Field 'servicio' doesn't have a default value
        servicio Lista no puede entrar vacia
        
        */
       
        /*Reparacion rep = new Reparacion (apar, "pantalla rota", ser);
        ReparacionData repData = new ReparacionData (con);
        repData.guardarReparacion(rep);
        */
        
        
        } catch (ClassNotFoundException ex){
            Logger.getLogger(TallerReparacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    

