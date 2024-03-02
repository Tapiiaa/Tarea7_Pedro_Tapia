package Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;
public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> resultados = new ArrayList<>();
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(10);
        Dado dado3 = new Dado(12);
        String respuesta;
        do {
            int sumaDados;
            int tirada1 = dado1.tirarDado();
            System.out.println("Dado 1: " + tirada1);
            int tirada2 = dado2.tirarDado();
            System.out.println("Dado 2: " + tirada2);
            int tirada3 = dado3.tirarDado();
            System.out.println("Dado 3: " + tirada3);
            sumaDados = tirada1 + tirada2 + tirada3;
            resultados.add(sumaDados);
            System.out.println("La suma de los tres dados es: " + sumaDados);
            System.out.println("");
            System.out.println("¿Desea volver a tirar los dados? (SI/NO)");
            respuesta = sc.nextLine();


        } while (respuesta.equalsIgnoreCase("SI"));
        System.out.println("Resultados de las tiradas: " + resultados);
        sc.close();


    }
}

