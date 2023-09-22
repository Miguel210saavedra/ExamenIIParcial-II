public class Song {
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int cantidadReviews;

    public Song(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.sumaEstrellas = 0;
        this.cantidadReviews = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void addStars(int stars) {
        if (stars >= 0 && stars <= 5) {
            sumaEstrellas += stars;
            cantidadReviews++;
        }
    }

    public double songRating() {
        if (cantidadReviews == 0) {
            return 0;
        }
        return (double) sumaEstrellas / cantidadReviews;
    }

    public void print() {
        double rating = songRating();
        System.out.printf("%d - %s - %.2f - %.2f\n", codigo, nombre, precio, rating);
    }

    public static void main(String[] args) {
        Song song1 = new Song(1, "Canción 1", 10.0);
        song1.addStars(4);
        song1.addStars(5);
        song1.addStars(3);
        song1.print();
    }
}

