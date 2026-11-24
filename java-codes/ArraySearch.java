import java.util.Scanner;

public class ArraySearch {
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

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int foundIndex = -1;

        // Linear search: examine each element from left to right.
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index " + foundIndex
                    + " (position " + (foundIndex + 1) + ").");
        } else {
            System.out.println("Element " + target + " was not found in the array.");
        }

        sc.close();
    }
}
