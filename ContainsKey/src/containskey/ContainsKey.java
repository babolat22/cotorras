package containskey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author juanj
 */
public class ContainsKey {
    public static void main(String[] args)
    {  
        // Creamos un HashMap vacio
        TreeMap<Integer, String> hash_map = new TreeMap<Integer, String>();
  
        // mapeando strings a llaves enteras
        hash_map.put(10, "La planilla de");
        hash_map.put(15, "Laboratorio 1");
        hash_map.put(20, "está");
        hash_map.put(25, "llena de");
        hash_map.put(30, "Injusticias");
  
        // Mostrando el HashMap
        System.out.println("Inicialmente el mapa tiene: " + hash_map);
  
        // Buscando el elemento llave '20'
        System.out.println("Esta presente la llave '20'? " + 
        hash_map.containsKey(20));
  
        //Buscando el elemento llave '5'
        System.out.println("Esta presente la llave '5'? " + 
        hash_map.containsKey(5));
        
        if (hash_map.containsValue("Injusticias"))
            System.out.println("Profe Blanco le marca la asistencia\n");
        
        if (hash_map.containsValue("Laboratorio 1")){
            HashMap<Integer, String> presentes = new HashMap<Integer, String>();
            presentes.put(1, "Suarez");
            presentes.put(2, "Cometo");
            presentes.put(3, "Zapata");
            // Creamos un nuevo hash map y copiaremos
            HashMap<Integer, String> tardanza = new HashMap<Integer, String>();
            tardanza.put(4, "Felippo");
            tardanza.put(5, "Muñoz");
            presentes.putAll(tardanza);

            // Displaying the final HashMap
            System.out.println("Agregando a los alumnos olvidadizos quedaría: \r" + presentes);
        }
        
     //   \n : (Line Feed) mueve el cursor hacia la siguiente línea sin volver al comienzo de la línea.
     //   \r : Retorno de carro (Carriage return), mueve el cursor al comienzo de la línea sin avanzar a la siguiente linea.
    }
}
   

