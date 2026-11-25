import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int firstSize = sc.nextInt();

        if (firstSize <= 0) {
            System.out.println("Invalid size for the first array.");
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
            System.out.println("Invalid size for the second array.");
            sc.close();
            return;
        }

        int[] secondArray = new int[secondSize];
        System.out.println("Enter " + secondSize + " elements for the second array:");
        for (int i = 0; i < secondSize; i++) {
            secondArray[i] = sc.nextInt();
        }

        System.out.print("Common elements: ");
        boolean foundCommon = false;

        for (int i = 0; i < firstSize; i++) {
            // Skip an element if it appeared earlier in the first array.
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (firstArray[k] == firstArray[i]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Check whether this element exists in the second array.
            for (int j = 0; j < secondSize; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                    foundCommon = true;
                    break;
                }
            }
        }

        if (!foundCommon) {
            System.out.print("None");
        }

        System.out.println();
        sc.close();
    }
}
