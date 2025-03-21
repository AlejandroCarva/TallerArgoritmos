import java.util.Scanner;

public class ThreeVendedor {
    public static void main(String[] arg ) {
        /// 
    int Sueldo = 0 ;
    int Ventas = 0 ;
    int Venta1 = 0 ;
    int Venta2 = 0 ;
    int Venta3 = 0 ;
    int Comision = 0 ;
    int SueldoTotal = 0 ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el sueldo base:");
    Sueldo = sc.nextInt();
    System.out.println("Ingrese valor de la venta 1:");
    Venta1 = sc.nextInt();
    System.out.println("Ingrese valor de la venta 2:");
    Venta2 = sc.nextInt();
    System.out.println("Ingrese valor de la venta 3:");
    Venta3 = sc.nextInt();
    Ventas = Venta1 + Venta2 + Venta3;
    System.out.println("Este es el valor de las ventas:"+ Ventas);
    Comision = (Ventas * 10)/100;
    System.out.println("Este es valor de la comision de las 3 ventas:"+ Comision);
    SueldoTotal = Sueldo + Comision ;
    System.out.println("Este es el sueldo total del vendedor:"+ SueldoTotal);
    








    }
    
}