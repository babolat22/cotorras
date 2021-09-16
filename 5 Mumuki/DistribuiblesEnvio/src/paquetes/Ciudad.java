/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes;

/**
 *
 * @author juanj
 */
class Ciudad {
  int kilometros;

  Ciudad(int ubicacionEnKilometros) {
    kilometros = ubicacionEnKilometros;
  }

  int kilometros() {
    return kilometros;
  }

  int distancia(Ciudad otraCiudad) {
    return (this.kilometros() - otraCiudad.kilometros());
  }
}