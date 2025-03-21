import java.util.Scanner;

public class TenCambiosDivisas {
    public static void main (String [] args){
        ///Cambios de divisas
    Double chelinesAustriaocos = (956.871/100);
    Double Austriacos ; 
    Scanner lapiz = new Scanner (System.in);
    System.out.println("Ingrese los Chelines Austriacos a convertir a Pesetas: ");
    Austriacos = lapiz.nextDouble();
    Austriacos = Austriacos * chelinesAustriaocos ;
    System.out.println("La cantidad de Pesetas es: "+ Austriacos);
    Double DracmasGriegos = (88.607/100);
    Double Griegos ;
    //CONVERSION DE DRACMAS A FRANCOS
    System.out.println("Ingrese los Dracmas Griegos a convertir a Francos Franceses:");
    Griegos = lapiz.nextDouble();
    Griegos = (Griegos * DracmasGriegos)/20.110;
    System.out.println("La cantidad de Francos Franceses es: "+ Griegos);
    // CONVERSION PESETAS A DOLARES Y LIRIAS ITALIANAS
    Double Pesetas = 122.499 ;
    Double Dolares ;
    Double PesetasaDolares ;
    Double LiriasItalias = (9.289/100) ;
    Double Lirias ;
    Double PesetasaLirias ;
    double Pesetas1 ;
    System.out.println("Ingrese Cantidad de Pesetas a convertir a dolares");
    Dolares = lapiz.nextDouble();
    PesetasaDolares = (Pesetas * Dolares);
    System.out.println("La cantidad de Dolares es: "+ PesetasaDolares);
    System.out.println("Ingrese Cantidad de Pesetas a Convertir Lirias italianas");
    Pesetas1 = lapiz.nextDouble();
    PesetasaLirias = (Pesetas1 / LiriasItalias);
    System.out.println("La cantidad de Lirias italianas es: "+ PesetasaLirias);








        

    }
    
}
