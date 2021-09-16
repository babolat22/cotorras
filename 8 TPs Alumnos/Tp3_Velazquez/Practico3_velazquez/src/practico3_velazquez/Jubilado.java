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
public class Jubilado extends Persona {

    public Jubilado(String nombre, long dni, String fechaDeNacimiento, String domicilio) {
        super(nombre,dni,fechaDeNacimiento,domicilio);
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilacion");
    }
}
