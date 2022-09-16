import org.junit.Test;

import static org.junit.Assert.*;

public class TestPalindromeIntegerChecker {
    
    @Test
    public void testIsPalindromeInteger() {
        assertTrue(PalindromeIntegerChecker.isPalindrome(1));    
        assertTrue(PalindromeIntegerChecker.isPalindrome(111));
        assertTrue(PalindromeIntegerChecker.isPalindrome(12321));
        
        assertFalse(PalindromeIntegerChecker.isPalindrome(12));
        assertFalse(PalindromeIntegerChecker.isPalindrome(1233));
    }
}
