package Ejercicio2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        //Imprimimos el menú de la clase Cliente
        Menu menu = new Menu();
        //Imprimir menu
        menu.menu();


    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("1. Crear cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Salir");
        System.out.println("Introduce una opción: ");
        opcion = scanner.nextInt();
        if(opcion < 1 || opcion > 3) {
            System.out.println("Opción no válida");
        }
        if(opcion == 1){
            Cliente.crearCliente();
            menu();
        }
        if(opcion == 2){
            Cliente.mostrarClientes();
            menu();
        }
        if(opcion == 3){
            System.out.println("Saliendo del programa...");
        }

    }

}
