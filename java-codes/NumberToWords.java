import java.util.Scanner;

public class NumberToWords {
    private static final String[] ONES = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convertBelowThousand(int number) {
        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            words.append(ONES[number / 100]).append(" Hundred");
            number %= 100;

            if (number > 0) {
                words.append(" ");
            }
        }

        if (number >= 20) {
            words.append(TENS[number / 10]);
            number %= 10;

            if (number > 0) {
                words.append(" ").append(ONES[number]);
            }
        } else if (number > 0) {
            words.append(ONES[number]);
        }

        return words.toString();
    }

    private static String convertNumber(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Negative " + convertNumber(-number);
        }

        StringBuilder result = new StringBuilder();

        int millions = number / 1_000_000;
        int thousands = (number % 1_000_000) / 1_000;
        int remainder = number % 1_000;

        if (millions > 0) {
            result.append(convertBelowThousand(millions)).append(" Million");
        }

        if (thousands > 0) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(convertBelowThousand(thousands)).append(" Thousand");
        }

        if (remainder > 0) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(convertBelowThousand(remainder));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (up to 999,999,999): ");
        int number = sc.nextInt();

        if (number == Integer.MIN_VALUE) {
            System.out.println("Number is outside the supported range.");
        } else if (Math.abs(number) > 999_999_999) {
            System.out.println("Number is outside the supported range.");
        } else {
            System.out.println("Number in words: " + convertNumber(number));
        }

        sc.close();
    }
}
