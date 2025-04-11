import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        int filas = 8;
        int columnas = 8;
        int numeroDeMinas = 10;
        char[][] tablero = new char[filas][columnas];
        int[][] contadorMinas = new int[filas][columnas];

        // Inicializar el tablero con espacios vacíos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
                contadorMinas[i][j] = 0;
            }
        }

        // Colocar minas aleatoriamente
        Random random = new Random();
        int minasColocadas = 0;
        while (minasColocadas < numeroDeMinas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            if (tablero[fila][columna] != '0') {
                tablero[fila][columna] = '0';
                minasColocadas++;
                // Incrementar el contador de minas en las celdas adyacentes
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (fila + i >= 0 && fila + i < filas && columna + j >= 0 && columna + j < columnas) {
                            if (tablero[fila + i][columna + j] != '0') {
                                contadorMinas[fila + i][columna + j]++;
                            }
                        }
                    }
                }
            }
        }

        // Actualizar el tablero con los números de minas adyacentes
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] != '0') {
                    if (contadorMinas[i][j] > 0) {
                        tablero[i][j] = (char) (contadorMinas[i][j] + '0');
                    } else {
                        tablero[i][j] = ' ';
                    }
                }
            }
        }

        // Imprimir el tablero
        System.out.println("Tablero de Buscaminas:");
        System.out.print("   ");
        for (int j = 0; j < columnas; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("  +" + "- ".repeat(columnas));
        for (int i = 0; i < filas; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("  +" + "- ".repeat(columnas));

    }
}