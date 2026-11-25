import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid matrix dimensions. Rows and columns must be positive.");
            sc.close();
            return;
        }

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        System.out.println("Enter elements of the first matrix:");
        readMatrix(sc, firstMatrix, rows, columns);

        System.out.println("Enter elements of the second matrix:");
        readMatrix(sc, secondMatrix, rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("\nFirst matrix:");
        printMatrix(firstMatrix, rows, columns);

        System.out.println("\nSecond matrix:");
        printMatrix(secondMatrix, rows, columns);

        System.out.println("\nSum of matrices:");
        printMatrix(sumMatrix, rows, columns);

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
