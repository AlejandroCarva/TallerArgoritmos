package ejercicios;
import java.util.Scanner;
public class SevenMetros {
    public void ejercicio7(){
      int metros = 1 ;
      double metrosApulgadas = 0 ;
      double pulgadas = 39.27 ;
      int pie = 12  ;
      double piesApulgadas = 0 ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la cantidad de metros que quiere convertir:");
      metros = sc.nextInt();
      metrosApulgadas = metros * pulgadas ;
      System.out.println("Conversion de Metros a Pies : "+ metrosApulgadas);
      piesApulgadas = metrosApulgadas / pie ;
      System.out.println("Conversion de Metros a Pulgadas : "+ piesApulgadas);


    }   
}
