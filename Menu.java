import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
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
                    OnePromedio.main(null);
                    break;
                case 2:
                    TwoInversion.main(null);
                    break;
                case 3:
                    ThreeVendedor.main(null);
                    break;
                case 4:
                    FourTienda.main(null);
                    break;
                case 5:
                    FiveTrabajoFinal.main(null);
                    break;
                case 6:
                    SixEstudiantes.main(null);
                    break;
                case 7:
                    SevenMetros.main(null);
                    break;
                case 8:
                    EightAreatriangulo.main(null);
                    break;
                case 9:
                    NineSalarioTrabajador.main(null);
                    break;
                case 10:
                    TenCambiosDivisas.main(null);
                    break;
                case 11:
                    ElevenSueldoTrabajador.main(null);
                    break;
                case 12:
                    TwelvePromedioEstudiante.main(null);
                    break;
                case 13:
                    ThirteenBanco.main(null);
                    break;
                case 14:
                    FourteenEcuacionLinea.main(null);
                    break;
                case 15:
                    FifteenLuzElectrica.main(null);
                    break;
                case 16:
                    SixteenEmpresaLaminas.main(null);
                    break;
                case 17:
                    SeventeenProductoDescuento.main(null);
                    break;
                case 18:
                    EighteenGasolinera.main(null);
                    break;
                case 19:
                    NineteenHospitalRural.main(null);
                    break;
                case 20:
                    TwentyPrestamo.main(null);
                    break;
                case 21:
                    TwentyOneMayorista.main(null);
                    break;
                case 22:
                    TwentyTwoCalculoRecargo.main(null);
                    break;
                case 23:
                    TwentyThreeMaiz.main(null);
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