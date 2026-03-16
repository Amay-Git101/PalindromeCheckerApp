
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        System.out.println("Input : " + input);

        // Preprocessing (optional but good practice)
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : processedInput.toCharArray()) {
            deque.addLast(c);   // Insert at rear
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {

            char first = deque.removeFirst(); // Remove from front
            char last = deque.removeLast();   // Remove from rear

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}