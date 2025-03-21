import java.util.Scanner;
public class FifteenLuzElectrica {
    public static void main(String[]args){
        Scanner lapiz = new Scanner(System.in);
        System.out.println("Ingrese la lectura anterior de la luz electrica");
        double LecturaA = lapiz.nextDouble();
        System.out.println("Ingrese la lectura actual de la luz electrica");
        double LecturaN = lapiz.nextDouble();
        double LecturaTotal = (LecturaN - LecturaA);
        if (LecturaTotal < 0) {
            System.out.println("Error: La lectura actual debe ser mayor que la lectura anterior.");
        } else {
        System.out.println("Ingrese el costo por kilovaltio");
        double CostoKilovaltio = lapiz.nextDouble();
        double CostoTotal = (LecturaTotal * CostoKilovaltio);
        System.out.printf("El costo a pagar en 1 mes sera de: %.2f Bolivares%n", CostoTotal);
    }
  }
}
