import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

        
public class Medrano_Miguel_ArrayList {
  private ArrayList<String> lista;
    Random  PalabraRandom = new Random();
    Scanner leer = new Scanner(System.in);

    public Medrano_Miguel_ArrayList() {
        lista = new ArrayList<>(Arrays.asList("perro", "animal", "escuela", "terreno", 
                "miguel", "angel", "unitec", "casa", "luna", "balon"));
    }

    
    public void iniciar() {
        boolean Salir = false;

        while (!Salir) {
            mostrarMenu();
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Ahorcado();
                    break;
                case 2:
                    Palabras();
                    break;
                case 3:
                    Salir = true;
                    break;
                default:
                    System.out.println("Opcion no Valida, Ingresar nuevamnete!");
            }
        }
        System.out.println("\nGracias Por jugar");
    }

    private void mostrarMenu() {
        System.out.println("\nMenu\n1- Jugar \n2- Cambiar Palabras \n3- Salir");
        System.out.println("Opcion :");
    }

    private void Ahorcado() {
        String palabra = lista.get(PalabraRandom.nextInt(lista.size()));
        int errores =5;
        boolean[] letras = new boolean[palabra.length()];

        System.out.println("Ahorcado!");
        System.out.println("Trata de adivinar la palabra!");

        while (errores !=0 && !palabraAdivinada(letras)) {
            System.out.println("Usted lleva " + errores+ " Errores!");
            mostrarPalabraOculta(palabra, letras);

            System.out.println("Ingrese una letra :");
            char letra = leer.next().charAt(0);

            if (verificarLetra(palabra, letra, letras)) {
                System.out.println("Le pegaste a un caracter!");
            } else {
                System.out.println("Letra Incorrecta");
                  errores--;
            }   
        }

        if (palabraAdivinada(letras)) {
            System.out.println("Ganaste! : " + palabra);
        } else {
            System.out.println("Perdiste Palabra correcta :" + palabra);
        }
    }

    private void mostrarPalabraOculta(String palabra, boolean[] letrasAdivinadas) {
        for (int i = 0; i < palabra.length(); i++) {
            if (letrasAdivinadas[i]) {
                System.out.print(palabra.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    private boolean verificarLetra(String palabra, char letra, boolean[] letrasAdivinadas) {
        boolean letraAdivinada = false;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                letrasAdivinadas[i] = true;
                letraAdivinada = true;
            }
        }
        return letraAdivinada;
    }

    private boolean palabraAdivinada(boolean[] letrasAdivinadas) {
        for (boolean adivinada : letrasAdivinadas) {
            if (!adivinada) {
                return false;
            }
        }
        return true;
    }

    private void Palabras() {
        lista.clear();
        System.out.println("\nCambiar Palabras");
        System.out.println("Ingrese 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra #" + (i + 1) + ": ");
            String palabra = leer.next();
            lista.add(palabra.toLowerCase());
        }
        System.out.println("Palabras Cambiadas Correctamente!");
    }

    public static void main(String[] args) {
        Medrano_Miguel_ArrayList juego = new Medrano_Miguel_ArrayList();
        juego.iniciar();
    }
}
