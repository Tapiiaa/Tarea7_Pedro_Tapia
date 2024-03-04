package Ejercicio3;
import java.util.Scanner;
public class JuegoBarcos {
    static Scanner sc = new Scanner(System.in);
    //Creamos un tablero
    static CuadriculaJuego tablero = new CuadriculaJuego();

    //Introducimos el juego, donde el ordenador genera unas coordenadas aleatorias
    public static void jugar() {
        //Generamos las coordenadas aleatorias
        int fila = (int) (Math.random() * 10);
        int columna = (int) (Math.random() * 10);
        tablero.insertarBarco(fila, columna);
        tablero.imprimirTablero();
        while (true) {
            System.out.println("Introduce la fila: ");
            int filaParaDisparar = sc.nextInt();
            System.out.println("Introduce la columna: ");
            int columnaParaDisparar = sc.nextInt();
            tablero.disparar(filaParaDisparar, columnaParaDisparar);
            boolean hundido = tablero.disparar(filaParaDisparar, columnaParaDisparar);
            tablero.imprimirTablero();
            if (hundido) {
                System.out.println("Se ha hundido el barco. ¡Has ganado!");
                break;
            } else {
                System.out.println("Intentalo de nuevo");
            }


        }
    }

    public static void main(String[] args) {
        JuegoBarcos juego = new JuegoBarcos();
        JuegoBarcos.jugar();
    }
}
