package tp2pooejercicios7.pkg8.pkg9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garba
 */
public class Celular {
    private String marca;
    private String modelo;
    private String color;
    
    public Celular(){}
    public Celular(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void llamar(String nombre){
        System.out.println("Llamando a "+ nombre);
    }
    public void cortarLlamada(String nombre){
        System.out.println("Llamada con "+nombre+" finalizada");
    }
    public void informarCaracteristicas(){
        System.out.println("Características del celular: \n Marca: "+marca+ "\n Modelo: "+modelo+"\n Color: "+color);
    }
}
