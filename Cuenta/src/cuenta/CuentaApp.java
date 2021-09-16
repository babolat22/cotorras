package cuenta;

public class CuentaApp {
 
    public static void main(String[] args) {
         
        Cuenta cuenta_1 = new Cuenta("Juanjo");
        Cuenta cuenta_2 = new Cuenta("Cristina", 300);
        Cuenta cuenta_3 = new Cuenta();
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
        cuenta_1.retirar(30);
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
        
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 300 euros
         
    }
     
}