package ejercicios;
import java.util.Scanner;

public class TwelvePromedioEstudiante {
    public void ejercicio12(){
        Scanner lapiz = new Scanner(System.in);
        //Matematicas
        System.out.println("Ingrese la primera nota de la 1 tarea de Matematicas : ");
        double TareaM1 = lapiz.nextDouble();
        System.out.println("Ingrese la segunda nota de la 2 tarea de Matematicas: ");
        double TareaM2 = lapiz.nextDouble();
        System.out.println("Ingrese la tercera nota de la 3 tarea de Matematicas: ");
        double TareaM3 = lapiz.nextDouble();
        double PromedioTareaM ;        
        PromedioTareaM = (TareaM1 + TareaM2 + TareaM3)/3;
        System.out.println("Ingrese la nota del examen de matematicas:");
        double ExamenM = lapiz.nextDouble();
        double PromedioMatematicas ;
        PromedioMatematicas = (ExamenM * 0.9 )+(PromedioTareaM*0.1);        
        ///Fisica
        System.out.println("Ingrese la primera nota de la 1 tarea de Fisica: ");
        double NotaF = lapiz.nextDouble();
        System.out.println("Ingrese la segunda nota de la 2 tarea de Fisica: ");
        double NotaF2 = lapiz.nextDouble();
        double PromedioTareaF = (NotaF + NotaF2)/2 ;
        System.out.println("Ingrese la nota del examen de Fisica:");
        double ExamenF = lapiz.nextDouble();
        double PromedioFisica = (ExamenF * 0.9)+(PromedioTareaF * 0.2);
        //Quimica 
        System.out.println("Ingrese la primera nota de la 1 tarea de Quimica: ");
        double NotaQ = lapiz.nextDouble();
        System.out.println("Ingrese la segunda nota de la 2 tarea de Quimica: ");
        double NotaQ2 = lapiz.nextDouble();
        System.out.println("Ingrese la tercera nota de la 3 tarea de Quimica: ");
        double NotaQ3 = lapiz.nextDouble();
        double PromedioTareaQ = (NotaQ + NotaQ2 + NotaQ3)/3;
        System.out.println("Ingrese la nota del examen de Quimica:");
        double ExamenQ = lapiz.nextDouble();
        double PromedioQuimica = (ExamenQ *0.85)+(PromedioTareaQ*0.15);
        //Promedio de las 3 
        double PromedioTresM = (PromedioFisica + PromedioQuimica + PromedioMatematicas)/3;
        //Impresion
        System.out.printf("Promedio de Matemática: %.2f\n", PromedioMatematicas);
        System.out.printf("Promedio de Física: %.2f\n", PromedioFisica);
        System.out.printf("Promedio de Quimica: %.2f\n", PromedioQuimica);
        System.out.printf("Promedio de las tres asignaturas: %.2f\n",PromedioTresM);
    }
    
}
