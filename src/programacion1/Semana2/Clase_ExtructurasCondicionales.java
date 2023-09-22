
package programacion1.Semana2;
import java.util.Scanner;

public class Clase_ExtructurasCondicionales {
    
    public static void main(String[] args) {
        
        //Declarar Variable 
        double notaFinal;
     String observacion;
        
        Scanner lea=new Scanner(System.in);
        
        System.out.println("Ingresar Nota Final");
                          notaFinal=lea.nextDouble();
        
                          observacion="Reprobado";
                          
                               char opcion;
        
        System.out.println("Tipo de Opciones: \n A-Opcion\nB-opcion\nSeleccione una Opcion");
        opcion=lea.next().toUpperCase().charAt(0);
                          
         if (opcion=='A' || opcion=='B') {
        
         if (notaFinal>=59.5) {
             
             observacion="Aprobado";  

            }
            
               System.out.println("Nota Final : "+notaFinal+ " - "+observacion); 
               
               }else{
                       System.out.println("Error Opcion no valida");
                       }  
    
         
         
         
         
         
  
    }
    
}
