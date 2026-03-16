import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Normalize the string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Convert to char array
        char[] arr = normalized.toCharArray();

        // Step 3: Two pointer comparison
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 4: Result
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}