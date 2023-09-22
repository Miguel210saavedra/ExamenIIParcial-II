
package programacion1.Semana1;
import java.util.Scanner;

public class Medrano_Miguel_Prestamo {
    
    public static void main (String[] args) {
    
        int prestamo= 100000 ;
        int cantmeses;
       
        
         Scanner lea=new Scanner(System.in);
           
                          
                        
                                
        
        System.out.println("----------------Pretamo Bancario---------------");
        System.out.println("Su Prestamo es de L. 1000,000.00");
        System.out.println("Interes a pagar por mes es del 2%");
        System.out.println("Ingresar Cantidad de Meses");
                          cantmeses=lea.nextInt();
                           double pagomensual;
                          pagomensual=(prestamo*0.02*cantmeses);
        System.out.println("Su Pago Mensual sera de: "+ pagomensual );
        System.out.println("Total: "+(prestamo+pagomensual));
        
        System.out.println("");
        
        
        
        }
}
