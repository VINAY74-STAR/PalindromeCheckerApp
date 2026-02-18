import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine().toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                deque.addLast(c);
            }
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome);
        scanner.close();
    }
}
