public class PalindromeStringChecker {
    public static boolean isPalindrome(String toCheck) {
        for(int i = 0, j= toCheck.length() - 1; i < j ; i++ , j--) {
            if (toCheck.charAt(i) != toCheck.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
