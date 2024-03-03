package Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
public class Cliente {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static Scanner scanner = new Scanner(System.in);
    private String nombre;
    private int id;

    // Creamos el constructor
    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Creamos el método toString

    public String toString() {
        return "Cliente: " + nombre + " con id: " + id;
    }

    public static void crearCliente() {

        System.out.println("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, clientes.size() + 1);
        System.out.println("Cliente creado:");
        clientes.add(cliente);
    }

    public void opcionesMenu(int opcion) {
        switch (opcion) {
            case 1:
                crearCliente();
                menu();
                break;
            case 2:
                mostrarClientes();
                menu();
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
                menu();
                break;
        }
    }

        public void menu() {
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
                opcionesMenu(opcion);
        }
        //Método para mostrar los clientes
        public static void mostrarClientes() {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }






