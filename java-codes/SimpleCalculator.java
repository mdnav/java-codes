import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result: " + (first + second));
                break;

            case '-':
                System.out.println("Result: " + (first - second));
                break;

            case '*':
                System.out.println("Result: " + (first * second));
                break;

            case '/':
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;

            case '%':
                if (second == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (first % second));
                }
                break;

            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or %.");
        }

        sc.close();
    }
}
