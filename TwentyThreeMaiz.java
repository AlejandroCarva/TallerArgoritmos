import java.util.Scanner;
public class TwentyThreeMaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese los kilogramos de harina obtenidos (M): ");
        double M = scanner.nextDouble();

        System.out.print("Ingrese los litros de aceite obtenidos (N): ");
        double N = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta de un bulto de harina (B1): ");
        double B1 = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta de una caja de aceite (B2): ");
        double B2 = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta al detal por kilogramo de harina (B3): ");
        double B3 = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta al detal por litro de aceite (B4): ");
        double B4 = scanner.nextDouble();

        // Calcular ingresos por harina
        int bultosHarina = (int) (M / 24);
        double ingresoHarina = bultosHarina * B1;

        double restanteHarina = M % 24;
        double ingresoRestanteHarina = restanteHarina * B3;

        // Calcular ingresos por aceite
        int cajasAceite = (int) (N / 15);
        double ingresoAceite = cajasAceite * B2;

        double restanteAceite = N % 15;
        double ingresoRestanteAceite = restanteAceite * B4;

        // Calcular ingreso total
        double ingresoTotal = ingresoHarina + ingresoRestanteHarina + ingresoAceite + ingresoRestanteAceite;

        // Mostrar resultados
        System.out.printf("El ingreso total por la venta de cada tonelada de maíz es: %.2f Bolívares%n", ingresoTotal);
    }
}
    
