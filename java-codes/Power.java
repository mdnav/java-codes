import java.util.Scanner;

public class Power {
    private static double calculatePower(double base, int exponent) {
        long positiveExponent = Math.abs((long) exponent);
        double result = 1.0;

        for (long i = 0; i < positiveExponent; i++) {
            result *= base;
        }

        if (exponent < 0) {
            return 1.0 / result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent (integer): ");
        int exponent = sc.nextInt();

        if (base == 0.0 && exponent < 0) {
            System.out.println("Zero cannot be raised to a negative exponent.");
        } else {
            double result = calculatePower(base, exponent);
            System.out.println(base + " ^ " + exponent + " = " + result);
        }

        sc.close();
    }
}
