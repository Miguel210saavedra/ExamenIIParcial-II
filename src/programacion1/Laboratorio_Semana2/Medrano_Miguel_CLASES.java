
package programacion1.Laboratorio_Semana2;
import java.util.Scanner;

public class Medrano_Miguel_CLASES {
    
    public static void main(String[] args) {
        
        
        
         Scanner lea=new Scanner(System.in);
         lea.useDelimiter("\n");
         String fecha, dia, mes, nombredia;
         double porcentaje;
       int fin ,fin2;
       
       
               
         System.out.println("Ingrese la fecha: ");
         fecha=lea.next().toLowerCase();
         
         fin = fecha.indexOf(",");
         fin2 = fecha.indexOf("/");
       
         nombredia=fecha.substring(0, fin);
         dia=fecha.substring(fin , fin2);
         mes=fecha.substring(fin2);
        
     
        if (nombredia.equals("lunes") || nombredia.equals("martes") || nombredia.equals("miercoles") || nombredia.equals("jueves") || nombredia.equals("viernes") ) {
           
      
         
         if (dia.equals(", 01") || dia.equals(", 02") || dia.equals(", 03") || dia.equals(", 04") ||
                    dia.equals(", 05") || dia.equals(", 06") || dia.equals(", 07") || dia.equals(", 08") ||
                    dia.equals(", 09") || dia.equals(", 10") || dia.equals(", 11") || dia.equals(", 12") ||
                    dia.equals(", 13") || dia.equals(", 14") || dia.equals(", 15") || dia.equals(", 16") ||
                    dia.equals(", 17") || dia.equals(", 18") || dia.equals(", 19") || dia.equals(", 20") || dia.equals(", 21") ||
                    dia.equals(", 22") || dia.equals(", 23") || dia.equals(", 24") || dia.equals(", 25") || dia.equals(", 26") ||
                    dia.equals(", 27") || dia.equals(", 28") || dia.equals(", 29") || dia.equals(", 30") ||
                    dia.equals(", 31") ) {
             
             if (mes.equals("/01") || mes.equals("/02") || mes.equals("/03") || mes.equals("/04") ||
                    mes.equals("/05") || mes.equals("/06") || mes.equals("/07") || mes.equals("/08") ||
                    mes.equals("/09") || mes.equals("/10") || mes.equals("/11") || mes.equals("/12")) {
               
                 
                 if (nombredia.equals("lunes") || nombredia.equals("martes") || nombredia.equals("miercoles")) {
             System.out.println("¿Se tomaron exámenes hoy?");
             String respuesta=lea.next();
             
             if (respuesta.equals("si")) {
                 System.out.println("¿Cuántos alumnos aprobaron?");
                 int aprobados=lea.nextInt();
                 System.out.println("¿Cuántos alumnos reprobaron?");
                 int reprobados=lea.nextInt();
                 
                 int porcAprobados, porcReprobados;
                 
                 porcAprobados=(aprobados*100)/(aprobados+reprobados);
                 porcReprobados=(reprobados*100)/(aprobados+reprobados);
                 
                 System.out.println("Aprobó el "+porcAprobados+"%, y reprobó el "+porcReprobados+"%");
             }
         }
                 
                 
                 
                 if (nombredia.equals("jueves") ) {
                     
                     System.out.println("Porcentaje de asistencia a Clases? :  ");
                       porcentaje=lea.nextDouble();
                       
                     if (porcentaje>50) {
                         System.out.println("Asistio La mayoria De la clase");
                     }else{
                         System.out.println("No asistio la Mayoria");
                     } 
                 }
         
        if (nombredia.equals("viernes") && dia.equals(", 01") && mes.equals("/01") || mes.equals("/07"))
         {
             System.out.println("Comienzo de nuevo ciclo");
             System.out.println("Ingrese la cantidad de nuevos alumnos: ");
             int cantAlumnos=lea.nextInt();
             System.out.println("Ingrese el arancel por cada alumno: ");
             double arancel=lea.nextDouble();
             
             double totalIngreso=cantAlumnos*arancel;
             
             System.out.println("\nEl ingreso total del ciclo es: $"+totalIngreso);
         }         
       
      
                 
}else{
System.out.println("Mes no posible"); 
}
}else{
System.out.println("Dia no posible"); 
}
}else{ 
System.out.println("Nombre Dia no posible");  

  }
    }
}
