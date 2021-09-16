
package tp6;

import java.util.ArrayList;


public class DirectorioTelefonico {
   ArrayList <Cliente> agenda = new ArrayList <Cliente>();
   
   //METODOS
   
   public void agregarCliente(Cliente cliente){
       if(!agenda.contains(cliente)){
           agenda.add(cliente);
           System.out.println("Cliente agregado con exito.");
       }else{
           System.out.println("El cliente ya existe!");
       }
       System.out.println("");
   }
   
   public void buscarCliente(int numero){
       System.out.println("-----------------------------------");
       System.out.println("");
       boolean encontrado = false;
       
       for(Cliente cliente: agenda){
           if(numero == cliente.getNroTelefono()){
               System.out.println("El numero " + numero + " corresponde a: \n" + "Nombre: " + cliente.getNombre() + "\nApellido: " + cliente.getApellido() + "\nDireccion: " + cliente.getDomicilio() + "\nCiudad: " + cliente.getCiudad());
               encontrado = true;   
           }
       }   
       if(encontrado == false){
           System.out.println("El numero no corresponde a ningun cliente!");
       }
       System.out.println("");
   }
   
   public void buscarTelefono(String apellido){
       System.out.println("-----------------------------------");
       System.out.println("");
       boolean encontrado = false;
       
       ArrayList<Cliente> clientes = new ArrayList();
       
       for(Cliente cliente: agenda){
           if(apellido.equals(cliente.getApellido())){
               System.out.println("Para el apellido " + apellido + " Los numeros asociados son: \n");
               clientes.add(cliente);
               encontrado = true;
           }
       }
       
       if(encontrado == false){
           System.out.println("El apellido " + apellido + " no se encuentra asociado a ningun numero de telefono");
       }
              
        for(Cliente cliente: clientes){
           System.out.println("Nombre: " + cliente.getNombre() + "\nApellido: " + cliente.getApellido() + "\nNumero: " + cliente.getNroTelefono() + "\nDomicilio: " + cliente.getDomicilio());
            System.out.println("");
       }   
   }
   
   public void buscarClientes(String ciudad){
       System.out.println("-----------------------------------");
       System.out.println("");
       boolean encontrado = false;
       
       ArrayList<Cliente> clientes = new ArrayList();
       
       System.out.println("Los clientes asociados a la ciudad " + ciudad + " son:\n");
       for(Cliente cliente: agenda){
           if(ciudad.equals(cliente.getCiudad())){
              clientes.add(cliente);
              encontrado = true;
           }
       }
       
       if(encontrado == false){
           System.out.println("En la ciudad de " + ciudad + " no se encuentra ningun cliente asociado");
       }
       
       for(Cliente cliente: clientes){
           System.out.println("Nombre: " + cliente.getNombre() + "\nApellido: " + cliente.getApellido() + "\nNumero: " + cliente.getNroTelefono() + "\nDomicilio: " + cliente.getDomicilio());
           System.out.println("");
       }
   }
   
   public void borrarCliente(int dni){
       System.out.println("-----------------------------------");
       System.out.println("");
       boolean encontrado = false;
       
       for(int i = 0; i < agenda.size(); i++){
           if(dni == agenda.get(i).getDni()){
               encontrado = true;
               System.out.println("Cliente " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellido() + " se va a eliminar.");
               agenda.remove(i);
               
           }
       }
       if(encontrado == false){
           System.out.println("El DNI " + dni + " no corresponde a ningun asociado\n");
       }
       
   }
   
   public void mostrarAgenda(){
       for(Cliente cliente: agenda){
           System.out.println("Nombre: " + cliente.getNombre() + "\nApellido: " + cliente.getApellido() + "\nNumero: " + cliente.getNroTelefono() + "\nDomicilio: " + cliente.getDomicilio());
           System.out.println("");
       }
   }
}
