import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter replacement text: ");
        String replacement = sc.nextLine();

        String modified = input.replace(" ", replacement);

        System.out.println("\nOriginal: " + input);
        System.out.println("Modified: " + modified);

        sc.close();
    }
}
