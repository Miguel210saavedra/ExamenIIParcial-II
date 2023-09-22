/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion1.Semana9;

public class Jtunes {
  private Song[] songs;

    public Jtunes(int longitud) {
        songs = new Song[longitud];
    }

    public boolean addSong(String nombre ,int codigo, double precio) {
        if (searchSong(codigo) != null) {
            return false;
        }

        for (int numerodecancion = 0; numerodecancion < songs.length; numerodecancion++) {
            if (songs[numerodecancion] == null) {
                songs[numerodecancion] = new Song(codigo, nombre, precio);
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
            System.out.println("No existe una cancion con el codigo: " + codigo);
        }
    }

    public void printSongs() {
        for (Song song : songs) {
            if (song != null) {
                song.print();
            }
        }
    }  
}
