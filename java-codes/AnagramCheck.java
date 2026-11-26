import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    private static String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = sc.nextLine();

        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        String normalizedFirst = normalize(first);
        String normalizedSecond = normalize(second);

        boolean areAnagrams;

        if (normalizedFirst.length() != normalizedSecond.length()) {
            areAnagrams = false;
        } else {
            char[] firstChars = normalizedFirst.toCharArray();
            char[] secondChars = normalizedSecond.toCharArray();

            Arrays.sort(firstChars);
            Arrays.sort(secondChars);

            areAnagrams = Arrays.equals(firstChars, secondChars);
        }

        if (areAnagrams) {
            System.out.println("\nThe strings are anagrams.");
        } else {
            System.out.println("\nThe strings are not anagrams.");
        }

        sc.close();
    }
}
