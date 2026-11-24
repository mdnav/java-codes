import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Binary representation: 0");
        } else {
            long remaining = Math.abs((long) number);
            StringBuilder binary = new StringBuilder();

            // Convert the absolute value using repeated division by 2.
            while (remaining > 0) {
                long remainder = remaining % 2;
                binary.append(remainder);
                remaining /= 2;
            }

            binary.reverse();

            if (number < 0) {
                binary.insert(0, '-');
            }

            System.out.println("Binary representation: " + binary);
        }

        sc.close();
    }
}
