package ejercicios;
import java.util.Scanner;

public class FourteenEcuacionLinea {
    public void ejercicio14(){
        Scanner lapiz = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        double a = lapiz.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = lapiz.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = lapiz.nextDouble();
        System.out.println("Ingrese el valor de d: ");
        double d = lapiz.nextDouble();
        System.out.println("Ingrese el valor de e: ");
        double e = lapiz.nextDouble();
        System.out.println("Ingrese el valor de f: ");
        double f = lapiz.nextDouble();
        //Determinante
        double determinante = a*e-b*d;
        if (determinante==0){
            System.out.println("El sistema no tiene solución única (puede ser indeterminado o incompatible).");
        } else {
                //Calcular X y Y
                double X = (c*e)-(b*f)/determinante;
                double Y = (a*f)-(c*d)/determinante;
                //Mostrar Resultado 
                System.out.println("El valor de X y Y es:"+ X+" y "+Y);
            }
        }
    }
    