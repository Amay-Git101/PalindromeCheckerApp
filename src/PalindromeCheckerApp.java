public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Palindrome Checker - Use Case 3");
        System.out.println("========================================");

        String input = "level";

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}
