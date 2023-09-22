
package programacion1.Semana1;
import java.util.Scanner;

public class Medrano_Miguel_Resultado {
    
  
    
    public static void main (String[] args) {
        
         
          double segundos, horas, minutos;
          
        
        Scanner lea=new Scanner(System.in);
        
            System.out.println("Ingrese un Numero :");
                          segundos=lea.nextInt();
           
    
        
        horas=segundos/3600;
        minutos= segundos/60;
        
        System.out.println("Cantidad de Horas :"+ horas);
        System.out.println("Cantidad de minutos :"+ minutos);
        System.out.println("Cantidad de Segundos :"+ segundos);
        
        }
}
