import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a palindrome number.");
        } else {
            int original = number;
            long reversed = 0;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome number.");
            } else {
                System.out.println(original + " is not a palindrome number.");
            }
        }

        sc.close();
    }
}
