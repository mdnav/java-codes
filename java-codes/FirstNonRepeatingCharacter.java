import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        // Count characters while preserving their first-appearance order.
        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        Character firstNonRepeating = null;

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeating = entry.getKey();
                break;
            }
        }

        if (firstNonRepeating != null) {
            String display = firstNonRepeating == ' ' ? "[space]" : firstNonRepeating.toString();
            System.out.println("First non-repeating character: " + display);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
