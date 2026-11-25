import java.util.Scanner;

public class RotateArray {
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

        System.out.print("Enter the number of positions to rotate: ");
        int positions = sc.nextInt();

        System.out.print("Choose direction (L for left, R for right): ");
        char direction = Character.toUpperCase(sc.next().charAt(0));

        System.out.print("Original array: ");
        printArray(numbers);

        if (direction != 'L' && direction != 'R') {
            System.out.println("Invalid direction. Please choose L or R.");
            sc.close();
            return;
        }

        // Normalize rotation count to avoid unnecessary full rotations.
        positions = positions % size;

        if (direction == 'L') {
            reverse(numbers, 0, positions - 1);
            reverse(numbers, positions, size - 1);
            reverse(numbers, 0, size - 1);
        } else {
            reverse(numbers, 0, size - positions - 1);
            reverse(numbers, size - positions, size - 1);
            reverse(numbers, 0, size - 1);
        }

        System.out.print("Rotated array: ");
        printArray(numbers);

        sc.close();
    }

    // Reverses the elements in the specified inclusive range.
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
