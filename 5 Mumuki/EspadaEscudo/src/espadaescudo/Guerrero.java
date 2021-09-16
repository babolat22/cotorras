/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espadaescudo;

/**
 *
 * @author juanj
 */
public class Guerrero {
  int puntosDeAtaqueBase;  // atributo1
  int puntosDeDefensaBase;   // atributo2
  Arma arma;  // escudo

    public Guerrero(int puntosDeAtaqueBase, int puntosDeDefensaBase, Arma arma) {
        this.puntosDeAtaqueBase = puntosDeAtaqueBase;
        this.puntosDeDefensaBase = puntosDeDefensaBase;
        this.arma = arma;
    }

  int puntosDeAtaque() {
    return puntosDeAtaqueBase + arma.refuerzoOfensivo();
  }

  int puntosDeDefensa() {
    return puntosDeDefensaBase + arma.refuerzoDefensivo();
  }
}
