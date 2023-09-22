
package programacion1;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        
        
        
        /* 
        Tipo de datos 
        Enteros : int= 12, 45, 2 , 112342,... = 4bytes
        Enteros : long= 12, 45, 2 , 112342,... = 8bytes
        
        Decimal : double= 12.5, 34.89, 75,985,... =8bytes
        Decimal : float= 12.5, 34.89, 75,985,... =4bytes
        
        Caracter: char =  = 1bytes
        
        Logico : boolean = True, False = 1 Bytes
        
        Tipo de texo : String = "Haysi653-" = ? Bytes 
        
        */
        
        //Valor constatnte 
        
        String nombreAlumno="Miguel"; 
        int numeroCuenta=22311127; 
        double notaFinal1=78.5;
         double notaFinal2=88.5;
          double notaFinal3=56.5;
          
          double nota1, nota2, nota3, promedio=0; 
          
          nota1=78;
                  nota2=80;
                          nota3=90;
                          double sumaNota= (notaFinal1+notaFinal2+notaFinal3);
                          promedio=sumaNota/3;
                          
                          /* 
                          Cracteres de escape o especiales 
                          Formato: 
                          
                          */
                          
                          //Datos de Teclado
                          //Scanner
                          //Instanciar 
                          
                          Scanner lea=new Scanner(System.in);
                          /* 
                          Tipos de lecturas de scanner 
                          1. int - lea.nextInt()
                          2. double - lea.nextDouble
                          3. String - lea.next()
                                      lea.nextline()
                          */
                          
                           System.out.println("Ingresar Nombre Alumno");
                          nombreAlumno=lea.nextLine();
                          
                          char letra=nombreAlumno.charAt(2);
        
                 System.out.println("Suma De notas: "+ sumaNota + "   " + promedio); 
        System.out.println("Promedio de las Notas: "+ (sumaNota/3));
        System.out.println(nombreAlumno+"  Letra: "+letra);
        System.out.println("Tmaño  :"+nombreAlumno.length());
        
        if (promedio>70) {
            System.out.println(nombreAlumno+ " Aprobo la clase! ");

        }
    }
           
           
}
