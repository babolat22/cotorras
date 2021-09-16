/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

/**
 *
 * @author USER
 */
public class Paciente {
    private  int idPaciente;
    private String nombre;
    private int dni;
    private int celular;
    private String domicilio;
    private String dietaPersonal;

    public Paciente() {
    }

    public Paciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Paciente(int idPaciente, String nombre, int dni, int celular, String domicilio, String dietaPersonal) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.domicilio = domicilio;
        this.dietaPersonal = dietaPersonal;
    }

    public int getIdPaciente() {
        return idPaciente;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDietaPersonal() {
        return dietaPersonal;
    }

    public void setDietaPersonal(String dietaPersonal) {
        this.dietaPersonal = dietaPersonal;
    }
    

    
   
    
}

    
    
    

