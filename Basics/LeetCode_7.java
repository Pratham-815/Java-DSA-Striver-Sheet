package Basics;

/**
 * Problem: Reverse digits of an integer while handling overflow cases
 * Time Complexity: O(log n), where n is the input number (number of digits)
 * Space Complexity: O(1), using only constant extra space
 */
public class LeetCode_7 {
    /**
     * Reverses the digits of an integer, handling negative numbers and overflow
     * @param x The input integer to reverse
     * @return The reversed integer, or 0 if result would overflow
     */
    public int reverse(int x) {
        // Take absolute value to handle negative numbers
        int num = Math.abs(x); 
        
        // Will store the reversed number
        int rev = 0;  
        
        while (num != 0) {
            // Get last digit of number
            int ld = num % 10;  
            
            // Check for potential overflow before adding next digit
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0;  // Return 0 if overflow would occur
            }
            
            // Add last digit to reversed number
            rev = rev * 10 + ld;  
            // Remove last digit from original number
            num = num / 10;  
        }
        
        // Return negative of reversed number if input was negative
        return (x < 0) ? (-rev) : rev;  
    }
}
