/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglocompara;

/**
 *
 * @author juanj
 */
public class Ejemplo2 {
 //¿que pasaría si quisiera ejecutar un método definido en la clase hija (no esta en la clase padre)? 
   //      Debemos hacer un casting de objetos para poder ejecutarlo. 
    public static void main(String[] args) {
        final int TAM = 4;
        Empleado2 empleados[]=new Empleado2[TAM];
        empleados[0]=new Comercial2("Fernando", "Funes", 23, 700, 50);
        empleados[1]=new Repartidor2("Marco", "Liguori", 30, 800, "Centro");
        empleados[2]=new Comercial2("Laura", "Mercante", 24, 1000, 30);
        empleados[3]=new Repartidor2("Ana", "Serrano", 43, 1200, "Juan Koslay");
 
        for(int i=0;i<empleados.length;i++){
            //El array es de objetos Empleados
            if(empleados[i] instanceof Comercial2){
                //Si la posición del array es un comercial, hacemos un casting de objetos
                Comercial2 ref=(Comercial2)empleados[i];
                //Ahora podemos invocar métodos del objeto
                System.out.println("La comision es de "+ref.getComision());
            }
            if(empleados[i] instanceof Repartidor2){
                //Si la posición del array es un repartidor, hacemos un casting de objetos
                Repartidor2 ref=(Repartidor2)empleados[i];
                //Ahora podemos invocar métodos del objeto
                System.out.println("La zona es "+ref.getZona());
            }
        }
        
         //BUSQUEDA CON FOR
        boolean esta = false; 
        for(int i=0;i<empleados.length;i++){
            if (empleados[i] !=null && empleados[i].apellido.equals("Mercanttttr")){
                System.out.println("Se ha encontrado en la posicion "+i);
                esta = true;
                break;
            }
        }
        if(empleados.length ==TAM && !esta) System.out.println("No se encontro!"); 
    }
}

class Empleado2{
    String nombre;
    String apellido;
    int edad;
    double sueldo;

    public Empleado2(String nombre, String apellido, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    
}
class Repartidor2 extends Empleado2{
    String zona;
    
    public Repartidor2(String a, String b, int c, double d, String zona) {
        super(a,b,c,d);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }
    
}
class Comercial2 extends Empleado2{
    double comision;

    public Comercial2(String a, String b, int c, double d, double comision) {
        super(a,b,c,d);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }
    
    
    
 }
