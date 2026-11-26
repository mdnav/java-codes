import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        char[] characters = original.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        // Reverse the character array in place.
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(characters);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

        if (original.isEmpty()) {
            System.out.println("You entered an empty string.");
        }

        sc.close();
    }
}
