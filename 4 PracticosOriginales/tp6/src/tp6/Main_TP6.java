
package tp6;


public class Main_TP6 {


    public static void main(String[] args) {
        
        
        DirectorioTelefonico agenda = new DirectorioTelefonico();
        
        
        Cliente c1 = new Cliente("Ignacio", "Repski", "Ayacucho 123", "San Luis", 266467728, 42909185);
        Cliente c2 = new Cliente("Fede", "Rozan", "Falucho 444", "Cordoba", 7777777, 12345678);
        Cliente c3 = new Cliente("Carlos", "Ferrari", "Av España 321", "San Luis", 266476757, 34567890);
        Cliente c4 = new Cliente("Marcos", "Galperin", "Pres uriburu 111", "Buenos Aires", 1165478763, 29876564);
        Cliente c5 = new Cliente("Elon", "Musk", "Saint Jorge", "Palo Alto", 44455536, 30987432);
        
        
        agenda.agregarCliente(c1);
        agenda.agregarCliente(c2);
        agenda.agregarCliente(c3);
        agenda.agregarCliente(c4);
        agenda.agregarCliente(c5);
        
        agenda.buscarCliente(266467728);
        agenda.buscarTelefono("Repsi");
        
        agenda.buscarClientes("San Luis");
        
        agenda.borrarCliente(42909185);


      
        agenda.mostrarAgenda();
        
    }
    
}
