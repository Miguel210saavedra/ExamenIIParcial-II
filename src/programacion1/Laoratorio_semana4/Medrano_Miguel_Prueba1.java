
package programacion1.Laoratorio_semana4;
import java.util.Scanner;

public class Medrano_Miguel_Prueba1 {
    public static void main(String[] args) {
         Scanner lea=new Scanner (System.in);
        
         lea.useDelimiter("\n");
         
         int OpcionMenu=-0, contador1=0, contador2=0, contador3=0, contador4=0;
         
         while (OpcionMenu==0){
             
         
         System.out.println("\n----------Menu----------");
         System.out.println("1. Palabras Alreves");
         System.out.println("2. Palindromas y Vocal");
         System.out.println("3. Nueros Armostrong");
         System.out.println("4. Votaciones ");
         System.out.println("5. Salir");
         OpcionMenu=lea.nextInt();
         
         while (OpcionMenu<1 || OpcionMenu>5){
             System.out.println("Ingresar una Opcion Valida");
             OpcionMenu=lea.nextInt();
         
         }
             
         String cadena,cadenaInvertida = "";
         
         if (OpcionMenu==1) {
             contador1=contador1+1;
             System.out.println("-----Palabra alrevez-----");
             System.out.println("\nIngrese una palabra : ");
             cadena=lea.next().toLowerCase();
             
        for (int x = cadena.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        
             System.out.println("\nLa Palabra Ingrsada es : "+cadena) ;
             System.out.println("\nLa Palabra alreves es : "+cadenaInvertida) ;
        
            OpcionMenu=0;
        }
         
         String Palindroma, PalindromaAlreves="";
         int Vocales=0, ContadorA=0, ContadorE=0, ContadorI=0, ContadorO=0, ContadorU=0;
         
          if (OpcionMenu==2) {
              contador2=contador1+1;
             System.out.println("-----Palindroma & Vocal");
              System.out.println("\nIngrse Una Palabra");
              Palindroma=lea.next().toLowerCase();
              
              for (int x = Palindroma.length() - 1; x >= 0; x--)
            PalindromaAlreves = PalindromaAlreves + Palindroma.charAt(x);
              
              System.out.println("\nLa Palabra Ingrsada es : "+Palindroma) ;
             System.out.println("La Palabra alreves es : "+PalindromaAlreves) ;
             
              if (Palindroma.equalsIgnoreCase(PalindromaAlreves)) {
                System.out.println("La palabra es palindroma"); 
        }else{
                 System.out.println("La palabra no es palindroma");
            }
              
            for (int x = 0; x < Palindroma.length(); x++) {
                    char letra = Palindroma.charAt(x);
                    switch (letra) {
                        case 'a' -> {
                            Vocales++;
                            ContadorA++;
                     }
                        case 'e'-> {
                           Vocales++;
                            ContadorE++;
                     }
                        case 'i' -> {
                            Vocales++;
                            ContadorI++;
                     }
                        case 'o'-> {
                            Vocales++;
                            ContadorO++;
                     }
                        case 'u'-> {
                            Vocales++;
                            ContadorU++;
                     }
                        default -> {
                     }
                    }}
                    
              System.out.println("La palabra tiene " + Vocales +" vocales en total");
              System.out.println("Cantidad de a: " + ContadorA);
              System.out.println("Cantidad de e: " + ContadorE);
              System.out.println("Cantidad de i: " + ContadorI);
              System.out.println("Cantidad de o: " + ContadorO);
              System.out.println("Cantidad de u: " + ContadorU);
                     
              
             OpcionMenu=0;
        }
          
          
           if (OpcionMenu==3) {
               contador3=contador1+1;
               int opcion1;
             System.out.println("------Nueros Armostrong------");
               System.out.println("\n1- While o 2- For");
               opcion1=lea.nextInt();
                while (opcion1<1||opcion1>2){
                   
               }
               if (opcion1==1) {
                   int c = 0, multiplos=0, temp;
             int Numero =0,Numero2=0;
             String amstrong="";
             
    while (Numero2!=500){
        Numero2=Numero2+1;
        Numero=Numero2;
        temp = Numero;
        c=0;
        multiplos=0;
        
    while (Numero > 0) {
        multiplos = Numero % 10;
        Numero= Numero/ 10;
        c = c + (multiplos * multiplos * multiplos);
        
       
    }
    
       if (temp == c){
              amstrong+="\n"+Numero2;
        }     
   }

       System.out.println(amstrong);
               }
               
    
             if (opcion1==2) {
                 
             int c = 0, multiplos=0, temp;
             int Numero =0;
             String amstrong="";
                   
             for (int Numero2 = 0; Numero2 < 500; Numero2++) {
                       
             Numero2=Numero2+1;
             Numero=Numero2;
             temp = Numero;
             c=0;
             multiplos=0;
        
             for (int i=Numero+1; i > 0; i--) {
             multiplos = Numero % 10;
             Numero= Numero / 10;
             c = c + (multiplos * multiplos * multiplos); 
             }

         if (temp == c){
              amstrong+="\n"+Numero2;
        }     
      
      }
              System.out.println(amstrong);                  
    }
    
             OpcionMenu=0;
  }
           
           int  error=0,ganador=0, contador=0,opcion=0, voto=0,contarazul=0,contarrojo=0,contarnegro=0,contaramarillo=0, contarOpcion1=0, contarOpcion2=0, contarOpcion3=0,contarOpcion4=0; 
           double votosvalidos=0, votantes=0;
           
            if (OpcionMenu==4) {
                contador4=contador1+1;
             System.out.println("-----Votos-----");
               System.out.println("Cuantos Votantes habran? : ");
            votantes=lea.nextDouble();
            
            while(contador<votantes){
            contador=contador+1;     
                System.out.println("\nPlanilla a Votar"+contador+"? : ");
                System.out.println("1- Azul");
                System.out.println("2- Rojo");
                System.out.println("3- Negro");
                System.out.println("4- Amarillo");           
                voto=lea.nextInt();
                
            if (voto<1 || voto>4){
                contador=contador-1;
                System.out.println("Voto no valido, ingresar nuevamente!");
            }
            
          if (voto==1){
              contarazul=contarazul+1;
          }  
          if (voto==2){
              contarrojo=contarrojo+1;              
          }if (voto==3){
              contarnegro=contarnegro+1;             
          }
          if (voto==4){
              contaramarillo=contaramarillo+1;     
          }
          
            }
            
           votosvalidos=votantes*0.6;
           System.out.println("\nvotos a azul:"+contarazul);
           System.out.println("votos a rojo:"+contarrojo);
           System.out.println("votos a negro:"+contarnegro);
           System.out.println("votos a amarillo:"+contaramarillo);
           contador=0;
           
                while (error<1) {
                    
            if(contarazul>=votosvalidos){
            System.out.println("Planilla ganadora es la Azul con: "+contarazul+" votos");
                error=error+1;
                ganador=1;
            }
            
            if(contarrojo>=votosvalidos){
                System.out.println("Planilla ganadora es la Roja con : "+contarrojo+" votos");
                error=error+1;
                ganador=1;
            }
            if(contarnegro>=votosvalidos){
                System.out.println("Planilla ganadora es la Negra  con : "+contarnegro+" votos");
                error=error+1;
                ganador=1;
            }
            if(contaramarillo>=votosvalidos){
                System.out.println("Planilla ganadora es la Amarrila con : "+contaramarillo+" votos");
                error=error+1;
                ganador=1;
            }
                    if (ganador==0) {
                        System.out.println("Votacion Fallida");
                        error=error+1;
                    }
                }
   
           
           
              
             OpcionMenu=0;
        }
            
             if (OpcionMenu==5) {
             System.out.println("\nContador 1: "+contador1);
             System.out.println("Contador 2: "+contador2);
             System.out.println("Contador 3: "+contador3);
             System.out.println("Contador 4: "+contador4);

             
             OpcionMenu=8;
        }
         
      }
    
    }}

