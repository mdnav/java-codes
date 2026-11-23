import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Invalid range: starting number must not exceed ending number.");
        } else {
            boolean foundPrime = false;

            System.out.println("Prime numbers between " + start + " and " + end + ":");

            for (int number = Math.max(start, 2); number <= end; number++) {
                boolean isPrime = true;

                for (int divisor = 2; divisor <= number / divisor; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(number + " ");
                    foundPrime = true;
                }
            }

            if (!foundPrime) {
                System.out.println("No prime numbers found in this range.");
            } else {
                System.out.println();
            }
        }

        sc.close();
    }
}
