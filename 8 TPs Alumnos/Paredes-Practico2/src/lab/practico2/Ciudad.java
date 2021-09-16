/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.practico2;

/**
 *
 * @author kevin
 */
public class Ciudad {
    
    private String nombre;
    private int numRuta;
    private int klm;

    public Ciudad(String nombre, int numRuta, int klm) {
        this.nombre = nombre;
        this.numRuta = numRuta;
        this.klm = klm;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumRuta() {
        return numRuta;
    }

    public int getKlm() {
        return klm;
    }
    
}
