import java.util.Scanner;

public class FactorialRecursive {
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer (0-20): ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative integers.");
        } else if (number > 20) {
            System.out.println("Input is too large for the long data type. Enter a number from 0 to 20.");
        } else {
            System.out.println(number + "! = " + factorial(number));
        }

        sc.close();
    }
}
