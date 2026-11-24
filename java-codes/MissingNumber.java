import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (the numbers should range from 1 to N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. N must be a positive integer.");
            sc.close();
            return;
        }

        int[] numbers = new int[n - 1];
        Set<Integer> seen = new HashSet<>();

        System.out.println("Enter " + (n - 1) + " distinct numbers from 1 to " + n
                + ", with exactly one number missing:");

        long actualSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int value = sc.nextInt();

            if (value < 1 || value > n) {
                System.out.println("Invalid value: " + value
                        + ". Every number must be between 1 and " + n + ".");
                sc.close();
                return;
            }

            if (!seen.add(value)) {
                System.out.println("Invalid input: duplicate number " + value + " found.");
                sc.close();
                return;
            }

            numbers[i] = value;
            actualSum += value;
        }

        // Use long so the sum does not overflow an int for large N.
        long expectedSum = (long) n * (n + 1) / 2;
        long missingNumber = expectedSum - actualSum;

        if (missingNumber < 1 || missingNumber > n) {
            System.out.println("The input does not contain exactly one missing number.");
        } else {
            System.out.println("Missing number: " + missingNumber);
        }

        sc.close();
    }
}
