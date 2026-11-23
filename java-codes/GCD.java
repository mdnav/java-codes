import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        long a = sc.nextLong();

        System.out.print("Enter second integer: ");
        long b = sc.nextLong();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("GCD is undefined when both numbers are zero.");
        } else {
            // Euclidean algorithm
            while (b != 0) {
                long remainder = a % b;
                a = b;
                b = remainder;
            }

            System.out.println("GCD = " + a);
        }

        sc.close();
    }
}
