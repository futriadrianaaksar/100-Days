package Day69;

public class Day69 {
    
    public static void main(String[] args) {
        String input = "ana";
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' adalah palindrome.");
        } else {
            System.out.println("'" + input + "' bukan palindrome.");
        }
    }
    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
