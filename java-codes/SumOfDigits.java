import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = sc.nextLong();

        // Convert to a non-negative value safely, including Long.MIN_VALUE.
        String digits = Long.toString(number);
        long sum = 0;

        for (int i = (digits.charAt(0) == '-' ? 1 : 0); i < digits.length(); i++) {
            sum += digits.charAt(i) - '0';
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
