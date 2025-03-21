import java.util.Scanner;

public class TwentyTwoCalculoRecargo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio al contado
        System.out.print("Ingrese el precio al contado (P): ");
        double precioContado = scanner.nextDouble();

        // Solicitar el monto de cada cuota
        System.out.print("Ingrese el monto de cada cuota (T): ");
        double montoCuota = scanner.nextDouble();

        // Número de cuotas
        int numeroCuotas = 12;

        // Calcular el costo total al pagar en cuotas
        double costoTotalCuotas = montoCuota * numeroCuotas;

        // Calcular el recargo
        double recargo = costoTotalCuotas - precioContado;

        // Calcular el porcentaje de recargo
        double porcentajeRecargo = (recargo / precioContado) * 100;

        // Mostrar el resultado
        System.out.printf("El porcentaje de recargo por el pago en cuotas es: %.2f%%\n", porcentajeRecargo);
    }
}