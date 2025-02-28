/**
 * Problem: Check if an integer is a palindrome without converting to string
 * Time Complexity: O(log n), where n is the input number (number of digits)
 * Space Complexity: O(1), using only constant extra space
 */
public class LeetCode_9 {
    /**
     * Determines if an integer reads the same forwards and backwards
     * @param x The input integer to check
     * @return true if x is a palindrome, false otherwise
     */
    public boolean isPalindrome(int x) {
        // Negative numbers cannot be palindromes due to minus sign
        if(x<0) return false;

        // Variables to store reversed number and original input
        int rev = 0;
        int n = x;
        
        // Reverse the number digit by digit
        while(n!=0){
            // Get last digit
            int rem = n%10;
            // Remove last digit from original
            n = n/10;
            // Add digit to reversed number
            rev = (rev*10) + rem;
        }
        
        // Number is palindrome if it equals its reverse
        return (rev == x);
    }
}
