import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuilder cleaned = new StringBuilder();
        boolean[] seen = new boolean[Character.MAX_VALUE + 1];

        // Preserve only the first occurrence of each character.
        for (int i = 0; i < original.length(); i++) {
            char current = original.charAt(i);

            if (!seen[current]) {
                seen[current] = true;
                cleaned.append(current);
            }
        }

        System.out.println("Original string: " + original);
        System.out.println("String after removing duplicates: " + cleaned);

        sc.close();
    }
}
