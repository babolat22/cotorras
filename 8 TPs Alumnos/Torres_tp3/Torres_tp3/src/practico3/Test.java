package practico3;

import java.util.Scanner;
import java.lang.String;
import java.time.*;


//Crear una Instancia de Registro.
//Crear una instancia de Trabajador.
//Crear una instancia de Jubilado.
//invocar del registro el método procesarDatos 2 veces, una con el trabajador y
//otra con el Jubilado creados en los items anteriores

public class Test {

    public static void main(String[] args) {
        
        Registro registro1 = new Registro();
        
        
        String nombre  = "Hernan";
        
        long dni = 32699831;
        
        LocalDate fechaDeNacimiento = LocalDate.parse("1987-11-26");
        
        String domicilio = "Barrio Manuel Lezcano Mza 1 Casa 5";
        
        
        
//si voy a pasarle por parametro variables debo pasarle a ellas un valor
//Para usar este new debo primero inicializar los valores de la variable antes
        Persona trabajador = new Trabajador(nombre, dni, fechaDeNacimiento, domicilio);
        
        nombre = "Juan";
        dni = 14677432;
        fechaDeNacimiento = LocalDate.parse("1948-06-30");
        domicilio = "Barrio El Lince Mza 10 Casa 4";
        
        Persona jubilado = new Jubilado(nombre, dni, fechaDeNacimiento, domicilio);
        
        registro1.procesarDatos(trabajador);
        
        registro1.procesarDatos(jubilado);
        
    }
}

  
