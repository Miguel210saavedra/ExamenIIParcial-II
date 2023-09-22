
package programacion1.Semana8;

/**
 *
 * @author Miguel Medrano
 */
public class EmpleadoPorHora {
    //Atributos 
    private int codigo;
    private String nombre;
    private double horas;
    
    //Contructor 
    public EmpleadoPorHora(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        horas=0;
    }
    
    // Set & Get
    
    public void setHoras(double hora){
        this.horas=hora;
    }
    
    public double getHoras(){
        return horas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    //id.getCodigo()+100
    public double pagar(){
        if(horas>40)
            return (40*100)+((horas-40)*200);
        
        return horas*100;
        
    }
    
    public void imprimir(){
        System.out.println("--- Info. Empleado ---\n");
        System.out.println("Codigo : "+codigo);
        System.out.println("Nombre : "+nombre);
        System.out.println("Horas :"+horas);
    }
    
}
