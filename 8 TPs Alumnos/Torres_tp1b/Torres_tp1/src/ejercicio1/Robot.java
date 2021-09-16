/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;



/**
 *
 * @author Jannete
 */
public class Robot {
    
double bateria = 0;
private boolean encendido = true;
 


public Robot(){ 
    this.bateria = 1000;
}


    
public void Avanzar(int cantidadDePasos) {
    
    double gasto = cantidadDePasos*10/100;
    
    if(isEncendido()&& bateria > gasto) {
        bateria = bateria - gasto;
    }
  
}


public void Retroceder(int cantidadDePasos){
    Avanzar(cantidadDePasos);
}

public void Dormir(){
    encendido = false;
       
}
public void Despertar(){
    encendido = true;
        
}

//Getter
public boolean isEncendido(){
    return encendido;
 }


public void Recargar(){
    bateria=1000;
    
}

public boolean bateriaLlena(){
    
    if(bateria==1000){
        return true;
    }
return false;
}
        

public boolean bateriaVacia(){
    
    if(bateria==0){
       return true; 
    }
        return false;
    

}
public double energiaActual(){
    return bateria;
   
    
}
}
