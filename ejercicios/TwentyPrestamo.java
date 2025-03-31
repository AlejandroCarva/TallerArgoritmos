package ejercicios;
import java.util.Scanner;
public class TwentyPrestamo {
    public void ejercicio20(){
    Scanner lapiz = new Scanner(System.in);
    System.out.println("Ingrese el Prestamo: ");
    double CapitalPrestamo = lapiz.nextDouble();
    System.out.println("Ingrese el valor de interes pagados en 4 años");
    double Interes = lapiz.nextDouble();
    double InteresAnual =  (Interes*100)/(CapitalPrestamo*4);
    System.out.println("El interes anual es: "+InteresAnual+"%");
    }    
}
