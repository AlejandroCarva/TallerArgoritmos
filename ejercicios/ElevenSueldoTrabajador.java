package ejercicios;
import java.util.Scanner;
public class ElevenSueldoTrabajador {
    public void ejercicio11(){
        Scanner lapiz = new Scanner (System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre = lapiz.nextLine();
        System.out.println("Ingrese el numero de horas normales trabajadas: ");
        double horasNormales = lapiz.nextDouble();
        System.out.println("Ingrese el valor por hora normal: ");
        double valorHoraNormal = lapiz.nextDouble();
        System.out.println("Ingrese el numero de horas extra trabajadas: ");
        double horasExtra = lapiz.nextDouble();
        System.out.println("Ingrese el numero  de hijos");
        int cantidadHijos = lapiz.nextInt();
        //Sueldo -- Extra
        double SueldoBase = horasNormales * valorHoraNormal;
        double PagoHoraExtra = valorHoraNormal * 1.25 ;
        double SueldoExtra = horasExtra * PagoHoraExtra;
        //Asignacion
        int AsignacionAcademica = 25000 ;
        int AsignacionHijos = cantidadHijos * 17300 ;
        int  PrimaHogar = 18000 ; 
        int AsignacionTotal = AsignacionAcademica + AsignacionHijos + PrimaHogar ;
        //Deducciones 
        double DeduccionParo = SueldoBase * 0.05 ; 
        double DeduccionPolitica = SueldoBase * 0.02 ; 
        double DeduccionAhorro = SueldoBase * 0.07 ;
        double TotalDeducciones = DeduccionParo + DeduccionPolitica + DeduccionAhorro ;
        //Sueldo Total
        double SueldoTotal = (SueldoBase + SueldoExtra + AsignacionTotal) - TotalDeducciones ;

        //Impimir en pantalla 
        System.out.println("El nombre del trabajador es: "+ nombre);
        System.out.println("El sueldo Base es:" + SueldoBase);
        System.out.println("El sueldo por horas extra es: " + SueldoExtra);
        System.out.println("Asignacion por hijos es: " + AsignacionHijos);
        System.out.println("Total de las Asignaciones: "+ AsignacionTotal);
        System.out.println("Total de deducciones: "+ TotalDeducciones);
        System.out.println("Sueldo Total del Trabajador: "+ SueldoTotal);


    }
}
