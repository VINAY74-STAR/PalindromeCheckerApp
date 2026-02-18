public class PalindromeCheckerApp {
        public static void main(String[] args) {

            System.out.println("Welcome to the Palindrome Checker Management System");
            System.out.println("Version: 1.8");
            System.out.println("System initialized successfully.");

            String word = "madam";
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            if (word.equals(reversed)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is not a Palindrome.");
            }
        }
    }




