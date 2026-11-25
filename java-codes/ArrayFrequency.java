import java.util.Scanner;

public class ArrayFrequency {
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
        boolean[] counted = new boolean[size];

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nElement frequencies:");

        for (int i = 0; i < size; i++) {
            if (counted[i]) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency++;
                    counted[j] = true;
                }
            }

            System.out.println(numbers[i] + " occurs " + frequency + " time(s).");
        }

        sc.close();
    }
}
