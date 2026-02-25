import java.util.Scanner;
import java.util.Stack;

interface PalindromeStrategy {
    boolean isValid(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return input.equals(reversed.toString());
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isValid(input);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PalindromeContext context = new PalindromeContext();
        context.setStrategy(new StackStrategy());

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            boolean result = context.executeStrategy(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
        }

        scanner.close();
    }
}