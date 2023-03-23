public class Main {
    public static void main(String[] args) {
        int[][] A = new int[3][3]; // Cria uma matriz de ordem 3x3

        // Insere números de 0 a 8 na matriz
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = contador;
                contador++;
            }
        }

        // Imprime a matriz na tela
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
