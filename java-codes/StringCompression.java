import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder compressed = new StringBuilder();

        if (!input.isEmpty()) {
            int count = 1;

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == input.charAt(i - 1]) {
                    count++;
                } else {
                    compressed.append(input.charAt(i - 1)).append(count);
                    count = 1;
                }
            }

            // Append the final character group.
            compressed.append(input.charAt(input.length() - 1)).append(count);
        }

        System.out.println("Compressed string: " + compressed);

        sc.close();
    }
}
