import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Two Pointer Approach
    public static boolean twoPointerPalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean stackPalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    // Method 3: String Reverse Approach
    public static boolean reversePalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Two Pointer timing
        long start1 = System.nanoTime();
        boolean r1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean r2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Reverse String timing
        long start3 = System.nanoTime();
        boolean r3 = reversePalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Two Pointer: " + r1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + r2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse Method: " + r3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}