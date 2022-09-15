public class Exercise {
    public static void main(String[] args) {

    }

    public boolean isPalindromeString(String s1) {
        for(int i = 0, j= s1.length() - 1; i < j ; i++ , j--) {
            if (s1.charAt(0) != s1.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}