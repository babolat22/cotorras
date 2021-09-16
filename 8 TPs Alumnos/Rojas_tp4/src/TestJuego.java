
import java.util.Scanner;

public class TestJuego {

    public static void main(String[] args) throws Exception {
        robot robot1 = new robot();
        hombre Alejandro = new hombre();
        Alejandro.JugarConRobot(robot1);
        hombre Luis = new hombre();
        Luis.JugarConRobot(robot1);
        

    }
}

class hombre {

    void JugarConRobot(robot xRobot) {
        Scanner myObj = new Scanner(System.in);
        
        xRobot.Despertar();
        while (xRobot.estado) {
            System.out.println("Lista de comandos disponibles");
            System.out.println("[A]vanzar , [R]etroceder , [D]dormir");
            String respuesta = myObj.next().toUpperCase();
            switch (respuesta) {
                case "A":
                    System.out.println("Cuantos pasos desea avanzar?");
                    int xAvanzar = myObj.nextInt();
                    xRobot.Avanzar(xAvanzar);
                    break;

                case "R":
                    System.out.println("Cuantos pasos desea Retroceder?");
                    int xRetroceder = myObj.nextInt();
                    xRobot.Retroceder(xRetroceder);
                    break;

                case "D":
                    xRobot.Dormir();
                    break;
                default:
                    System.out.println("No se reconoce el comando");
            }
        }
    }
}

class robot {

    int energia = 1000;
    boolean estado;

    void setEnergia(int xEnergia) {
        this.energia += xEnergia;
    }

    int energiaActual() {
        return this.energia;

    }

    void Dormir() {
        this.estado = false;
        System.out.println("Eso es todo...ZzZzZ");
        System.out.println("-------------------------------------");
    }

    void Despertar() {
        System.out.println("Nuevo jugador ");
        System.out.println("-------------------------------------");
        this.estado = true;
    }

    void Avanzar(int cantidadPasos) {
        if (estado && cantidadPasos * 0.1 < this.energia) {
            
                this.energia -= cantidadPasos * 0.1;
                System.out.println("-------------------------------------");
                System.out.println("Se avanzo " + cantidadPasos + " pasos.");
                System.out.println("Energia total restante " + energiaActual());
                System.out.println("¿Que desea hacer ahora?");
                System.out.println("-------------------------------------");
            } else {
                System.out.println("No se puede realizar la accion , la cantidad"
                        + " de pasos es mayor a la cantidad de energia disponible"
                        + " para realizar esta accion. Ingrese una cantidad de "
                        + "pasos menor");

            }
        }
    

    void Retroceder(int cantidadPasos) {
        if (estado && cantidadPasos * 0.1 < this.energia) {
           
                this.energia -= cantidadPasos * 0.1;
                System.out.println("-------------------------------------");
                System.out.println("Se retrocedio " + cantidadPasos + " pasos.");
                System.out.println("Energia total restante " + energiaActual());
                System.out.println("¿Que desea hacer ahora?");
                System.out.println("-------------------------------------");
            } else {
                System.out.println("No se puede realizar la accion , la cantidad"
                        + " de pasos es mayor a la cantidad de energia disponible"
                        + " para realizar esta accion. Ingrese una cantidad de "
                        + "pasos menor");
            }
        }
    

    void Recargar() {
        this.energia = 1000;
    }

    boolean bateriaLlena() {
        return this.energia == 1000;
    }

    boolean bateriaVacia() {
        return this.energia <= 0;
    }

}
