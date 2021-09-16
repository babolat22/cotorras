package practico2viaje;

public class Practico2Viaje {

    public static void main(String[] args) {
        Combustible nafta = new Combustible("Nafta Infinia", 100);
        Ciudad sanluis = new Ciudad("San Luis", 7, 400);
        Ciudad rufino = new Ciudad("Rufino", 7, 700);
        Auto audi = new Auto("Audi", "w4e2e0d", nafta);
        Viaje ida = new Viaje(sanluis, rufino, audi, 5, 1000);
        System.out.println(ida.calculoCostoCombustible());
        System.out.println(ida.calculoCostoPeaje());
        System.out.println(ida.calculoCostoTotal());
        System.out.println(ida.calculoDeDistancia());
        System.out.println(audi.calcularCostoDeCombustible(100));//esto es la cantidad de litros que gasta   
    }

}
