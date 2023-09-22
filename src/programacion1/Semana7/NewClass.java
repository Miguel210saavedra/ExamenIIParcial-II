
package programacion1.Semana7;
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        lea.useDelimiter("\n");
        
        String palabra[];
        palabra=new String[5]; 
        String palabras;
        String Cadena="";
        int numero=0;
        int suma=0;

        for (int i = 0; i < palabra.length; i++) {
             System.out.println("Ingresar Una Palabra : "+i);
              palabra[i]=palabras=lea.next().toLowerCase();
              numero=palabras.length();
               for (int j = 0; j < palabras.length(); j++) {
                char Letra=palabras.charAt(j);
                
                   if (Letra=='a' ||Letra=='e'||Letra=='i'||Letra=='o'||Letra=='u' ) {
                       suma=suma+1;
                   }
            }
               
              
        Cadena+="Palabra["+i+"]:"+palabra[i]+" Cant. letras:"+numero+" Vocales: "+suma+"\n";
        
        suma=0;
        }
        System.out.println(Cadena);
        
        
        /*AREGGLOS BIDIMENSIONALES 
        
        -> Filas Y columnas 
        
        TipoDatos IDArriglo [][]= new TiopoDato [Row][Column]
        
        */
        
        
        
    }
}
