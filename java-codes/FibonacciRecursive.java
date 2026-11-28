import java.util.Scanner;

public class FibonacciRecursive {
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = sc.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
        } else if (terms > 92) {
            System.out.println("Please enter 92 or fewer terms to avoid long overflow.");
        } else {
            System.out.println("Fibonacci sequence:");

            for (int i = 0; i < terms; i++) {
                System.out.print(fibonacci(i));

                if (i < terms - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
