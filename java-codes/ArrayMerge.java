import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int firstSize = sc.nextInt();

        if (firstSize <= 0) {
            System.out.println("Invalid size for the first array. Please enter a positive number.");
            sc.close();
            return;
        }

        int[] firstArray = new int[firstSize];
        System.out.println("Enter " + firstSize + " elements for the first array:");
        for (int i = 0; i < firstSize; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int secondSize = sc.nextInt();

        if (secondSize <= 0) {
            System.out.println("Invalid size for the second array. Please enter a positive number.");
            sc.close();
            return;
        }

        int[] secondArray = new int[secondSize];
        System.out.println("Enter " + secondSize + " elements for the second array:");
        for (int i = 0; i < secondSize; i++) {
            secondArray[i] = sc.nextInt();
        }

        int[] mergedArray = new int[firstSize + secondSize];

        // Copy the first array, followed by the second array.
        for (int i = 0; i < firstSize; i++) {
            mergedArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondSize; i++) {
            mergedArray[firstSize + i] = secondArray[i];
        }

        System.out.print("First array: ");
        printArray(firstArray);

        System.out.print("Second array: ");
        printArray(secondArray);

        System.out.print("Merged array: ");
        printArray(mergedArray);

        sc.close();
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
