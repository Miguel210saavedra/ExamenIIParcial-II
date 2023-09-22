
package programacion1.Semana8;

/**
 *
 * @author MIugel Medrano
 */
public class Empresa {
    // Atributos 
    private String nombreEmpresa;
    private int contar=0;
    private EmpleadoPorHora empleados[];
    
    //Contructor 
    public Empresa(String name, int max){
        nombreEmpresa=name;
        empleados=new EmpleadoPorHora[max];
    }
    
    public void setNombreEmpresa(String name){
        this.nombreEmpresa=name;
    }
    public String getNombreEmpresa(){
        return nombreEmpresa;
    }
    
    public EmpleadoPorHora buscar(int code){
        for(EmpleadoPorHora emp:empleados){
            if (emp!=null && emp.getCodigo()==code) {
                return emp;
            }           
        }
         return null;
    }
    
    public boolean agregar1(int code, String name){
        if(buscar(code)==null){
            for (int i = 0; i < empleados.length; i++) {
                if (empleados[i]==null) {
                    empleados[i]=new EmpleadoPorHora(code,name);
                    return true;
                    
                }
            }
        }
        return false;
    }
    
    public void listar(){
        for(EmpleadoPorHora emp:empleados){
            if(emp!=null)
                emp.imprimir();
        }
    }
    
    public double pagar (int code){
        EmpleadoPorHora emp=buscar(code);
        if(emp!=null)
            return emp.pagar();
        return 0;
    }
    //Asignar Horas y el Menu
}
