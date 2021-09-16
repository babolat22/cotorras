/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pooejercicios7.pkg8.pkg9;

/**
 *
 * @author garba
 */
public class TP2POOEjercicios789 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Celular micelu=new Celular("Nokia","1100","Gris");
    micelu.llamar("Juani");
    micelu.cortarLlamada("Juani");
    micelu.informarCaracteristicas();
    SmartPhone otrocelu= new SmartPhone();
    otrocelu.setColor("Plateado");
    otrocelu.setMarca("Huawei");
    otrocelu.setModelo("Mate 9");
    otrocelu.setPixelsCamara(20);
    otrocelu.setTamañoMemoriaExterna(64);
    otrocelu.setTamañoMemoriaExterna(0);
    otrocelu.llamar("Pepe");
    otrocelu.cortarLlamada("Pepe");
    otrocelu.informarCaracteristicas();
    }
    
}
