import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        long remaining = Math.abs((long) number);
        long reversed = 0;

        while (remaining > 0) {
            long digit = remaining % 10;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }

        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
