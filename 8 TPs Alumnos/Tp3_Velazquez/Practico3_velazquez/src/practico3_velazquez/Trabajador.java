/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3_velazquez;

/**
 *
 * @author Ulp
 */
public class Trabajador extends Persona implements Pasivo {

    private double sueldo;

    public Trabajador(String nombre, long dni, String fechaDeNacimiento, String domicilio, double sueldo) {
        super(nombre,dni,fechaDeNacimiento,domicilio);
        this.sueldo=sueldo;
    }

    @Override
    public void cobrar() {
        System.out.println("Monto a cobrar $"+ getSueldo());
    }

    @Override
    public void hacerAportes() {
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}

