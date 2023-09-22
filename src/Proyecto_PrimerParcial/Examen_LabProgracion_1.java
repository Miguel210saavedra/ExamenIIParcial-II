
package Proyecto_PrimerParcial;

import java.util.Scanner;
public class Examen_LabProgracion_1 {
            public static void main(String[] args) {
        Scanner lea= new Scanner (System.in);
         lea.useDelimiter("\n");
         int funcionmenu=0;
        do {
            int menu;
         System.out.println("\n-------------------Menu-------------------");
         System.out.println("1- Numero al reves.");
         System.out.println("\n2- Convertir decimal a binario.");
         System.out.println("\n3- La String Mayor.");
         System.out.println("\n4- Salir");
            System.out.println("------------------------------------------");
         
         System.out.println("\nIngresar Opcion del Menu : ");
         menu=lea.nextInt();
         while(menu<1 ||  menu>4){
             System.out.println("Ingrsar Una Opcion Valida del Menu : ");
             menu=lea.nextInt();
         }
         
        if (menu==1) {
            int numero,resultado=0,numerosuma=0;
            String suma="";
            System.out.println("\nIngresar un numro Entero");
            numero=lea.nextInt();
            while(numero<1){
             System.out.println("Ingrsar Un Numero Entero : ");
             numero=lea.nextInt();
         }     
            numerosuma=numero;
            while(numerosuma > 0) {

            resultado += numerosuma % 10;

            numerosuma = numerosuma / 10;

        }
            
            
          suma+=numero;
          int cadena,sumatotal=0;
          cadena=suma.length();
           
          String Alrevez="", Sumatoria=""; 
            
            for (int i = cadena-1; i != -1; i--) {
                char s=suma.charAt(i);
                Alrevez+=s;
                if (i==cadena-1) {
                   Sumatoria+=""+s; 
                }
                if (i!=cadena-1) {
                   Sumatoria+="+"+s;   
                }
              
              
            }
            System.out.println("Al Revez : "+Alrevez);
            System.out.println("Sumatoria : "+Sumatoria+"="+resultado);
            funcionmenu=0;
        }
 
        if (menu==2) {
         int numero;
         System.out.println("\nIngresar Un Numero entero");
         numero=lea.nextInt();

         while  (numero<0){
             System.out.println("Ingresar Un valor Positivo");
             numero=lea.nextInt();
         }
         
        int index =0, posicion, valido;
         posicion= numero;
        
        if (numero == 0) {
            System.out.println("El número binario equivalente a " + numero + " es: 0");
        } else {
            while (posicion > 0) {
                posicion = posicion / 2;
                index++;
            }
            
            valido = index - 1;
            System.out.println("Numero en Binario : ");
            while (valido >= 0) {
                int bit = (numero >> valido) & 1;
                System.out.print(bit);
                valido--;
            }
            System.out.println("\n");
          
           
        }
        funcionmenu=0;
        } 
         
        if (menu==3) {
         
            int numeroPalabras, CantidadCaracteres = 0, contador=0; 
            String PalabraGanadora = "", Palabra="";
                System.out.println("\nIngresa el numero de palabras que desea ingresar: ");
                numeroPalabras = lea.nextInt();
                lea.nextLine();

                while (contador<numeroPalabras){
                    
                    System.out.println("Palabra :" + (contador+1) + ":");
                    Palabra = lea.nextLine();

                    if(Palabra.length()==PalabraGanadora.length()){
                        CantidadCaracteres=Palabra.length();
                        PalabraGanadora+= ", "+Palabra;
                    }

                    if (Palabra.length() > CantidadCaracteres) {
                        CantidadCaracteres = Palabra.length();
                        PalabraGanadora = Palabra;
                    }
                    
                    contador=contador+1;
                }
               
            System.out.println("La palabra mas larga es: "+PalabraGanadora);
            System.out.println("Cantidad de caracteres: "+ CantidadCaracteres);
            funcionmenu=0;
        } 
        
            if (menu==4) {
                funcionmenu=1;
            }
        
        } while (funcionmenu==0);
         
         
 

    }
}
