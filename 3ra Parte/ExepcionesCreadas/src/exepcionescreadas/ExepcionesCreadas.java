/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcionescreadas;

/**
 *
 * @author juanj
 */
public class ExepcionesCreadas {

    public static void main(String[] args) {
 
        int num;
 
        try {
 
            num = 5;
 
            if (num >= 0 && num <= 10) {
                throw new MiExcepcion(111);
            } else if (num > 10 && num <= 20) {
                throw new MiExcepcion(222);
            } else if (num > 20 && num <= 30) {
                throw new MiExcepcion(333);
            }
 
        } catch (MiExcepcion ex) {
            System.out.println(ex.getMessage());
        }
 
    }
 
}
