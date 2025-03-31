package control;
import ejercicios.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione un ejercicio para ejecutar:");
            System.out.println("1. Promedio de edad de 3 personas");
            System.out.println("2. Inversion en un banco");
            System.out.println("3. Sueldo Vendedor ");
            System.out.println("4. Descuento de una tienda");
            System.out.println("5. Promedio Estudiantes");
            System.out.println("6. Porcentaje Hombres y Mujeres");
            System.out.println("7. Metros a Pies y Pulgadas");
            System.out.println("8. Area de un Triangulo ");
            System.out.println("9. Sueldo Neto del Trabajador");
            System.out.println("10. Cambio de Divisas");
            System.out.println("11. Asignaciones,Deducciones y sueldo neto del trabajador");
            System.out.println("12. Promedio general en tres materias");
            System.out.println("13. Cantidad de dinero en un Banco");
            System.out.println("14. Ecuacion lineal");
            System.out.println("15. Total a pagar de luz");
            System.out.println("16. Empresa de laminas");
            System.out.println("17. Porcentaje de Descuento");
            System.out.println("18. Gasolinera");
            System.out.println("19. Hospital Rural");
            System.out.println("20. Porcentaje cobrado por un prestamo");
            System.out.println("21. Mayorista");
            System.out.println("22. Comerciante");
            System.out.println("23. Tonelada de maiz");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                OnePromedio ejercicio1Edades = new OnePromedio();
                ejercicio1Edades.ejercicio1();
                    break;
                case 2:
                TwoInversion ejercicio2Inversion = new TwoInversion();
                ejercicio2Inversion.ejercicio2();
                    break;
                case 3:
                    ThreeVendedor ejercicioThreeVendedor = new ThreeVendedor();
                    ejercicioThreeVendedor.ejercicio3();
                    break;
                case 4:
                    FourTienda ejercicioFourTienda = new FourTienda();
                    ejercicioFourTienda.ejercicio4();
                    break;
                case 5:
                    FiveTrabajoFinal ejercicioFiveTrabajoFinal = new FiveTrabajoFinal();
                    ejercicioFiveTrabajoFinal.ejercicio5();
                    break;
                case 6:
                    SixEstudiantes ejercicioSixEstudiantes = new SixEstudiantes();
                    ejercicioSixEstudiantes.ejercicio6();
                    break;
                case 7:
                    SevenMetros ejercicioSevenMetros = new SevenMetros();
                    ejercicioSevenMetros.ejercicio7();
                    break;
                case 8:
                    EightAreatriangulo ejercicioEightAreatriangulo = new EightAreatriangulo();
                    ejercicioEightAreatriangulo.ejercicio8();
                    break;
                case 9:
                    NineSalarioTrabajador ejercicioNineSalarioTrabajador = new NineSalarioTrabajador();
                    ejercicioNineSalarioTrabajador.ejercicio9();
                    break;
                case 10:
                    TenCambiosDivisas ejercicioTenCambiosDivisas = new TenCambiosDivisas();
                    ejercicioTenCambiosDivisas.ejercicio10();
                    break;
                case 11:
                    ElevenSueldoTrabajador ejercicioElevenSueldoTrabajador = new ElevenSueldoTrabajador();
                    ejercicioElevenSueldoTrabajador.ejercicio11();
                    break;
                case 12:
                    TwelvePromedioEstudiante ejercicioTwelvePromedioEstudiante = new TwelvePromedioEstudiante();
                    ejercicioTwelvePromedioEstudiante.ejercicio12();
                    break;
                case 13:
                    ThirteenBanco ejercicioThirteenBanco = new ThirteenBanco();
                    ejercicioThirteenBanco.ejercicio13();
                    break;
                case 14:
                    FourteenEcuacionLinea ejercicioFourteenEcuacionLinea = new FourteenEcuacionLinea();
                    ejercicioFourteenEcuacionLinea.ejercicio14();
                    break;
                case 15:
                    FifteenLuzElectrica ejercicioFifteenLuzElectrica = new FifteenLuzElectrica();
                    ejercicioFifteenLuzElectrica.ejercicio15();
                    break;
                case 16:
                    SixteenEmpresaLaminas ejercicioSixteenEmpresaLaminas = new SixteenEmpresaLaminas();
                    ejercicioSixteenEmpresaLaminas.ejercicio16();
                    break;
                case 17:
                    SeventeenProductoDescuento ejercicioSeventeenProductoDescuento = new SeventeenProductoDescuento();
                    ejercicioSeventeenProductoDescuento.ejercicio17();
                    break;
                case 18:
                    EighteenGasolinera ejercicioEighteenGasolinera = new EighteenGasolinera();
                    ejercicioEighteenGasolinera.ejercicio18();
                    break;
                case 19:
                    NineteenHospitalRural ejercicioNineteenHospitalRural = new NineteenHospitalRural();
                    ejercicioNineteenHospitalRural.ejercicio19();
                    break;
                case 20:
                    TwentyPrestamo ejercicioTwentyPrestamo = new TwentyPrestamo();
                    ejercicioTwentyPrestamo.ejercicio20();
                    break;
                case 21:
                    TwentyOneMayorista ejercicioTwentyOneMayorista = new TwentyOneMayorista();
                    ejercicioTwentyOneMayorista.ejercicio21();
                    break;
                case 22:
                    TwentyTwoCalculoRecargo ejercicioTwnentyTwentyTwoCalculoRecargo = new TwentyTwoCalculoRecargo();
                    ejercicioTwnentyTwentyTwoCalculoRecargo.ejercicio22();
                    break;
                case 23:
                    TwentyThreeMaiz ejercicTwentyThreeMaiz = new TwentyThreeMaiz();
                    ejercicTwentyThreeMaiz.ejercicio23();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}