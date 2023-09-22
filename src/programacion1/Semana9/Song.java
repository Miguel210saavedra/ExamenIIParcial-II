package programacion1.Semana9;

public class Song {
    private String nombre;
    private int codigo,sumadeestrellasrecibidas,cantidaddereviewsrecibidos;
    private double precio,rating;

    public Song(int codigo, String nombre, double precio) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
        this.sumadeestrellasrecibidas=0;
        this.cantidaddereviewsrecibidos=0;
    }

     public String getNombre() {
        return nombre;
    }
     
    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void addStars(int cantidad) {
        if (cantidad >=0 && cantidad <6) {
            sumadeestrellasrecibidas += cantidad;
            cantidaddereviewsrecibidos++;
        }
    }

    public double songRating() {
        if (cantidaddereviewsrecibidos == 0) {
            return 0;
        }
        return sumadeestrellasrecibidas / cantidaddereviewsrecibidos;
    }

    public void print() {
        rating = songRating();
        System.out.println("Nombre:"+nombre+"\nCodigo:"+codigo+"\nPrecio L.:"+precio+"\nRating:"+ rating+"\n");
    }
    



}
