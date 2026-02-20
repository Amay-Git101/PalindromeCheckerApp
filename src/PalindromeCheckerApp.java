import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   UC6: Queue + Stack Palindrome Check ");
        System.out.println("=======================================");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < processedInput.length(); i++) {
            char ch = processedInput.charAt(i);
            queue.add(ch);     
            stack.push(ch);  
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();  

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("---------------------------------------");
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }
        System.out.println("---------------------------------------");

        scanner.close();
    }
}
