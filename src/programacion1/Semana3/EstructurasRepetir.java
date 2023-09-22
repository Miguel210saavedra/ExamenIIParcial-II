
package programacion1.Semana3;
import java.util.Scanner;

public class EstructurasRepetir {
    
    public static void main(String[] args) {
    /*
        Estructura de Repetir
        1.- while (prueba logica){
                Bloque codigo - True
        }
        
        2.- do {
            Bloque codigo - True
        }while(prueba logica);
        
        3.- for (inicio;prueba logica; incremento/decremento/valor aritmetico){
                Bloque codigo - True
        }
        
        4.- foreach 
        for(Object id:idObject){
                Bloque codigo 
        }
        */
        //true
        int numero=0;
        int opcion=0;
        Scanner lea=new Scanner(System.in);
        
        while(opcion!=2){
            System.out.println("Menu\n 1-Recorrido hasta 5\n 2-Salir");
            System.out.println("Seleccionar una opcion: ");
            opcion=lea.nextInt();
            switch(opcion)
            {
                case 1: 
                    while (numero<5)
                    {
                        System.out.println("# "+numero);
                        numero=numero+1;
                    }
                    System.out.println("Ultimo valor del contador: #"+numero);
                    numero=0;

                break;
                case 2: 
                    System.out.println("Has salido del sistema.");
            }  
            
        }
    
    }
}
