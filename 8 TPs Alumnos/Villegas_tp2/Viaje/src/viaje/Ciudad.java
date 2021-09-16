/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje;

/**
 *
 * @author Chony
 */
public class Ciudad {
    String nomCiudad;
    double km;
    int nroRuta;

    public Ciudad(String nomCiudad, double km, int nroRuta) {
        this.nomCiudad = nomCiudad;
        this.km = km;
        this.nroRuta = nroRuta;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getNroRuta() {
        return nroRuta;
    }

    public void setNroRuta(int nroRuta) {
        this.nroRuta = nroRuta;
    }
    
}
