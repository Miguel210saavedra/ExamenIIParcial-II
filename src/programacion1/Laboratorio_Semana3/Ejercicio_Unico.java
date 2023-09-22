
package programacion1.Laboratorio_Semana3;
import java.util.Scanner;


public class Ejercicio_Unico {
    
    public static void main(String[] args) {
        
         Scanner lea=new Scanner(System.in);
          lea.useDelimiter("\n");
          
          String NombreCliente, Canal,pedidocanal,CajaDigital,cajapuesta, respueta;
          int HD,NORMAL,LIGHTBOX,HDBOX,DVRBOX;
          double pagocajaNormal, pagocajaHD,pagocaja, subtotal, impuesto,total;
         respueta="si";
         while (respueta.equals("si")){
          pagocaja=0;
          cajapuesta="";
          HD=0; NORMAL=0; LIGHTBOX=0; HDBOX=0; DVRBOX=0;
          CajaDigital="";
          Canal="";
          pedidocanal="si";
          
          System.out.println("Ingresar Nombre Cliente :");
          NombreCliente=lea.next();
          
           while (pedidocanal.equals("si")){
                 System.out.println("\n Tipo de Canal :");
                 System.out.println("1. HD \n2. NORMAL");
          Canal=lea.next().toUpperCase();
          
        while (true) {
    if(Canal.equals("HD")|| Canal.equals("NORMAL")) {
        break;
    } else {
        System.out.println("Ingresar un canal valido");
        Canal=lea.next().toUpperCase();
    }
}
        

               if (Canal.equals("HD")) {
                   HD=HD+1;
               }else{
                   NORMAL=NORMAL+1;
               }
               
                  System.out.println("\nDesea Agregar Otro Canal? \n-Si \n-No");
               pedidocanal=lea.next().toLowerCase();
              
                while (true){
              if (pedidocanal.equals("si") || pedidocanal.equals("no")) {
                   break;
               }else{
                   System.out.println("Ingrese Respuesta Valisa");
                   pedidocanal=lea.next().toLowerCase();
               }
            }}
           
      
               System.out.println("\nIngrese Tipo de Caja Digital :");
                System.out.println("1. LIGHTBOX \n2. HDBOX \n3. DVRBOX");
               CajaDigital=lea.next().toUpperCase();
               
               
                     while (true) {
    if(CajaDigital.equals("LIGHTBOX")|| CajaDigital.equals("HDBOX") || CajaDigital.equals("DVRBOX")  ) {
        break;
    } else {
        System.out.println("Ingresar un canal valido");
        CajaDigital=lea.next().toUpperCase();
    }
}
       if (CajaDigital.equals("LIGHTBOX")) {
                   LIGHTBOX=LIGHTBOX+1;
               }  
       if (CajaDigital.equals("HDBOX")) {
                   HDBOX=HDBOX+1;
               }    
       if (CajaDigital.equals("DVRBOX")) {
                   DVRBOX=DVRBOX+1;
               }    
         pagocajaNormal=NORMAL*20;
         pagocajaHD=HD*30;
     
         
         if (LIGHTBOX==1) {
            cajapuesta="LIGHTBOX";
            pagocaja=50;
        }
         if (HDBOX==1) {
            cajapuesta="HDBOX";
            pagocaja=100;
        }
           if (DVRBOX==1) {
            cajapuesta="DVRBOX";
            pagocaja=150;
        }
         
        subtotal=pagocajaNormal+ pagocajaHD+  pagocaja;
        impuesto=subtotal*0.15;
        total=subtotal+impuesto;
         
        System.out.println("\n-------Factura Impresa------------");
        System.out.println("Nombre Cliente :"+NombreCliente);
        System.out.println("Canales Normales "+NORMAL+": L."+pagocajaNormal);
        System.out.println("Canales HD "+HD+": L."+pagocajaHD);
        System.out.println("Caja Puesta "+cajapuesta+" : L."+pagocaja);
        System.out.println("Impusto : L."+impuesto);
        System.out.println("Total a Pagar : L."+ total);
        System.out.println("-----------------------------------");
        
        System.out.println("\nDesea realizar otra Factura? \n-si \n-no ");  
        respueta=lea.next().toLowerCase();
        
         while (true) {
         if (respueta.equals("si") || respueta.equals("no")) {
                   break;
               }else{
                   System.out.println("\nIngrese Respuesta Valisa");
                   respueta=lea.next().toLowerCase();
               }
         }
          
         }
    }
}
