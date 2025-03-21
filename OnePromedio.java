import java.util.Scanner;

public class OnePromedio {
    public static void main(String[] args) throws Exception {
        // Promedio de 3 personas
        int a = 0;
        int b = 0;
        int c = 0;
        int prom = 0;
        Scanner edad = new Scanner(System.in);        
        System.out.println("Ingrese edad de la primera persona a:");
        a = edad.nextInt();
        System.out.println("Ingrese edad de la segunda persona b:");
        b = edad.nextInt();
        System.out.println("Ingrese edad de la tercera persona c:");
        c = edad.nextInt();
        prom = (a + b + c) / 3;
        System.out.println("El promedio de las edades es: " + prom);      
    }
}
