import java.util.Scanner;
public class EightAreatriangulo {
    public static void main (String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double p = 0;
        double Parea = 0 ;
        Scanner lapiz = new Scanner (System.in);
        System.out.println("Ingrese el valor de a:");
        a = lapiz.nextDouble();
        System.out.println("Ingrese valor de b:");
        b = lapiz.nextDouble();
        System.out.println("Ingrese el valor de c:");
        c = lapiz.nextDouble();
        p = (a+b+c)/2 ;
        ///Calcular el area con formula heron
        Parea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Este es el area del triangulo con la formula de heron:"+ Parea);
        Parea = lapiz.nextDouble();






    }   
}
