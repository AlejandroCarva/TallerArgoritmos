package ejercicios;
import java.util.Scanner;
 public class TwentyOneMayorista{
    public void ejercicio21(){
        double X = 48000;
        double Y = 6 ;
        double K = 42000;
        //Operacion
        double inversion = (X/12)*Y;
        double ganancia = K-inversion;
        double PorcentajeGanancia = (ganancia/inversion)*100;
        System.out.println("La inversion es: " + PorcentajeGanancia + "%" );



    }
 }