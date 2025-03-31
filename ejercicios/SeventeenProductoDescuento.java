package ejercicios;
import java.util.Scanner;
public class SeventeenProductoDescuento {
    public void ejercicio17(){
        Scanner lapiz = new Scanner(System.in);
        System.out.println("Ingrese el precio final del producto");
        double PrecioFinal = lapiz.nextDouble();
        System.out.println("Ingrese el precio de venta al publico");
        double PrecioPublico= lapiz.nextDouble();
        double descuento = PrecioPublico * 1 / PrecioFinal ;
        double descuentoFinal = descuento * 100;
        System.out.println("El porcentaje de descuento es: " + descuentoFinal + "%");

    }
}
