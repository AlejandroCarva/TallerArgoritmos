package ejercicios;
import java.util.Scanner;

public class TwoInversion {
    public static void ejercicio2() {
        int Inversion = 0 ;
        int razon = 2 ;
        int Ganancia = 0 ; 
        Scanner Banco = new Scanner(System.in);
        System.out.println("Ingrese valor de la inversion");
        Inversion = Banco.nextInt();
        Ganancia = (Inversion * razon)/100 ;
        System.out.println("La ganancia sera de "+ Ganancia);
        


        
    }    
}
