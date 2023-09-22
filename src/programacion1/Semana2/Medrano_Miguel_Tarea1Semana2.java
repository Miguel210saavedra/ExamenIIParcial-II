
package programacion1.Semana2;
import java.util.Scanner;

public class Medrano_Miguel_Tarea1Semana2 {
    
       public static void main (String[] args) {
           
         Scanner lea=new Scanner(System.in);
         lea.useDelimiter("\n");
         String nombreEmpleado;
         double horas, tarifa;
         
       System.out.println("Ingresar Nombre del Empleado");
                          nombreEmpleado=lea.next();
        System.out.println("");
        System.out.println("Ingree Horas Trabajdas: ");
        horas=lea.nextInt();
        System.out.println("");
        System.out.println("Tarifa Por Hora: ");
        tarifa=lea.nextInt();
        System.out.println("");
        
        double salario=(horas*tarifa);
        
        System.out.println("--------------Boleta del Empleado----------");
          System.out.println("Nombre Empleado:       "+ nombreEmpleado);
          System.out.println("Horas de Trabajo:      "+horas);
         System.out.println("Tarija por Hora:       "+tarifa);
        System.out.println("Salario del Empleado:  "+salario);
        System.out.println("-----------------------------------------");
                
        
        }
}
