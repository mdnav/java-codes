import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many strings do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Please enter a positive number of strings.");
            sc.close();
            return;
        }

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        String[] sortedStrings = Arrays.copyOf(strings, strings.length);
        Arrays.sort(sortedStrings, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\nOriginal strings:");
        for (String value : strings) {
            System.out.println(value);
        }

        System.out.println("\nStrings sorted alphabetically:");
        for (String value : sortedStrings) {
            System.out.println(value);
        }

        sc.close();
    }
}
