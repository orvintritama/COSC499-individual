public class Exercise {
    public static void main(String[] args) {
        String wordToCheck = "racecar";
        boolean isWordPalindrome = PalindromeStringChecker.isPalindrome(wordToCheck);
        System.out.println("Word palindrome? T/F? " + isWordPalindrome);

        int numberToCheck = 112211;
        boolean isIntPalindrome = PalindromeIntegerChecker.isPalindrome(numberToCheck);
        System.out.println("Integer palindrome? T/F? " + isIntPalindrome );
        System.out.println("test");
    }
}