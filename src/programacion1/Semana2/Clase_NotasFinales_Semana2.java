
package programacion1.Semana2;
import java.util.Scanner;

public class Clase_NotasFinales_Semana2 {
    
    public static void main(String[] args) {
        
        double notaFinal,pagoFinal,descuento,subtotal,totaldescuento;
        String observacion,nombreAlumno;
        
        Scanner lea=new Scanner(System.in);
         lea.useDelimiter("\n");
         
         System.out.println("Ingresar Nombre Completo");
         nombreAlumno=lea.next();
         
        System.out.println("Ingresar Nota Final");
                          notaFinal=lea.nextDouble();
                          
                          if (notaFinal>=0 && notaFinal<=100 ) {
                               
        
                          
                          observacion="Insuficiente";
                          descuento=0;
                          
                          if (notaFinal>59.5 && notaFinal<=80)  {
            
        observacion="Notable";
        descuento=0.15;
                         
        }
                           if (notaFinal>80 && notaFinal<=90) {
                                   observacion="Muy Bueno";
                                   descuento=0.25;
                              }
                              
                            if (notaFinal>90 && notaFinal<=100) {
                                   observacion="Exelenete";
                                   descuento=0.50;
                              }
                          
        System.out.println("Pago Mensual del Alumno");
        pagoFinal=lea.nextDouble();
        
        
        
        
        System.out.println("Nombre Completo Alumno: "+nombreAlumno);
         System.out.println("Nota Final del Alumno: "+notaFinal);
         System.out.println("Pago Final Del Alumno: "+pagoFinal);
         System.out.println("Observacion del Alumno: "+observacion);
         System.out.println("SubTotal del Alumno: "+(pagoFinal*3));
         System.out.println("Descuento Del Alumno: "+ (pagoFinal*descuento));
         System.out.println("Total a Pagar: "+ (pagoFinal*3-(pagoFinal*3*descuento)));
                          
        }else {
                              System.out.println("Ingrese Una nota Valida");
                          
                          }
                          
    }
}
   /* if (dia != ", 01" || dia != ", 02" || dia != "3" || dia != "4" || dia != "5" || dia != "6" ||dia != "7" ||dia != "8" ||dia != "9" ||dia != "10" ||dia != "11" ||
                    dia != "12" ||dia != "13" ||dia != "14" ||dia != "15" ||dia != "16" ||dia != "17" ||dia != "18" ||dia != "19" ||dia != "20" ||dia != "21"||dia != "22"||dia != "23"||dia != "24"||dia != "25"||dia != "26"||dia != "27"||dia != "28"||dia != "29"||dia != "30"||dia != "31" ) {
                 System.out.println("Numero Dia No posible");
            }else{ */