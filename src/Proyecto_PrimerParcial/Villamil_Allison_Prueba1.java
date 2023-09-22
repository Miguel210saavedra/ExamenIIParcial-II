
package villamil_allison_prueba1;

import java.util.Scanner;

public class Villamil_Allison_Prueba1 {

    public static void main(String[] args) {
   Scanner leer=new Scanner (System.in);
   leer.useDelimiter("\n");
        String palabra,palindroma;
        String invertida="";
        int cantidadVocales=0,cantidadA=0,cantidadE=0,cantidadI = 0,cantidadO=0,cantidadU = 0,contar=0,planilla=0;
        int opcion=0,contarOpcion1=0,contarOpcion2=0,contarOpcion4=0,contarOpcion3=0;
        double votosvalidos=0,cantidadvotantes=0;
        while(opcion!=5){
        System.out.println("MENU\n1- Palabra alrevez\n2- Palindroma y vocal\n3- Numeros Armstrong\n4- Votaciones\n5- Salir\nElegir una opcion: ");
        opcion=leer.nextInt();

        if (opcion==1){
            contarOpcion1=contarOpcion1+1;
            System.out.println("---Palabra Alreves---");
            System.out.println("Ingrese una palabra");
            palabra=leer.next();
            StringBuilder stringBuilder = new StringBuilder(palabra);
            invertida = stringBuilder.reverse().toString();
            System.out.println("Palabra original: " + palabra);
	    System.out.println("Palabra invertida: " + invertida);
        }
        if (opcion==2){
             contarOpcion2=contarOpcion2+1;
            System.out.println("---Palindroma & vocal---");
            System.out.println("Ingrese una palabra");
            palindroma =leer.next().toLowerCase();
           String palabraInvertida = new StringBuilder(palindroma).reverse().toString();
            System.out.println("La palabra invertida es: " + palabraInvertida);
            if (palindroma.equalsIgnoreCase(palabraInvertida)) {
                System.out.println("La palabra es palindroma."); 
        }else{
                 System.out.println("La palabra no es palindroma.");
            }
     
                for (int i = 0; i < palindroma.length(); i++) {
                    char letra = palindroma.charAt(i);
                    switch (letra) {
                        case 'a' -> {
                            cantidadVocales++;
                            cantidadA++;
                     }
                        case 'e'-> {
                            cantidadVocales++;
                            cantidadE++;
                     }
                        case 'i' -> {
                            cantidadVocales++;
                            cantidadI++;
                     }
                        case 'o'-> {
                            cantidadVocales++;
                            cantidadO++;
                     }
                        case 'u'-> {
                            cantidadVocales++;
                            cantidadU++;
                     }
                        default -> {
                     }
                    }
                }
            System.out.println("La palabra tiene " + cantidadVocales + " vocales en total.\n"+"Cantidad de A: " + cantidadA+"\n"+
           "Cantidad de E: " + cantidadE+"\n"+"Cantidad de I: " + cantidadI+"\n"+"Cantidad de O: " + cantidadO+"\n"+"Cantidad de U: " + cantidadU);
                
        }   
        
  int contarvotos=0,contarazul=0,contarrojo=0,contarnegro=0,contaramarillo=0;
  
        if (opcion==3){
         contarOpcion3=contarOpcion3+1;
            System.out.println("1-WHILE\n2-FOR");
            int respuesta=leer.nextInt();
            if (respuesta==1){
        int numero = 1;

        while (numero <= 500) {
            int numeroOriginal = numero;
            int sumaCubos = 0;

            while (numeroOriginal > 0) {
                int digito = numeroOriginal % 10;
                sumaCubos += Math.pow(digito, 3);
                numeroOriginal/= 10;
            }
            if (sumaCubos == numero) {
                System.out.println("Suma de cubos: "+numero);
            }

            numero++;
        }
            }
         if (respuesta==2){
         
        for (int numero = 1; numero <= 500; numero++) {
            int numeroOriginal = numero;
            int sumaCubos = 0;

            while (numeroOriginal > 0) {
                int digito = numeroOriginal % 10;
                sumaCubos += Math.pow(digito, 3);
                numeroOriginal /= 10;
            }
            if (sumaCubos == numero) {
                System.out.println("Suma de cubos"+numero);
            }
        }
            }
        }
        if(opcion==4){
            contarOpcion4=contarOpcion4+1;
            System.out.println("Cantidad de votantes en el pais: ");
            cantidadvotantes=leer.nextDouble();
            
            while(contar!=cantidadvotantes){
             contar=contar+1;      
            System.out.println("Ingresar la planilla a votar: \n(1-AZUL, 2-ROJO,3- NEGRO 4- AMARILLO)(INGRESAR NUMEROS)\nVoto #: "+contar);
            planilla=leer.nextInt();
            if (planilla!=1 && planilla!=2 && planilla!=3 && planilla!=4){
                contar=contar-1;
                System.out.println("Voto no valido, ingrese la planilla nuevamente ");
            }
             if (planilla==1){
              contarazul=contarazul+1;
             
          }  
          if (planilla==2){
              contarrojo=contarrojo+1;
              
          }if (planilla==3){
              contarnegro=contarnegro+1;
              
          }
          if (planilla==4){
              contaramarillo=contaramarillo+1;
             
          }
          
            }
            
           votosvalidos=cantidadvotantes*0.6;
           System.out.println("votos planilla azul:"+contarazul);
           System.out.println("votos planilla rojo:"+contarrojo);
           System.out.println("votos planilla negro:"+contarnegro);
           System.out.println("votos planilla amarillo:"+contaramarillo);
            contar=0;
            if(contarazul>=votosvalidos){
                System.out.println("Planilla ganadora: (Azul)  con: "+contarazul+" votos");
            }
            else
                System.out.println("VOTACION FALLIDA");
            if(contarrojo>=votosvalidos){
                System.out.println("Planilla ganadora: (rojo)  con: "+contarrojo+" votos");
            }
            if(contarnegro>=votosvalidos){
                System.out.println("Planilla ganadora: (Negro)  con: "+contarnegro+" votos");
            }
            if(contaramarillo>=votosvalidos){
                System.out.println("Planilla ganadora: (Amarillo)  con: "+contaramarillo+" votos");
            }
           
            
          }
        if(opcion==5){
            System.out.println("Cantidad de ingresos opcion 1: "+contarOpcion1);   
            System.out.println("Cantidad de ingresos opcion 2: "+contarOpcion2);  
            System.out.println("Cantidad de ingresos opcion 3: "+contarOpcion3);  
            System.out.println("Cantidad de ingresos opcion 4: "+contarOpcion4);  
        }
        } 
    }
 
}
