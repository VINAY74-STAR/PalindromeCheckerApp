import java.util.Scanner;

class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            boolean isPalindrome = service.checkPalindrome(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }

        scanner.close();
    }
}