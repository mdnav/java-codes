import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size. Please enter a positive number.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(numbers);

        // Move non-zero values forward while maintaining their order.
        int nextNonZero = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                numbers[nextNonZero] = numbers[i];
                nextNonZero++;
            }
        }

        // Fill the remaining positions with zeros.
        while (nextNonZero < size) {
            numbers[nextNonZero] = 0;
            nextNonZero++;
        }

        System.out.print("Array after moving zeros: ");
        printArray(numbers);

        sc.close();
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
