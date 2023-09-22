
package programacion1.Laoratorio_semana4;


public class Ejemplooo {
    public static void main(String[] args) {
      
 int c = 0, a=0, temp;
             int n =0,o=0;
             String amstrong="";
             
    while (o!=500){
        o=o+1;
        n=o;
        temp = n;
        c=0;
        a=0;
        
    while (n > 0) {
        a = n % 10;
        n = n / 10;
        c = c + (a * a * a);
        
       
    }
    
       if (temp == c){
              amstrong+="\n"+o;
        }     
   }

       System.out.println(amstrong);
    
    }
}
