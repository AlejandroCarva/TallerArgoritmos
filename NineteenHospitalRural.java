import java.util.Scanner;
public class NineteenHospitalRural {
    public static void main (String[]args ){
        Scanner lapiz = new Scanner(System.in);
        System.out.println("Ingrese el presupuesto anual de hospital");
        double Presupuesto = lapiz.nextDouble();
        double Ginecologia = 0.40;
        double TotalG ;
        double Traumatologia = 0.30;
        double TotalT ; 
        double Pediatria = 0.30;
        double TotalP ;
        //Operaciones
        TotalG = Presupuesto * Ginecologia ;
        TotalT = Presupuesto * Traumatologia ;
        TotalP = Presupuesto * Pediatria ;
        //Impresion
        System.out.println("El presupuesto para ginecologia es: " + TotalG );
        System.out.println("El preseupuesto para traumatologia es: " + TotalT );
        System.out.println("El presupuesto para pediatria es: " + TotalP );
    }
    
}
