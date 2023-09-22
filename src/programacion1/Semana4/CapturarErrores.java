
package programacion1.Semana4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CapturarErrores {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
         int opcion=0;
         
         do {
            
        
        try{
        System.out.println("****Menu****");
        System.out.println("1- Suma ");
         System.out.println("2- Resta ");
          System.out.println("3- Multiplicar ");
           System.out.println("4- Salir ");
           
           opcion=lea.nextInt();
           //opcion=0/0;
            System.out.println(opcion);
            String palabra="Programacaion";
            char letra=' ';
            for (int contar = 0; contar < palabra.length()+1; contar++) {
                letra=palabra.charAt(contar);
            }
            System.out.println("Letra: "+letra);
          
        }catch(InputMismatchException e){
            
            System.out.println("Error, Ingresar Solo Numeros");
        lea.nextLine();
        }catch(Exception e){
            System.out.println("Error General");
            
        }     
           
        } while (opcion!=4);
    }
}
