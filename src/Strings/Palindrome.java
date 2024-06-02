package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        String str1 = "apple";
        isPalindrome(str, str.length());
        isPalindrome(str1, str1.length());
    }

    public static void isPalindrome(String str, int len) {
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                System.out.println("The string " + str + " is not palindrome.");
                return;
            }
        }
        System.out.println("The string " + str + " is palindrome");
    }
}
