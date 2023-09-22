package programacion1.Semana7;

import java.util.Scanner;

public class Prueba1_Parcial2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        int Tamaño;
        double primo = 0;
        System.out.println("Ingresar Tamaño Del Primer Arreglo :");
        Tamaño = lea.nextInt();

        System.out.println("\nIngresar Numeros del Arreglo 1");
        int arreglo1[] = new int[Tamaño];

        for (int Numero = 0; Numero < Tamaño; Numero++) {
            System.out.println("Ingresar numero en la posicion [" + Numero + "]");
            arreglo1[Numero] = lea.nextInt();
            while(arreglo1[Numero]<0){
                System.out.println("Ingresar Un valor Positivo :");
                arreglo1[Numero] = lea.nextInt();
            }
            int contador = 0, contador2=0;
           
            while(contador2==0){
               contador=0;
                for ( int I = 1; I <= arreglo1[Numero]; I++) {
                if ((arreglo1[Numero] % I) == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                contador2=2;
            } 
            else{
                System.out.println("Valor no Valido, Ingresar Un Numero Primo :");
                arreglo1[Numero] = lea.nextInt();
                contador2=0;
            }
            }

        }

        System.out.println("\nIngresar Numeros del Arreglo 2");
        int arreglo2[] = new int[Tamaño];

        for (int Numero = 0; Numero < Tamaño; Numero++) {
            System.out.println("Ingresar numero en la posicion [" + Numero + "]");
            arreglo2[Numero] = lea.nextInt();
            while(arreglo2[Numero]<0){
                System.out.println("Ingresar Un valor Positivo :");
                arreglo2[Numero] = lea.nextInt();
            }
            
            int contador = 0, contador2=0;
           
            while(contador2==0){
               contador=0;
                for ( int I = 1; I <= arreglo2[Numero]; I++) {
                if ((arreglo2[Numero] % I) == 0) {
                    contador++;
                }
            }
            if (contador <= 2) {
                contador2=2;
            } 
            else{
                System.out.println("Valor no Valido, Ingresar Un Numero Primo :");
                arreglo2[Numero] = lea.nextInt();
                contador2=0;
            }
            }
        }

        String cadena="";
        int suma=0;
        for (int i = 0; i < Tamaño-1; i++) {
            for (int j = 0; j <Tamaño-1; j++) {
               if ( arreglo1[i]==arreglo2[j]) {
                   suma=1;
                }else{
                   suma=0;
               }
                 if (suma==0) {
                    cadena+=arreglo1[i]+" ,";
                }
            }
            
                
            
        }
        
        System.out.println("Numeros Que no Estan en B");
        System.out.println(cadena);
    }
}
