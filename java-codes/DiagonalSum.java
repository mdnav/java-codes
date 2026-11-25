import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive number.");
            sc.close();
            return;
        }

        int[][] matrix = new int[size][size];
        long primarySum = 0;
        long secondarySum = 0;

        System.out.println("Enter " + (size * size) + " matrix elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();

                if (i == j) {
                    primarySum += matrix[i][j];
                }

                if (i + j == size - 1) {
                    secondarySum += matrix[i][j];
                }
            }
        }

        System.out.println("\nMatrix:");
        printMatrix(matrix, size);

        System.out.println("\nPrimary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);

        if (size % 2 == 1) {
            int center = matrix[size / 2][size / 2];
            long combinedSum = primarySum + secondarySum - center;
            System.out.println("Center element (counted once in combined sum): " + center);
            System.out.println("Combined diagonal sum (without double-counting center): " + combinedSum);
        } else {
            System.out.println("Combined diagonal sum: " + (primarySum + secondarySum));
        }

        sc.close();
    }

    private static void printMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
