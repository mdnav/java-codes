import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Set<Character> seen = new HashSet<>();
        Character firstRepeating = null;

        // Scan left to right; the first character already in the set is the answer.
        for (char ch : input.toCharArray()) {
            if (seen.contains(ch)) {
                firstRepeating = ch;
                break;
            }
            seen.add(ch);
        }

        if (firstRepeating != null) {
            String display = firstRepeating == ' ' ? "[space]" : firstRepeating.toString();
            System.out.println("First repeating character: " + display);
        } else {
            System.out.println("No repeating character found.");
        }

        sc.close();
    }
}
