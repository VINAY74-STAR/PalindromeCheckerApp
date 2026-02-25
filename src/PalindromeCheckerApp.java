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
        for (char c : input.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return input.equals(reversed.toString());
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null) return false;
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start++) != input.charAt(end--)) return false;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeStrategy stackAlgo = new StackStrategy();
        PalindromeStrategy pointerAlgo = new TwoPointerStrategy();

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            long startStack = System.nanoTime();
            boolean resStack = stackAlgo.isValid(input);
            long endStack = System.nanoTime();

            long startPointer = System.nanoTime();
            boolean resPointer = pointerAlgo.isValid(input);
            long endPointer = System.nanoTime();

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + resPointer);
            System.out.println("Stack Strategy Time   : " + (endStack - startStack) + " ns");
            System.out.println("Two-Pointer Time      : " + (endPointer - startPointer) + " ns");
        }
        scanner.close();
    }
}