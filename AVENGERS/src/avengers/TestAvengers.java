/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengers;

/**
 *
 * @author juanj
 */
public class TestAvengers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Capitan cap = new Capitan(200,250,500);
        Thor thor= new Thor(400,200,600);
        Avenger av = new Capitan(200,250,500);
        thor.Correr();
        cap.Correr();
        cap.saludar();
    }
}
