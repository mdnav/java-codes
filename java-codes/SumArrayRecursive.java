import java.util.Scanner;
import java.util.Arrays;

public class SumArrayRecursive {
    private static int sumArray(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sumArray(array, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nArray: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sumArray(numbers, 0));

        sc.close();
    }
}
