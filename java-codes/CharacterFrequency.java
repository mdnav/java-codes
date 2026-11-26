import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean[] counted = new boolean[input.length()];

        System.out.println("\nCharacter frequencies:");

        for (int i = 0; i < input.length(); i++) {
            if (counted[i]) {
                continue;
            }

            char current = input.charAt(i);
            int frequency = 1;

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == current) {
                    frequency++;
                    counted[j] = true;
                }
            }

            String displayCharacter;
            if (current == ' ') {
                displayCharacter = "[space]";
            } else if (current == '\\t') {
                displayCharacter = "[tab]";
            } else {
                displayCharacter = Character.toString(current);
            }

            System.out.println(displayCharacter + " : " + frequency);
        }

        sc.close();
    }
}
