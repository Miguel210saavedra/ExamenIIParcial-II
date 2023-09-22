 
package Proyecto_PrimerParcial;
import java.util.Scanner;

public class Medrano_Miguel_ProyectoTienda {
    
    public static void main(String[] args) {
         Scanner lea= new Scanner (System.in);
         lea.useDelimiter("\n");
         
         //Habilitador
         boolean cajahabilitada=false;
         //Variables para Codigos y funciones
         int funcionmenu=1, CodigoProducto=0, PrecioProducto=0;
         //Variables Para las cuentas
         double descuento=0, isv=0.7, subtotal=0, depositar=0;
         //Variables para los caracteres de Nombres
         String TipoCliente, TipoProveedor, NombreProducto="", respuesta="SI", factura="", porcDescuento="", ProductoGanador="" ;
         //Contadores
         double EfectivoCaja=0 , KilosDeseados=0, KilosMaiz=0, KilosTrigo=0, KilosAzucar=0, KilosAvena=0, TotalCompra=0,contadorcaja=1, ContadorVentaMayor=0, ContadorCompraMayor=0, ContadorTotalVentas=0, ContadorTotalCompras=0, MargenGanancia=0;
         double ContadorAvenaVenta=0, ContadorAzucarVenta=0, ContadorTrigoVenta=0, ContadorMaizVenta=0;
         int ContadorCompras=0, ContadorVentas=0;
         
         do {
         //Le damos salida de pantalla a lo que es el diseño del sistema.
         System.out.println("\n|----------Sistema de Caja Productos Medrano----------|");
         System.out.println("|1. Abrir Caja.                                       |");
         System.out.println("|2. Ventas.                                           |");
         System.out.println("|3. Compras.                                          |");
         System.out.println("|4. REPORTES.                                         |");
         System.out.println("|5. Cierre de caja.                                   |");
         System.out.println("|6. Salir del Sistema.                                |");
         System.out.println("|-----------------------------------------------------|");
         
         System.out.println("\nQue funcion desea realizar?");
         funcionmenu=lea.nextInt();
         
         // Mientras la respuesta en el menu sea 1,2,3,4,5 o 6 se realizara las siguientes funciones depende la seleccion.
         
         //Si  la seleccion es 1 se pedira ingresar cantidad de dinero y habilitara las otras funciones.
             if (funcionmenu==1) {
                 System.out.println("\n|----------------------------------------Apertura de Cja----------------------------------------|");
                cajahabilitada=true;
                 System.out.println("\nCantidad de efectivo actual dentro de la caja :"+EfectivoCaja);
                 contadorcaja=contadorcaja+1;
                 if (contadorcaja>1) {
                       System.out.println("\nCantidad de efectivo que desea guardar en la caja? ");
                 EfectivoCaja=EfectivoCaja+lea.nextDouble();
                 }
                 System.out.println("\n|-----------------------------------------------------------------------------------------------|");
                         
     
             }
             
             
             //Podra comprar productos adquiridos siempre y cuando cumplan con las restricciones. 
             if (funcionmenu==2) {
                 if (!cajahabilitada) {
                    System.out.println("La caja esta cerrada"); 
                 }else{
                     System.out.println("\n--------------------------------------------------------Venta--------------------------------------------------------");
                     if (KilosMaiz>0 || KilosTrigo>0 || KilosAvena>0|| KilosAzucar>0 ) {
 
                     System.out.println("\n---------------------------------------------------------------------------");
                     System.out.println("Codigo-1    |    Azucar     |    L.30  | Displonible para Clientes : A Y B");
                     System.out.println("Codigo-2    |    Avena      |    L.25  | Displonible para Clientes : A Y B");
                     System.out.println("Codigo-3    |    Trigo      |    L.32  | Displonible para Clientes : A Y B");
                     System.out.println("Codigo-4    |    Maiz       |    L.20  | Displonible para Clientes : A Y C");
                     System.out.println("---------------------------------------------------------------------------");
                     
                      System.out.println("\nIngresar tipo de cliente (A, B y C) :");
                      TipoCliente=lea.next().toUpperCase();
                      while (!TipoCliente.equals("A") &&!TipoCliente.equals("B") &&!TipoCliente.equals("C")) {
                          System.out.println("Ingresar un tipo de cliente valido");
                          TipoCliente=lea.next().toUpperCase();
                     }
                         if (TipoCliente.equals("A")) {
                             System.out.println("\nProductos Disponibles : \n1-Azucar \n2-Avena \n3-Trigo \n4-Maiz");
                         }
                         
                         if (TipoCliente.equals("B")) {
                             System.out.println("\nProductos Disponibles : \n1-Azucar \n2-Avena \n3-Trigo");
                         }
                         
                         if (TipoCliente.equals("C")) {
                             System.out.println("\nProductos Disponibles : \n4-Maiz");
                         }
                         
                      while (respuesta.equals("SI")){
                          
                      
                      System.out.println("\nIngresar Codigo del Producto :");
                      
                      CodigoProducto=lea.nextInt();
                      
                      while (CodigoProducto<1 || CodigoProducto>4 ) {
                          System.out.println("Ingresar un codigo de producto valido!");
                          CodigoProducto=lea.nextInt();
                     }
    
                     //Si el codigo no cumple con dichas restricciones no permitira avanzar.
                   
                      if (TipoCliente.equals("C") && (CodigoProducto==1 || CodigoProducto==2 || CodigoProducto==3) ) {
                          
                          System.out.println("\nNo puede comprar este producto");
                          System.out.println("Ingrese Un Producto Valido");
                          CodigoProducto=lea.nextInt();
                           while (CodigoProducto!=4 ) {
                          System.out.println("Ingresar un codigo de producto valido!");
                          CodigoProducto=lea.nextInt();
                     }
                          
                     }
                      if (TipoCliente.equals("B") && CodigoProducto==4) {
                          System.out.println("\nNo puede comprar este producto");
                          System.out.println("Ingrese Un Producto Valido");
                          CodigoProducto=lea.nextInt();
                           while (CodigoProducto<0 || CodigoProducto>=4  ) {
                          System.out.println("Ingresar un codigo de producto valido!");
                          CodigoProducto=lea.nextInt();
                          }
                     }
                      
                      
                      
                       
                      
                      if (CodigoProducto==1 ) {
                          System.out.println("\nProducto: Azucar \nPrecio: L.30");
                          System.out.println("\nCantidad de Producto que desea ingresar? : ");
                          KilosDeseados=lea.nextDouble();
                          while (KilosDeseados<1){
                              System.out.println("\nIngresar Un valor Positivo");
                              KilosDeseados=lea.nextDouble();
                          }
                          if (KilosDeseados<=KilosAzucar) {
                              ContadorAzucarVenta=ContadorAvenaVenta+KilosDeseados;
                              KilosAzucar=KilosAzucar-KilosDeseados;
                               NombreProducto="Azucar";
                           subtotal=subtotal+(KilosDeseados*30);
                           
                        //Es una cadena de caracteres para almasenar los datos de dicha compra      
                       factura += "Producto:        " + NombreProducto + " / Precio: L.30"  
                    + " / Cantidad: " + KilosDeseados +"\n"; 
                       
                       System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }else{
                              System.out.println("\nError no hay suficiente Producto en Stock");
                              System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }
                                 
                     }
                      
                      
                       if (CodigoProducto==2) {                         
                           System.out.println("Producto: Avena \nPrecio: L.25");
                               System.out.println("\nCantidad de Producto que desea ingresar? : ");
                          KilosDeseados=lea.nextDouble();
                          while (KilosDeseados<1){
                              System.out.println("\nIngresar Un valor Positivo");
                              KilosDeseados=lea.nextDouble();
                          }
                          if (KilosDeseados<=KilosAvena) {
                              ContadorAvenaVenta=ContadorAvenaVenta+KilosDeseados;
                              KilosAvena=KilosAvena-KilosDeseados;
                               NombreProducto="Avena";
                           subtotal=subtotal+(KilosDeseados*25);
                         
                       //Es una cadena de caracteres para almasenar los datos de dicha compra    
                       factura += "Producto:        " + NombreProducto + " / Precio: L.25"  
                    + " / Cantidad: " + KilosDeseados +"\n"; 
                       
                       System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }else{
                              System.out.println("\nError no hay suficiente Producto en Stock");
                              System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }
                     }
                       
                            if (CodigoProducto==3) {                         
                           System.out.println("Producto: Trigo \nPrecio: L.32");
                               System.out.println("\nCantidad de Producto que desea ingresar? : ");
                          KilosDeseados=lea.nextDouble();
                          while (KilosDeseados<1){
                              System.out.println("\nIngresar Un valor Positivo");
                              KilosDeseados=lea.nextDouble();
                          }
                          if (KilosDeseados<=KilosTrigo) {
                              ContadorTrigoVenta=ContadorTrigoVenta+KilosDeseados;
                              KilosTrigo=KilosTrigo-KilosDeseados;
                               NombreProducto="Trigo";
                           subtotal=subtotal+(KilosDeseados*32);
                           
                    //Es una cadena de caracteres para almasenar los datos de dicha compra        
                       factura += "Producto:        " + NombreProducto + " / Precio: L.32"  
                    + " / Cantidad: " + KilosDeseados +"\n"; 
                       
                       System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }else{
                              System.out.println("\nError no hay suficiente Producto en Stock");
                              System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }
                     }
                       
                         if (CodigoProducto==4) {
                             System.out.println("Producto: Maiz \nPrecio: 20");
                                   System.out.println("\nCantidad de Producto que desea ingresar? : ");
                          KilosDeseados=lea.nextDouble();
                          while (KilosDeseados<1){
                              System.out.println("\nIngresar Un valor Positivo");
                              KilosDeseados=lea.nextDouble();
                          }if (KilosDeseados<=KilosMaiz) {
                               ContadorMaizVenta=ContadorMaizVenta+KilosDeseados;
                              KilosMaiz=KilosMaiz-KilosDeseados;
                               NombreProducto="Maiz";
                           subtotal=subtotal+(KilosDeseados*20);
                      
                     //Es una cadena de caracteres para almasenar los datos de dicha compra   
                       factura += "Producto:        "+ NombreProducto + " / Precio: L.20"  
                    + " / Cantidad: " + KilosDeseados +"\n"; 
                       
                       System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }else{
                              System.out.println("\nError no hay suficiente Producto en Stock");
                              System.out.println("\nDesea Agregar otro producto? :");
                         respuesta=lea.next().toUpperCase();
                          while (!respuesta.equals("SI") && !respuesta.equals("NO") ){
                              System.out.println("\nIngrsar \"Si\" o \"No\"");
                               respuesta=lea.next().toUpperCase();
                          }
                          }
                      
                      }
                      if (subtotal>=1000 && subtotal<=5000){
                descuento=subtotal*0.05;
                porcDescuento="5%";
            }
            if (subtotal>5000){
                descuento=subtotal*0.1;
                porcDescuento="10%";
            }
            if (subtotal<1000){
                descuento=subtotal*0;
                porcDescuento="No aplica Descuento.";
            }
            isv=subtotal*0.07;
                      }
                      
                      //Si el clinete no comprara (Nos guiamos del subtotal) noda no sera necesaria imprimir una factura.
                      if (subtotal>0) {
            System.out.println("\n------------------------Factura------------------------");       
            System.out.print(factura);
            System.out.println("Subtotal:        "+subtotal);
            System.out.println("Descuento:       "+porcDescuento+" "+descuento);
            System.out.println("Impuesto:        "+isv);
            System.out.println("Total a Pagar:   "+((subtotal+isv)-descuento));
            System.out.println("-------------------------------------------------------");
                     }
            ContadorTotalVentas=ContadorTotalVentas+(((subtotal+isv)-descuento));
                     if (((subtotal+isv)-descuento)>ContadorVentaMayor) {
                         ContadorVentaMayor=ContadorVentaMayor-ContadorVentaMayor+((subtotal+isv)-descuento);
                         
                     }
            //Adjuntamos valores nuevos y reiniciamos los necesario.
            EfectivoCaja=EfectivoCaja+((subtotal+isv)-descuento); subtotal=0; descuento=0;  isv=0;  isv=0; respuesta="SI"; factura="";   
            ContadorVentas=ContadorVentas+1;
                     }else{
                         //Restriccion si no contamos con productos actualmente.
                         System.out.println("Error necesita realizar una compra!");
                     }
                     System.out.println("\n---------------------------------------------------------------------------------------------------------------------");
                      }
                 }
         
         //Habilita el apartado de compra para almacenar nuevos productos.    
          if (funcionmenu==3) {
                 if (!cajahabilitada) {
                    System.out.println("La caja esta cerrada"); 
                 }else{
                     
                      System.out.println("\n-------------------------------Compra--------------------------------|");
                      System.out.println("\n-----------------------------------------------------------------");
                      System.out.println("Proveedor A:  Productos Codigo 1-Azucar L.25 --- 4-Maiz L.18");
                      System.out.println("Proveedor B:  Productos Codigo 2-Avena  L.20 --- 3-Trigo L30");
                      System.out.println("Proveedor C:  Productos Codigo 2-Avena  L.22 ");
                      System.out.println("-----------------------------------------------------------------");
                      System.out.println("\nIngresar Tipo de Proveedor :");
                      TipoProveedor=lea.next().toUpperCase();
                      
                      //Restriccion por si no cumple con los tipos de proveedores disponibles.
                      while (!TipoProveedor.equals("A") && !TipoProveedor.equals("B") && !TipoProveedor.equals("C")){
                          System.out.println("Ingrese un Proveedor Valido");
                           TipoProveedor=lea.next().toUpperCase();
                      }
                      
                      System.out.println("Ingresar Codigo del Producto :");
                      CodigoProducto=lea.nextInt();
                      while (CodigoProducto<1 || CodigoProducto>4){
                          System.out.println("Ingresar un Codigo de Producto Valido ");
                         CodigoProducto=lea.nextInt();
                      }
                      if (TipoProveedor.equals("A")){
                          while(CodigoProducto!=1 && CodigoProducto!=4 ){
                              System.out.println("Error: Elija un producto en base a su tipo de Proveedor");
                              CodigoProducto=lea.nextInt();
                          }
                      }
                      
                       if (TipoProveedor.equals("B")){
                          while(CodigoProducto!=2 && CodigoProducto!=3 ){
                              System.out.println("Error: Elija un producto en base a su tipo de Proveedor");
                              CodigoProducto=lea.nextInt();
                          }
                      }
                        if (TipoProveedor.equals("C")){
                          while(CodigoProducto!=2 ){
                              System.out.println("Error: Elija un producto en base a su tipo de Proveedor");
                              CodigoProducto=lea.nextInt();
                          }
                      }
                      
                        //Adjuntamos un nombre al producto dependiendo el codigo ingresado
                      if (CodigoProducto==1) {
                         NombreProducto="Azucar";
                         PrecioProducto=25;
                     }
                      if (CodigoProducto==2) {
                          NombreProducto="Avena";
                     }
                      if (CodigoProducto==3) {
                        NombreProducto="Trigo"; 
                         PrecioProducto=30;
                     }
                       if (CodigoProducto==4) {
                        NombreProducto="Maiz"; 
                         PrecioProducto=18;
                     } 
                       
                       //Como son distintos precios se realisa condicionales para adjuntar un precio correcto.
                       if (CodigoProducto==2 && TipoProveedor.equals("B") ) {
                         PrecioProducto=20;
                     }
                       
                      if (CodigoProducto==2 && TipoProveedor.equals("C") ) {
                         PrecioProducto=22;
                     }
                      
                      System.out.println("Ingresar Cantidad de Kilogramos ");
                      KilosDeseados=lea.nextDouble();
                      while (KilosDeseados<1) {
                          System.out.println("Ingresar un valor positivo!");
                          KilosDeseados=lea.nextDouble();
                     }
                      
                     
                      TotalCompra=KilosDeseados*PrecioProducto;
                      //Permite la compra y suma de valores si contamos con el efectivo necesario de lo contrario mostara error.
                      if (TotalCompra<=EfectivoCaja) {
                                
                      System.out.println("\n------Factura Compra------");
                      System.out.println("Producto : "+NombreProducto);
                      System.out.println("Precio : "+PrecioProducto);
                      System.out.println("Cantidad Kilos : "+KilosDeseados);
                      System.out.println("Total : "+TotalCompra);
                      System.out.println("---------------------------");
                       ContadorTotalCompras=ContadorTotalCompras+TotalCompra;
                       
                       
                      if (CodigoProducto==1) {
                         KilosAzucar=KilosAzucar+KilosDeseados;
                     }
                        if (CodigoProducto==2) {
                         KilosAvena=KilosAvena+KilosDeseados;
                     }
                          if (CodigoProducto==3) {
                         KilosTrigo=KilosTrigo+KilosDeseados;
                     }
                            if (CodigoProducto==4) {
                         KilosMaiz=KilosMaiz+KilosDeseados;
                            }
                      
                          if (ContadorCompraMayor<TotalCompra) {
                              ContadorCompraMayor=ContadorCompraMayor-ContadorCompraMayor+TotalCompra;
                          }
                      EfectivoCaja=EfectivoCaja-TotalCompra; ContadorCompras=ContadorCompras+1;
                     }else{
                          System.out.println("Error! Fondos insuficientes para la compra "); 
                      }
                  System.out.println("\n---------------------------------------------------------------------|");    
                 }
                 
             }
              
          //Muestra reportes necesarios guiandoce por los contadores puestos entre otras variables.
          if (funcionmenu==4) {
                 if (!cajahabilitada) {
                    System.out.println("La caja esta cerrada"); 
                 }else{
                     
                     if(ContadorMaizVenta>ContadorTrigoVenta && ContadorMaizVenta>ContadorAvenaVenta && ContadorMaizVenta>ContadorAzucarVenta){
                        ProductoGanador="Maiz";}
                    if(ContadorTrigoVenta>ContadorMaizVenta && ContadorTrigoVenta>ContadorAzucarVenta && ContadorTrigoVenta>ContadorAvenaVenta){
                        ProductoGanador="Trigo";}
                    if (ContadorAvenaVenta>ContadorTrigoVenta && ContadorAvenaVenta>ContadorMaizVenta && ContadorAvenaVenta>ContadorAzucarVenta){
                        ProductoGanador="Avena";}
                    if(ContadorAzucarVenta>ContadorAvenaVenta && ContadorAzucarVenta>ContadorTrigoVenta && ContadorAzucarVenta>ContadorMaizVenta){
                        ProductoGanador="Azucar";}
                     
                     System.out.println("\n----------------------------------------Reportes--------------------------------------|");
                     System.out.println("\n--------------------------------------------------------------------------------");
                     System.out.println("A) Cantidad Actual en Caja : "+EfectivoCaja);
                     System.out.println("--------------------------------------------------------------------------------");
                      System.out.println("\n--------------------------------------------------------------------------------");
                     System.out.println("B) Numero de Compras y Ventas realizadas en el dia : ");
                     System.out.println("Compras : "+ContadorCompras+" Ventas : "+ContadorVentas);
                      System.out.println("--------------------------------------------------------------------------------");
                       System.out.println("\n--------------------------------------------------------------------------------");
                     System.out.println("C) Volumen total de Compras y Ventas: ");
                     System.out.println("Volumen Ventas :"+ContadorTotalVentas+" Volumen Compra :"+ContadorTotalCompras);
                     System.out.println("Marge de Ganancias Obtenidas : "+(ContadorTotalVentas-((ContadorMaizVenta*18)+(ContadorTrigoVenta*30)+(ContadorAzucarVenta*25)+(ContadorAvenaVenta*22)))+" Lps");
                     System.out.println("--------------------------------------------------------------------------------");
                      System.out.println("\n--------------------------------------------------------------------------------");
                     System.out.println("D) Valor Medio de Compra y Venta (PROMEDIO) :");
                     System.out.println("Promedio Compra : "+(ContadorTotalCompras/ContadorCompras)+" Promedio Ventas : "+(ContadorTotalVentas/ContadorVentas));
                      System.out.println("--------------------------------------------------------------------------------");
                       System.out.println("\n--------------------------------------------------------------------------------");
                     System.out.println("E) La venta con mayor ganancia realizada y la compra con mas gasto efectuada : ");
                     System.out.println("Venta : "+ContadorVentaMayor+ " Compra : "+ContadorCompraMayor);
                      System.out.println("--------------------------------------------------------------------------------");
                       System.out.println("\n--------------------------------------------------------------------------------");
                     System.out.println("F) Producto Estrella. Producto que mas se vendio en el dia : "+ProductoGanador);
                      System.out.println("--------------------------------------------------------------------------------");
                      System.out.println("\n--------------------------------------------------------------------------------------|");
  
                 }
             }
         
             //Cierre de caja permite depositar hasta un 60% de el efectivo en caja, de lo contrario pedira hasta que sea correcto.
             //Reinicia los contadores y el habilitar caja para que vuelva a empezar un nuevo dia menos el efectivo restante.
              if (funcionmenu==5) {
                  System.out.println("------------------------------Cierre de Caja------------------------------|");
                 if (!cajahabilitada) {
                    System.out.println("La caja esta cerrada"); 
                 }else{
                     System.out.println("\nActualmente el total de dinero en caja es de : "+EfectivoCaja);
                     if (EfectivoCaja>0) {
                       System.out.println("\nCantidad de dinero deseado a depositar : ");
                     depositar=lea.nextDouble();
                     while  (depositar<0){
                         System.out.println("\nError! Ingresar un valor positivo : ");
                         depositar=lea.nextDouble();  
                     }
                     while (depositar>EfectivoCaja*0.6){
                         System.out.println("\nError! Se permite hasta un 60% del Efectivo en Caja, Ingrese Nuevamnete :");
                         depositar=lea.nextDouble();
                         }
                     }
                     
                    
                     System.out.println("\nDinero Depositado : "+depositar);
                     EfectivoCaja=EfectivoCaja-depositar;
                     System.out.println("Dinero Restante en Caja : "+EfectivoCaja);
                     
         cajahabilitada=false;
         funcionmenu=1; CodigoProducto=0; PrecioProducto=0;
         descuento=0; isv=0.7; subtotal=0; depositar=0;
         NombreProducto=""; respuesta="SI"; factura=""; porcDescuento=""; ProductoGanador="" ;
         KilosDeseados=0;  contadorcaja=0; ContadorVentaMayor=0; ContadorCompraMayor=0; ContadorTotalVentas=0; ContadorTotalCompras=0; MargenGanancia=0;
         ContadorAvenaVenta=0; ContadorAzucarVenta=0; ContadorTrigoVenta=0; ContadorMaizVenta=0;
         ContadorCompras=0; ContadorVentas=0;
                 }
                  System.out.println("\n--------------------------------------------------------------------------|");
             }
         
         
       } while (funcionmenu != 6);   
    }
         }