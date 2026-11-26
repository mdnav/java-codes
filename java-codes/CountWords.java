import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        int wordCount;
        if (sentence.isEmpty()) {
            wordCount = 0;
        } else {
            // Split on one or more whitespace characters.
            String[] words = sentence.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}
