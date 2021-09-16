/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author programador
 */
public class Materia {
    private int id;
    private String nombre;
    private String responsable;
    private String periodo;

    public Materia(String nombre, String responsable, String periodo) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.periodo = periodo;
    }
   public Materia(){}

    public Materia(int id, String nombre, String responsable, String periodo) {
        this.id = id;
        this.nombre = nombre;
        this.responsable = responsable;
        this.periodo = periodo;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    public String toString(){
     return nombre;
    }
    
}
