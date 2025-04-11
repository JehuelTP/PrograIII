public class Ejercicio11 {
    // Definimos nuestra matriz diagonal
    int[][] diagonal;

    // Constructor para inicializar la matriz
    public Ejercicio11() {
        diagonal = new int[5][5];
    }

    // Método para ejecutar la lógica del ejercicio
    public void ejecutar() {
        // Llenar la matriz diagonal
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j) { // Los elementos en la diagonal toman el valor 1
                    diagonal[i][j] = 1;
                } else { // El resto de los elementos toma el valor 0
                    diagonal[i][j] = 0;
                }
            }
        }

        // Imprimir la matriz en pantalla
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " "); // Imprimir cada elemento
            }
            System.out.println(); // Nueva línea al terminar cada fila
        }
    }
}
