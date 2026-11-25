import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of the first matrix: ");
        int rowsA = sc.nextInt();

        System.out.print("Enter columns of the first matrix: ");
        int columnsA = sc.nextInt();

        System.out.print("Enter rows of the second matrix: ");
        int rowsB = sc.nextInt();

        System.out.print("Enter columns of the second matrix: ");
        int columnsB = sc.nextInt();

        if (rowsA <= 0 || columnsA <= 0 || rowsB <= 0 || columnsB <= 0) {
            System.out.println("Invalid dimensions. All dimensions must be positive.");
            sc.close();
            return;
        }

        if (columnsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Columns of the first matrix must equal rows of the second matrix.");
            sc.close();
            return;
        }

        int[][] firstMatrix = new int[rowsA][columnsA];
        int[][] secondMatrix = new int[rowsB][columnsB];
        int[][] productMatrix = new int[rowsA][columnsB];

        System.out.println("Enter elements of the first matrix:");
        readMatrix(sc, firstMatrix, rowsA, columnsA);

        System.out.println("Enter elements of the second matrix:");
        readMatrix(sc, secondMatrix, rowsB, columnsB);

        // Matrix multiplication: row of A multiplied by column of B.
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    productMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        System.out.println("\nFirst matrix:");
        printMatrix(firstMatrix, rowsA, columnsA);

        System.out.println("\nSecond matrix:");
        printMatrix(secondMatrix, rowsB, columnsB);

        System.out.println("\nProduct matrix:");
        printMatrix(productMatrix, rowsA, columnsB);

        sc.close();
    }

    private static void readMatrix(Scanner sc, int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
