public class PalindromeIntegerChecker {

    public static boolean isPalindrome(int toCheck) {
        int original = toCheck;
        int reversed = 0;
        
        //if it's negative, convert to positive;
        if (toCheck < 0) {
            toCheck *= -1;
        } else {
            while (toCheck != 0) {
                int r = toCheck % 10; // take the last digit
                toCheck /= 10; // remove the last digit
                reversed = reversed * 10 + r; // make an extra space at the end, and at remainder
                 
            }
        }
        System.out.println("test");
        // true if original is the same as reversed
        return (original == reversed) ? true : false;
    }

}
