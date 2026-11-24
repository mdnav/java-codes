import java.util.Scanner;

public class BinarySearch {
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

        System.out.println("Enter " + size + " elements in sorted (ascending) order:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

            if (i > 0 && numbers[i] < numbers[i - 1]) {
                System.out.println("Invalid input: the array must be sorted in ascending order.");
                sc.close();
                return;
            }
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int left = 0;
        int right = size - 1;
        int foundIndex = -1;

        // Binary search repeatedly halves the search range.
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                foundIndex = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
