import java.util.Scanner;
public class FiveTrabajoFinal {
    public static void main(String[] args){
        int Calificacion1 = 0 ;
        int Calificacion2 = 0 ;
        int Calificacion3 = 0 ;
        int TotalParciales = 0 ;
        int NotalParciales = 0 ;
        int ExamenFinal = 0 ;
        int TrabajoFinal = 0 ;
        int CalificacionFinal = 0 ;
        Scanner Trabajo = new Scanner (System.in);
        System.out.println("Ingresa calificacion del primer examen ");
        Calificacion1 = Trabajo.nextInt();
        System.out.println("Ingresa calificacion del segundo examen ");
        Calificacion2 = Trabajo.nextInt();
        System.out.println("Ingresa calificacion del tercer examen");
        Calificacion3 = Trabajo.nextInt();
        TotalParciales = (Calificacion1 + Calificacion2 + Calificacion3)/3;
        NotalParciales = (TotalParciales * 55)/100 ;
        System.out.println("Promedio notas parciales " + NotalParciales);
        System.out.println("Ingresa calificacion del examen final");
        ExamenFinal = Trabajo.nextInt();
        ExamenFinal = (ExamenFinal * 30)/100 ;
        System.out.println("Nota del examen final " + ExamenFinal);
        System.out.println("Ingrese calificacion del trabajo final");
        TrabajoFinal = Trabajo.nextInt();
        TrabajoFinal = (TrabajoFinal * 15)/100 ;
        System.out.println("Promedio del trabajo final " + TrabajoFinal);
        CalificacionFinal = NotalParciales + ExamenFinal + TrabajoFinal ;
        System.out.println("La calificacion final es: " + CalificacionFinal);








    }
    
}
