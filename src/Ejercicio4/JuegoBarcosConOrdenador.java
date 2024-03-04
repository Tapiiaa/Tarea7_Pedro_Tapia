package Ejercicio4;
import java.util.Scanner;
// En esta clase, tanto el usuario como el ordenador juegan intercaladamente hasta que uno de los dos gana.
// El usuario introduce las coordenadas de su disparo y el ordenador genera unas coordenadas aleatorias.
public class JuegoBarcosConOrdenador {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
JuegoBarcosConOrdenador juego = new JuegoBarcosConOrdenador();
juego.jugar();
    }
    public void jugar() {
        Cuadricula tableroUsuario = new Cuadricula();
        Cuadricula tableroOrdenador = new Cuadricula();
        System.out.println("Bienvenido al juego de barcos, pulsa 1 para empezar");
        mostrarMenu();
        }

    public void mostrarMenu(){
    Scanner sc = new Scanner(System.in);
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
            desarrolloJuego();

            case 2:
                System.out.println("Gracias por jugar");
                break;
            default:
                System.out.println("Opción no válida");
                mostrarMenu();
                break;
        }
    }

    private void desarrolloJuego() {
        //Aqui se desarrolla el juego
        Cuadricula tableroUsuario = new Cuadricula();
        Cuadricula tableroOrdenador = new Cuadricula();
        System.out.println("Turno del usuario:");
        System.out.println("");
        System.out.println("Indique su fila");
        int fila = sc.nextInt();
        System.out.println("Indique su columna");
        int columna = sc.nextInt();
        tableroUsuario.insertarBarco(fila,columna);
        System.out.println("Se ha colocado correctamente su barco");
        System.out.println("Turno del ordenador:");
        //El barco coloca su barco entre los limites de la cuadricula
        int filaOrdenador = (int) (Math.random() * 10);
        int columnaOrdenador = (int) (Math.random() * 10);
        tableroOrdenador.insertarBarco(filaOrdenador,columnaOrdenador);
        System.out.println("El ordenador ha colocado su barco");

        //Bucle para que jueguen hasta que uno de los dos gane
        while(true){
            //Turno del usuario
            System.out.println("Turno del usuario:");
            System.out.println("");
            System.out.println("Indique su fila");
            System.out.println("");
            int filaDisparoUsuario = sc.nextInt();
            System.out.println("Indique su columna");
            System.out.println("");
            int columnaDisparoUsuario = sc.nextInt();
            tableroUsuario.disparar(filaDisparoUsuario,columnaDisparoUsuario);
            //Si no, se imprime agua
            boolean hundido = tableroOrdenador.disparar(filaDisparoUsuario,columnaDisparoUsuario);
            if(hundido){
                System.out.println("¡Hundiste un barco!");
                System.out.println("");
            } else {
                System.out.println("Agua, turno del ordenador");
                System.out.println("");
            }
            //Turno ordenador
            //El ordenador genera números aleatorios entre los límites de la cuadricula para colocar su barco
            int filaDisparoOrdenador = (int) (Math.random() * 10);
            int columnaDisparoOrdenador = (int) (Math.random() * 10);
            //Para visualizar el disparo del ordenador, se imprime las coordenadas donde ha disparado:
            System.out.println("El ordenador ha disparado en la fila " + filaDisparoOrdenador + " y columna " + columnaDisparoOrdenador);
            System.out.println("");

            hundido = tableroUsuario.disparar(filaDisparoOrdenador,columnaDisparoOrdenador);
            if(hundido){
                System.out.println("¡El ordenador ha hundido tu barco!");
                System.out.println("");
                break;
            }
            else {
                System.out.println("Agua, turno del usuario");
                System.out.println("");
            }
            //Si se hunde imprimir mensaje de ganador


        }

    }

}




