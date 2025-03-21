import java.util.Scanner;
public class SixEstudiantes {
    public static void main(String[]args){
        int TotalEstudiantes = 0;
        int TotalMujeres = 0 ;
        int TotalHombres = 0 ;
        int PorcentajeHombre = 0;
        int PorcentajeMujeres = 0 ;
        Scanner Datos = new Scanner(System.in);
        System.out.println("Ingrese el numero de Mujeres:" );
        TotalMujeres = Datos.nextInt();
        System.out.println("Ingrese el total de Hombres :" );
        TotalHombres = Datos.nextInt();
        TotalEstudiantes = TotalMujeres + TotalHombres ;
        System.out.println("Este es el total de estudiantes: "+ TotalEstudiantes);
        PorcentajeHombre = (TotalHombres * 100) / TotalEstudiantes ;
        TotalHombres = Datos.nextInt();
        System.out.println("El porcentaje de Hombres es: "+PorcentajeHombre+"%");
        PorcentajeMujeres = (TotalMujeres * 100) / TotalEstudiantes ;
        TotalMujeres = Datos.nextInt();
        System.out.println("El porcentaje de Mujeres es: "+PorcentajeMujeres+"%");

    }
}
