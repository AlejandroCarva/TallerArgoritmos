import java.util.Scanner;

public class ConversorDivisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversión de chelines austríacos a pesetas
        System.out.print("Ingrese la cantidad en chelines austríacos: ");
        double chelines = scanner.nextDouble();
        double pesetasFromChelines = chelines * 9.56871;
        System.out.printf("%.2f chelines austríacos son %.2f pesetas.%n", chelines, pesetasFromChelines);

        // Conversión de dracmas griegos a francos franceses
        System.out.print("Ingrese la cantidad en dracmas griegos: ");
        double dracmas = scanner.nextDouble();
        double pesetasFromDracmas = dracmas * 0.88607;
        double francosFromDracmas = pesetasFromDracmas / 20.110;
        System.out.printf("%.2f dracmas griegos son %.2f francos franceses.%n", dracmas, francosFromDracmas);

        // Conversión de pesetas a dólares y liras italianas
        System.out.print("Ingrese la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();
        double dolares = pesetas / 122.499;
        double liras = pesetas / 0.09289;
        System.out.printf("%.2f pesetas son %.2f dólares y %.2f liras italianas.%n", pesetas, dolares, liras);

        scanner.close();
    }
}
