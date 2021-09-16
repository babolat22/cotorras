/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juanj
 */
public class usuario {
     private int idUsuario = -1;
     private String Apellido;
     private String Nombre;
     private String Mail;

    public usuario(String Apellido, String Nombre, String Mail) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Mail = Mail;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public usuario() {
    }
     
}
