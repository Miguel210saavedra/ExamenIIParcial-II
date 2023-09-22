public class Clase2 {
    private Song[] songs;

    public Clase2(int length) {
        songs = new Song[length];
    }

    public boolean addSong(int codigo, String nombre, double precio) {
        if (isCodigoUnique(codigo)) {
            int index = findNullPosition();
            if (index != -1) {
                songs[index] = new Song(codigo, nombre, precio);
                return true;
            }
        }
        return false;
    }

    public Song searchSong(int codigo) {
        for (Song song : songs) {
            if (song != null && song.getCodigo() == codigo) {
                return song;
            }
        }
        return null;
    }

    public void rateSong(int codigo, int stars) {
        Song song = searchSong(codigo);
        if (song != null) {
            song.addStars(stars);
            song.print();
        } else {
            System.out.println("La canción con código " + codigo + " no existe.");
        }
    }

    public void printSongs() {
        for (Song song : songs) {
            if (song != null) {
                song.print();
            }
        }
    }

    private boolean isCodigoUnique(int codigo) {
        for (Song song : songs) {
            if (song != null && song.getCodigo() == codigo) {
                return false;
            }
        }
        return true;
    }

    private int findNullPosition() {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Clase2 clase2 = new Clase2(5);
        clase2.addSong(1, "Canción 1", 10.0);
        clase2.addSong(2, "Canción 2", 12.0);
        clase2.addSong(3, "Canción 3", 15.0);

        clase2.printSongs();

        clase2.rateSong(2, 4);
        clase2.rateSong(4, 3);
    }
}
