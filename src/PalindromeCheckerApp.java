import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            boolean isPalindrome = true;
            int length = normalized.length();

            for (int i = 0; i < length / 2; i++) {
                if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }

        scanner.close();
    }
}