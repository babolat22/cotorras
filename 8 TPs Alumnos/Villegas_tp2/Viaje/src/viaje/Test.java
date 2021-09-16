/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje;

/**
 *
 * @author Chony
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializando clases 
        //peaje
        Peaje peaje1 =new Peaje(10,80);//autos livianos
        Peaje peaje2=new Peaje(10,120);//camiones
        //combustible
        Combustible nafta=new Combustible("nafta",89.01);
        Combustible diesel=new Combustible("diesel",79.50);
        Combustible gas=new Combustible("gas",31.79);
        //vehiculo
        Vehiculo auto1= new Auto("Toyota","AD-458-AC",nafta);
        Vehiculo camioneta1= new Camioneta("Renault","BD-458-BC",gas);
        Vehiculo camion1= new Camion("Iveco","AC-458-BC",diesel);
        //ciudad
        Ciudad ciudad1=new Ciudad("San Luis", 100, 7);
        Ciudad ciudad2=new Ciudad("Villa Mercedez", 200,7);
        
        Viaje viajecito=new Viaje(peaje1,ciudad1,ciudad2,auto1);
        
        System.out.println("la distancia entre las ciudades es de: ");
        System.out.printf("%.3f",viajecito.calcularDistancia());
        System.out.println("el costo de combustible es de: ");
        System.out.printf("%.2f",viajecito.costoCombustible());
        System.out.println("el costo de peajes es de:");
        System.out.printf("%.2f",viajecito.costoPeaje());
        System.out.println("el costo total es de: ");
        System.out.printf("%.2f",viajecito.costoTotal());
    }
    
}
