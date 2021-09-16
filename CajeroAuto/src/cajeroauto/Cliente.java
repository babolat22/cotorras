/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroauto;

/**
 *
 * @author juanj
 */
public class Cliente {
    private int dni;
    private String nombre;
    private Cuenta cuenta;

    public Cliente(int dni, String nombre, Cuenta cuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public Cliente() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
