import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = sc.nextInt();

        System.out.print("Enter second integer: ");
        int second = sc.nextInt();

        long a = Math.abs((long) first);
        long b = Math.abs((long) second);

        if (a == 0 || b == 0) {
            System.out.println("LCM = 0");
        } else {
            long x = a;
            long y = b;

            // Find GCD using the Euclidean algorithm.
            while (y != 0) {
                long remainder = x % y;
                x = y;
                y = remainder;
            }

            // Divide before multiplying to reduce the risk of overflow.
            long lcm = (a / x) * b;

            System.out.println("LCM = " + lcm);
        }

        sc.close();
    }
}
