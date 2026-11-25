import java.util.Scanner;

public class SubArray {
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

        System.out.print("Enter the starting index (0 to " + (size - 1) + "): ");
        int start = sc.nextInt();

        System.out.print("Enter the ending index (0 to " + (size - 1) + "): ");
        int end = sc.nextInt();

        if (start < 0 || end >= size || start > end) {
            System.out.println("Invalid range. Ensure 0 <= start <= end < " + size + ".");
            sc.close();
            return;
        }

        System.out.print("Original array: ");
        printArray(numbers);

        System.out.print("Subarray from index " + start + " to " + end + ": ");
        for (int i = start; i <= end; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
