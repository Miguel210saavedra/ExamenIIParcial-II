
package programacion1.Semana3;
import java.util.Scanner;

public class Traea_Semana3 {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String lea = scanner.nextLine();
        

 
        int posicion= 0, RepMaxima = 0, contador, repeticion;
        char cadena;

        while (posicion < lea.length()) {
            cadena = lea.charAt(posicion);
             repeticion = 1;
             contador = posicion + 1;
            
            while (contador < lea.length()) {
                if (lea.charAt(contador) == cadena) {
                    repeticion=repeticion+1;
                }
                contador=contador+1;
            }

            if (repeticion > RepMaxima) {
                RepMaxima = repeticion;}
                posicion=posicion+1;
        }

    
        posicion = 0;
        String letrasRepetidas = "";
        while (posicion < lea.length()) {
            cadena = lea.charAt(posicion);

            repeticion = 1;
            contador = posicion + 1;
            while (contador < lea.length()) {
                if (lea.charAt(contador) == cadena) {
                    repeticion=repeticion+1;
                }
                contador=contador+1;
            }

            if (repeticion == RepMaxima) {
                letrasRepetidas += "'" + cadena + "', ";
            }

            posicion=posicion+1;
        }

        letrasRepetidas=letrasRepetidas.substring(0, letrasRepetidas.length() - 2);

        if (letrasRepetidas.indexOf(',') == -1) {
            System.out.println("La letra más repetida es " + letrasRepetidas + " y se repite " + RepMaxima + " veces");
        } else {
            System.out.println("Las letras más repetidas son " + letrasRepetidas + " y se repiten " + RepMaxima + " veces cada una");
        }
  
    }
   
}
