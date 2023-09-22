
package programacion1.Semana9;

import java.util.Scanner;
import java.util.InputMismatchException;
public class main {
public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int longitud;
        
       
       System.out.println("Ingresar Logintud deseada de Canciones");
       longitud= lea.nextInt();
       while(longitud<1){
           System.out.println("Valor no permitido ingresar un numero mayor a 0:");
           longitud= lea.nextInt();
          
       }
        
        Jtunes jtunes = new Jtunes(longitud);

        int menu=0, numero, codigo;
        String nombre;
        double precio;
        
        while (menu==0){
            try{
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("1- Nueva Cancion");
            System.out.println("2- Calificar Cancion");
            System.out.println("3- Mostar Canciones");
            System.out.println("4- Salir");
            System.out.println("-------------------------");
            System.out.println("Seleccionar Una Opcion: ");
            numero = lea.nextInt();
            while (numero<1 || numero>5){
                System.out.println("Opcion no valida Ingresar Nuevamnete");
                numero = lea.nextInt();
            }

            if (numero==1) {
                System.out.println("");
                System.out.println("Ingrese Codigo de la Cancion:");
                codigo = lea.nextInt();
                System.out.println("Ingrese el nombre de la cancion: ");
                nombre = lea.next();
                System.out.println("Ingrese el precio de la cancion: ");
                precio = lea.nextDouble();
                boolean agregada = jtunes.addSong(nombre ,codigo, precio);
                if (agregada) {
                    System.out.println("Cancion agregada! ");
                } else {
                    System.out.println("Codigo ya en Uso! No es permitido Ingresarla");
                }}
            
            if (numero == 2) {
                System.out.println("");
                System.out.println("Ingresar el codigo de la cancion : ");
                codigo = lea.nextInt();
                System.out.println("Calificar del 1 al 5:");
                int calificacion = lea.nextInt();
                jtunes.rateSong(codigo, calificacion);
            } else if (numero == 3) {
                System.out.println("");
                System.out.println("-------Lista De canciones-------");
                jtunes.printSongs();
                System.out.println("--------------------------------");
            }
            
            if (numero == 4){
                menu=1;
            }
   
        }
         catch(InputMismatchException e){
             System.out.println("Error permitido solamente el uso de numeros! ");
             lea.nextLine();
         }}   
            
        }
         
}

