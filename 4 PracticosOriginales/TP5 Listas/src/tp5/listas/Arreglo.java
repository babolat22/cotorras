/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.listas;
/**
 *
 * @author juanj
 */
public class Arreglo {
private static int Mayor;
private static int miarreglo[];
private static int Suma = 0;

public Arreglo(int arreglo[]) {
    Arreglo.miarreglo = arreglo;
}
public static void sumarLista(int miarreglo[]){
for(int i = 0; i < miarreglo.length; i++) { 
    Suma += miarreglo[i];
}    
System.out.println("mi arreglo sumado: " + Suma + " su promedio: " + Suma/miarreglo.length);
}
public static void buscaMax(int arreglo[]){
Mayor=arreglo[0];  
for (int i = 1; i < arreglo.length; i++) {
    if (arreglo[i] > Mayor)   Mayor = arreglo[i];
}
System.out.println("El numero más grande es: " + Mayor);
}
public static void contarVocales(String palabra){
    int contar = 0;
    for(int l = 0; l < palabra.length(); l++){
       // if ((palabra.charAt(l)=='f') ...
    }
    System.out.println("La cantidad de vocales es: (usamos charAt(i)) " + contar);
}
public static void contarCaracteres(String palabra, char caracter){
    int cont = 0;
    for(int i = 0; i < palabra.length(); i++)
        if(palabra.charAt(i) == caracter) cont++;
    System.out.println("El caracter " + caracter + " esta -> " + cont + " veces.");
    }
}