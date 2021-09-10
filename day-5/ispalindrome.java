// 9. Palindrome Number
// Easy

// 3945

// 1846

// Add to List

// Share
// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 
public class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) {
            return false;
        }
       
        int number = x;
       
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }
}
