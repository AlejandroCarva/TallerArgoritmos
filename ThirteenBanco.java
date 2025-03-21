import java.util.Scanner;
public class ThirteenBanco {
    public static void main(String[]args){
        Scanner lapiz = new Scanner(System.in);
        int N1 = 50000, N1TOTAL ;
        int N2 = 20000, N2TOTAL;
        int N3 = 10000, N3TOTAL ;
        int N4 = 5000, N4TOTAL ;
        int N5 = 2000, N5TOTAL ;
        int N6 = 1000, N6TOTAL ;
        int N7 = 500, N7TOTAL ;
        int N8 = 200, N8TOTAL ;
        int TotalBanco ;
        System.out.println("Ingrese el numero de billetes de 50000");
        N1 = lapiz.nextInt();
        N1TOTAL = N1 * 50000;
        System.out.println("Ingrese el numero de billetes de 20000");
        N2 = lapiz.nextInt();
        N2TOTAL = N2 * 20000 ;
        System.out.println("Ingrese el numero de billetes de 10000");
        N3 = lapiz.nextInt();
        N3TOTAL = N3 * 10000 ;
        System.out.println("Ingrese el numero de billetes de 5000");
        N4 = lapiz.nextInt();
        N4TOTAL = N4 * 5000 ;
        System.out.println("Ingrese el numero de billetes de 2000");
        N5 = lapiz.nextInt();
        N5TOTAL = N5 * 2000 ;
        System.out.println("Ingrese el numero de billetes de 1000");
        N6 = lapiz.nextInt();
        N6TOTAL = N6 * 1000 ;
        System.out.println("Ingrese el numero de billetes de 500");
        N7 = lapiz.nextInt();
        N7TOTAL = N7 * 500 ;
        System.out.println("Ingrese el numero de billetes de 200");
        N8 = lapiz.nextInt();
        N8TOTAL = N8 * 200 ;
        TotalBanco = N1TOTAL + N2TOTAL + N3TOTAL + N4TOTAL + N5TOTAL + N6TOTAL + N7TOTAL + N8TOTAL ;
        System.out.println("Total del dinero que contiene el Banco: "+ TotalBanco );


    }
    
}
