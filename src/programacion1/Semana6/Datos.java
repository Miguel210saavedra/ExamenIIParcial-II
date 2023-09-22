
package programacion1.Semana6;

public class Datos {
    
    public Datos(){
        
    }
    
    private String ID;
    private String Nombre;
    private String Edad;
    private String Direccion;
    private String Telefono;
    private String Username;
    private String Contra;


    public void registro1 (String id, String nombre, String edad, String direccion, 
            String telefono, String usuario, String contra ) {
        ID = id;
        Nombre = nombre;
        Edad = edad;
        Direccion = direccion;
        Telefono = telefono;
        Username = usuario;
        Contra = contra;
    }

    
    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getUsername() {
        return Username;
    }

    public String getContra() {
        return Contra;
    }
}
