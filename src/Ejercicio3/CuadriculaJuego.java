package Ejercicio3;

public class CuadriculaJuego {
    private char[][] tabla;
    private int filas = 10;
    private int columnas = 10;

    public CuadriculaJuego() {
        tabla = new char[filas][columnas];
        iniciarTablero();
    }

    private void iniciarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = '_';
            }
        }
    }

    //Método para colocar un barco

    public void insertarBarco(int fila, int columna){
        tabla[fila][columna] = 'Z';
    }

    //Método para disparar

    public boolean disparar(int fila, int columna){
        if(tabla[fila][columna] == 'Z'){
            tabla[fila][columna] = 'X';
            return true;
        } else {
            tabla[fila][columna] = 'O';
            return false;
        }
    }

    //Método para ver el tablero a lo largo del juego

    public void imprimirTablero(){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }



}
