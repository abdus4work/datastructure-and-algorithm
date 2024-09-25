/*
 * Problem Link- https://leetcode.com/problems/palindrome-number/description/
 * 
 * TimeComplexity- O(log(x))
 * SpaceComplexity- O(1)
 */

package LeetCode_09;

public class Solution {

  /**
   * Determines whether a given integer is a palindrome.
   *
   * @param x the integer to check for palindrome
   * @return true if the integer is a palindrome, false otherwise
   */
  public static boolean isPalindrome(int x) {
    int num = x;
    int reverse = 0;
    while (num > 0) { 
      int lastDigit = num % 10; // get the last digit of the number
      reverse = reverse * 10 + lastDigit; // reverse the number
      num /= 10;
    }
    if (reverse == x) // check if the reversed number is equal to the original number
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(153)); // Output: false
  }
}
