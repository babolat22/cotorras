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
public class SmartPhone extends Celular{
    
private int pixelsCamara;
private int tamañoMemoriaInterna;
private int tamañoMemoriaExterna;

public SmartPhone(){}
public SmartPhone(String marca, String modelo, String color,int pixelsCamara, int tamañoMemoriaInterna,int tamañoMemoriaExterna){
    super(marca,modelo,color);
    this.pixelsCamara=pixelsCamara;
    this.tamañoMemoriaExterna=tamañoMemoriaExterna;
    this.tamañoMemoriaInterna=tamañoMemoriaInterna;
}

    public int getPixelsCamara() {
        return pixelsCamara;
    }

    public void setPixelsCamara(int pixelsCamara) {
        this.pixelsCamara = pixelsCamara;
    }

    public int getTamañoMemoriaInterna() {
        return tamañoMemoriaInterna;
    }

    public void setTamañoMemoriaInterna(int tamañoMemoriaInterna) {
        this.tamañoMemoriaInterna = tamañoMemoriaInterna;
    }

    public int getTamañoMemoriaExterna() {
        return tamañoMemoriaExterna;
    }

    public void setTamañoMemoriaExterna(int tamañoMemoriaExterna) {
        this.tamañoMemoriaExterna = tamañoMemoriaExterna;
    }
    
    public void informarCaracteristicas(){
        super.informarCaracteristicas();
        System.out.println( " Pixeles de la cámara: "+pixelsCamara+ "\n Tamaño memoria interna: "+tamañoMemoriaInterna+"\n Tamaño memoria externa: "+tamañoMemoriaExterna);
    }
}
