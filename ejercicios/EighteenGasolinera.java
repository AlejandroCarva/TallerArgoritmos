package ejercicios;
import java.util.Scanner;
public class EighteenGasolinera {
    public void ejercicio18(){
        Scanner lapiz = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de galones registrados");
        double Galones = lapiz.nextDouble();
        double litros = 3.785;
        double Total = (Galones *litros)*100;
        System.out.printf("El costo total a cobrar al cliente es: %.2f Bolívares%n", Total);
        
     }
}
