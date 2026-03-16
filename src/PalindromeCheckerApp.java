class PalindromeChecker {

    public boolean PalindromeCheckerApp(String input) {

        // Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Convert to char array
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            if(arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}