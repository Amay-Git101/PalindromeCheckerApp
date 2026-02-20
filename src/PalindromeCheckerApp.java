public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Palindrome Checker - Use Case 2");
        System.out.println("========================================");

        String input = "madam";

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}
