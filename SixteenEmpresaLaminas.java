import java.util.Scanner;
public class SixteenEmpresaLaminas {
    public static void main(String[]args){
        Scanner lapiz = new  Scanner(System.in);
        //Dimensiones 
        double ancho = 4.0 ;
        double largo = 1.5 ;
        double ConsumoPieza = 0.5;
        //Area Total de la lamina
        double areaTotal = ancho * largo ;
        //Cantidad de piezas que se pueden fabricar
        int CantidadPiezas = (int) (areaTotal / ConsumoPieza);
        //Calcular el desperdicio
        double Areautilizada = CantidadPiezas * ConsumoPieza ;
        double Desperdicio = areaTotal - Areautilizada;
        System.out.println("Número de piezas que se pueden fabricar:"+ CantidadPiezas);
        System.out.println("El desperdicio de cada pieza es: "+ Desperdicio);



    }
    
}
