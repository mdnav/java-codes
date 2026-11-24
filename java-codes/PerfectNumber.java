import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long sum = 0;

            // Proper divisors are positive divisors smaller than the number.
            for (int divisor = 1; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }

            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }

        sc.close();
    }
}
