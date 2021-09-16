package p3ejcelular;
/**
 *
 * @author juanj
 */
public class celular {
  private String marca;
private String modelo;
private String color;
public celular(String marca, String modelo, String color) {
this.marca = marca;
this.modelo = modelo;
this.color = color;
}
public celular() {
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
public void llamar(){
System.out.println("Llamando...");
}
public void cortarLlamada(){
System.out.println("Finalizando llamada...");
}
public void infoCaracteristicas(){
System.out.println("Marca: " + this.marca);
System.out.println("Modelo: " + this.modelo);
System.out.println("Color: " + this.color);
}  
}
