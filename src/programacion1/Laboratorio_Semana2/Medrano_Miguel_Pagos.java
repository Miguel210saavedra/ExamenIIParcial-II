
package programacion1.Laboratorio_Semana2;
import java.util.Scanner;

public class Medrano_Miguel_Pagos {
    
    public static void main(String[] args) {
        
         Scanner lea=new Scanner(System.in);
         lea.useDelimiter("\n");
         
         String NombreEmpleado,CodigoEmpleado;
         int HorasTrabajo, Categoria, HorasNormales, HorasExtras;
         double salariobase, pagoextra, TotalPagoExtra;
         
         HorasNormales=0; HorasExtras=0; pagoextra=0;
         
         
         System.out.println("Ingresar Nombre Del Empleado : ");
         NombreEmpleado=lea.next();
         
         System.out.println("\nIngresar Codigo del Empleado : ");
         CodigoEmpleado=lea.next();
         
         System.out.println("\nCantidad de Horas Trabajadas : ");
         HorasTrabajo=lea.nextInt();
         if (HorasTrabajo<0) {
             System.out.println("Valor ingresedo no permitido : ");
        }else{
         
         System.out.println("\nInformacion de Categorias :  ");
         System.out.println("Categoría 1 - $40 por hora extra \nCategoría 2 - $50 por hora extra \nCategoría 3 - $85 por hora extra \nCategoría 4 - $0");
         
         
         System.out.println("\nIngresar que Categoria desea : 1, 2 , 3 o 4");
         Categoria=lea.nextInt();
             if (Categoria<1 || Categoria>4 ) {
                 System.out.println("Valor ingresedo no permitido : ");
             }else {
                 
                 if (Categoria==1) {
                     pagoextra=40;
                 }
                 if (Categoria==2) {
                     pagoextra=50;
                 }
                  if (Categoria==3) {
                     pagoextra=85;
                 }
                 
                 if (HorasTrabajo>40) {
                     HorasNormales=40;
                     HorasExtras=HorasTrabajo-40;
                 }else{
                 HorasNormales=HorasTrabajo;
                 HorasExtras=0;
                 }
                 if (HorasExtras>15) {
                     HorasExtras=15;
                 }
                 
                 salariobase=HorasNormales*35.99;
                 TotalPagoExtra=HorasExtras*pagoextra;
                 
                 
                 
                 
                 System.out.println("\n----------------Boleta de Pago---------------");
                 System.out.println("Codigo: "+CodigoEmpleado+"\n");
                 System.out.println("Nombre Completo: "+NombreEmpleado+"\n");
                 System.out.println("Salario Base: "+salariobase+"\n");
                 System.out.println("Horas Trabajadas: "+HorasTrabajo+"\n");
                 System.out.println("Categoria: "+Categoria+"\n");
                 System.out.println("Horas extras: "+HorasExtras+"\n");
                 System.out.println("Salario Neto: "+(salariobase+TotalPagoExtra));
         
             }}}
}
