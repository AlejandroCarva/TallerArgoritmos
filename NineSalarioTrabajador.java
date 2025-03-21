import java.util.Scanner;
public class NineSalarioTrabajador {
    public static void main(String[] args){
    float SalarioNeto = 0 ;
    float ValorHoras = 0 ;
    float HorasTrabajadas = 0 ;
    int impuesto = 20 ;
    Scanner lapiz = new Scanner(System.in);
    System.out.println("Ingrese las horas trabajadas:");
    HorasTrabajadas = lapiz.nextInt();
    System.out.println("Ingrese el valor de la hora:");
    ValorHoras = lapiz.nextInt();
    SalarioNeto = (HorasTrabajadas * ValorHoras);
    SalarioNeto = (SalarioNeto * impuesto)/100 ;
    System.out.println("Este es el salaerio neto del trabajador :"+ SalarioNeto);

    }    
}
