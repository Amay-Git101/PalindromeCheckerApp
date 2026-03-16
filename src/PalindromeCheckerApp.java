public class PalindromeCheckerApp {

    // Recursive method to check if a string is a palindrome
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition:
        // If start index crosses end index, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call:
        // Move start forward and end backward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Input string to test
        String input = "level";

        // Call the recursive method
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}