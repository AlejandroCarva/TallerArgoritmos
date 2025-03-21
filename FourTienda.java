import java.util.Scanner;

public class FourTienda {
    public static void main(String[] args) {
        int CompraTotal = 0;
        int Descuento = 0;
        int CompraDescuento = 0;
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el valor total de la compra: ");
        CompraTotal = valor.nextInt();
        Descuento = (CompraTotal *15)/100;
        System.out.println("El descuento sera de:"+ Descuento);
        CompraDescuento = CompraTotal - Descuento;
        System.out.println("La compra total con descuento es de un total: "+ CompraDescuento);

        


    }
}
