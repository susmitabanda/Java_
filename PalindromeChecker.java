public class PalindromeChecker {

    public static boolean isPalindrome(String name) {
        name = name.toLowerCase();
        
        int length = name.length();
        for (int i = 0; i < length / 2; i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String name = "Anna"; 

        if (isPalindrome(name)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
}
