
package programacion1.Semana6;

public class Alumno {
    //Atributos
    private int cuenta=2231137;
     String nombre;
    private double pagoMensual;
    
    public Alumno(int code,String name){
        cuenta=code;
        nombre=name;
        pagoMensual=0;
        
    }
    
    public int getCuenta(){
        return cuenta;
    }
    
    public void setCuenta(int cuenta){
        this.cuenta=cuenta;
    }
    
}
