package p3ejdeportista;
/**
 *
 * @author juanj
 */
public class Deportista extends Persona{
private int resistencia;

public Deportista(String nombre,int dni, int edad ,String domicilio,int resist){
    super(nombre, dni, edad, domicilio);
    resistencia= resist;
}
public int getResistencia() {
return resistencia;
}
public void setResistencia(int resistencia) {
this.resistencia = resistencia;
}
@Override
public void andar(){
System.out.println("Andar como deportista "+ this.getNombre() +" edad: " + this.getEdad() + " Resistencia: "+this.getResistencia());
}
@Override
public void correr(){
System.out.println("Correr como deportista");
}
}
