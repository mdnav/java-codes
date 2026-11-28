import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("5. Check even or odd");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Enter first number: ");
                    double first = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double second = sc.nextDouble();

                    switch (choice) {
                        case 1:
                            System.out.println("Result: " + (first + second));
                            break;
                        case 2:
                            System.out.println("Result: " + (first - second));
                            break;
                        case 3:
                            System.out.println("Result: " + (first * second));
                            break;
                        case 4:
                            if (second == 0) {
                                System.out.println("Error: Division by zero is not allowed.");
                            } else {
                                System.out.println("Result: " + (first / second));
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.print("Enter an integer: ");
                    int number = sc.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is even.");
                    } else {
                        System.out.println(number + " is odd.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 6.");
            }
        } while (choice != 6);

        sc.close();
    }
}
