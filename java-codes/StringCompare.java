import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = sc.nextLine();

        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        System.out.println("\nComparison using equals(): " + first.equals(second));
        System.out.println("Comparison using equalsIgnoreCase(): " + first.equalsIgnoreCase(second));
        System.out.println("Comparison using compareTo(): " + first.compareTo(second));
        System.out.println("Comparison using == : " + (first == second));

        // Demonstrate reference comparison vs content comparison.
        String sample1 = new String("Java");
        String sample2 = new String("Java");

        System.out.println("\nDemonstration with two separately created String objects:");
        System.out.println("sample1.equals(sample2): " + sample1.equals(sample2));
        System.out.println("sample1 == sample2: " + (sample1 == sample2));

        sc.close();
    }
}
