
package programacion1.Semana2;

import java.util.Scanner;

public class Medrano_Miguel_Tarea2 {
    
    public static void main(String[] args) {
        /*
        La funcion de operador ternario practicamnete finciona comoun If
        nos devolvera un valor si la condicion es verdadera u otro valor si la
        condicion es falsa.
        */
        
        //Uso Valor contasnte 
        int x=10;
        String Respuesta;
        System.out.println("Ejemplo 1 Valor Contante ");
        Respuesta = (x<10) ? "X es menor a 10" : "X es mayor o igual a 10";
        
        System.out.println(Respuesta);
        
       
        // Uso con Variabel 
        
        double numero1, numero2;
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        System.out.println("\nEjemplo dos con Variable");
        System.out.println("Ingrese Numero 1 y Numero 2!");
        numero1=lea.nextDouble();
        numero2=lea.nextDouble();
        
        String Respuesta2;
         Respuesta2 = (numero1<numero2) ? "Numero 1 es menor que el numero 2" : "Numero 1 es mayor que numero 2";
         
         System.out.println(Respuesta2);
         
         
         
        //Uso Con Formula
        
        double numero3, numero4, Respuesta3;
    
        System.out.println("\nEjemplo dos con Formula");
        System.out.println("Se restara al numero mayor el numeor menor!");
        System.out.println("Ingrese Numero 1 y Numero 2!");
        numero3=lea.nextDouble();
        numero4=lea.nextDouble();
        
        
         Respuesta3 = (numero3<numero4) ? (numero4-numero3) : (numero3-numero4);
         
         System.out.println(Respuesta3);
         
        
    }
}
