import java.util.Scanner;

public class StrongNumber {
    private static int factorial(int digit) {
        int result = 1;

        for (int i = 2; i <= digit; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Strong number is defined here only for non-negative integers.");
        } else {
            int original = number;
            int remaining = number;
            long sum = 0;

            // Treat zero as one digit: 0!, which equals 1.
            if (remaining == 0) {
                sum = factorial(0);
            } else {
                while (remaining > 0) {
                    int digit = remaining % 10;
                    sum += factorial(digit);
                    remaining /= 10;
                }
            }

            if (sum == original) {
                System.out.println(original + " is a Strong Number.");
            } else {
                System.out.println(original + " is not a Strong Number.");
            }
        }

        sc.close();
    }
}
