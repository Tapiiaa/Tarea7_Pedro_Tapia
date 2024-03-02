package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @org.junit.jupiter.api.Test
        void main() {
            Dado dado1 = new Dado(6);
            Dado dado2 = new Dado(10);
            Dado dado3 = new Dado(12);
            int tirada1 = dado1.tirarDado();
            int tirada2 = dado2.tirarDado();
            int tirada3 = dado3.tirarDado();
            assertTrue(tirada1 >= 1 && tirada1 <= 6);
            assertTrue(tirada2 >= 1 && tirada2 <= 10);
            assertTrue(tirada3 >= 1 && tirada3 <= 12);
        }

    private void assertTrue(boolean b) {
    }

}