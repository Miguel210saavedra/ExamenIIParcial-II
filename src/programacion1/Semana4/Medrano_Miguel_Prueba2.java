
package programacion1.Semana4;
import java.util.Random;
import java.util.Scanner;


public class Medrano_Miguel_Prueba2 {
    public static void main(String[] args) {
Scanner lea= new Scanner (System.in);
         lea.useDelimiter("\n");
        

Random numAleatorio = new Random();
int intentos=0 , numero;
numero=0;

// Numero entero entre 25 y 75
int n = numAleatorio.nextInt(50-1+1) + 1;

        System.out.println("Adivinar Elnumro Aleatorio (1-50) Ramdom");
        
            
            while   (numero!=n){
                System.out.println("\nIntentos Restantes: "+(10-intentos));
                  System.out.println("Ingresar un numero :");
            numero= lea.nextInt();
            while(numero<1||numero>50){
                 System.out.println("Ingresar un numero :");
                numero= lea.nextInt();
            }
                if (numero<n) {
                    System.out.println("\nEn Numero Ramdom es Mayor");
                }
                if (numero>n) {
                    System.out.println("\nEl numero Ramdom en Menor");
                }
                
            intentos=intentos+1;
            
                if (intentos==11) {
                   numero=n; 
                }
            }

            if (intentos<11) {
                System.out.println("\nFelicidades Usted encontro el numero en "+ intentos+" Intentos");
        }else{
                System.out.println("\nIntentos permitidos alcanzados el numero Ramdom era: "+ n);
            } 
                
    
    
}}
