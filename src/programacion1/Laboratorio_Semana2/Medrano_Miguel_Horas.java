
package programacion1.Laboratorio_Semana2;
import java.util.Scanner;

public class Medrano_Miguel_Horas {
    
    public static void main(String[] args) {
        
        Scanner lea= new Scanner(System.in);
        
    int segundos,minutos,horas;    
    
    System.out.println("Ingrese la cantidad en segundos: ");
    segundos=lea.nextInt();
   
        if (segundos>0){
          horas=segundos/3600;
          minutos=segundos/60;  
         
        System.out.println("\n>> "+horas+" Hora(s) >> "+(minutos-(horas*60))+" Minuto(s) >> "+(segundos-(minutos*60))+" Segundo(s) <<");
        
        }else {
        System.out.println("Error, numero fuera de rango");
        }
    }
}
