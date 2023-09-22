
package programacion1.Semana3;
import java.util.Scanner;

public class Ejercicios_While {
    
    public static void main(String[] args) {
      
        Scanner lea=new Scanner(System.in);
        double numeros, numero, suma, mayor, menor, par;
        int  contador, cantidadpares;
        String indicadormayor2,indicadormenor2,aa;
        
        aa="";
        par=0;
        indicadormayor2="";
       cantidadpares=0;
        indicadormenor2="";
        mayor=0;
        menor=100000000;
        suma=0;
        contador=1; 
        System.out.println("Ingrese la Cantidad de Numeros");
        numeros=lea.nextDouble();
          while (numeros<0){
                  System.out.println("Ingrese la Cantidad de Numeros");
                   numeros=lea.nextDouble();
              }
         
        while (contador<=numeros)
        {
             System.out.println("Ingresar Numero "+contador);
            
             numero=lea.nextDouble();
             
              while (numero<0){
                  System.out.println("Ingresar Numero "+contador);
                   numero=lea.nextDouble();
              }
              
             par=numero%2;
                if (par==0) {
                cantidadpares=cantidadpares+1;
            }
             suma=suma+numero;
            
            if (numero==mayor) {
                mayor=numero;
                indicadormayor2+=", #"+contador;
            }
             if (numero>mayor) {
                mayor=numero;
                indicadormayor2="#"+contador;
            }
             
              if (numero==menor) {
                menor=numero;
                indicadormenor2+="#"+contador;
            }
             if (numero<menor) {
                menor=numero;
                indicadormenor2="#"+contador;
            }
              contador=contador+1;
        }
        aa="hOLAmUNDO";
        aa+="-----"+5;

        
        System.out.println("La suma de los 3 numeros es"+suma);
        System.out.println("Numero Mayor "+indicadormayor2 +" Es "+mayor);
        System.out.println("Numero menor "+indicadormenor2 +  " es "+menor);
        System.out.println("Cantidad numeros Pares "+cantidadpares);
        System.out.println(aa);
        
    
    }
    
}
