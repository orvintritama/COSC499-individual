import org.junit.Test;

import static org.junit.Assert.*;

public class TestPalindromeStringChecker {

    @Test
    public void testIsPalindromeString() {
        assertTrue(PalindromeStringChecker.isPalindrome(new String("")));
        assertTrue(PalindromeStringChecker.isPalindrome(new String("racecar")));
        assertTrue(PalindromeStringChecker.isPalindrome(new String("radar")));

        assertFalse(PalindromeStringChecker.isPalindrome(new String("asdasd")));        
        assertFalse(PalindromeStringChecker.isPalindrome(new String("This is wrong")));
    }
}