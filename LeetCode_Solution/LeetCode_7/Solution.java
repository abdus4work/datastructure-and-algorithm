/*
 * Problem Link- https://leetcode.com/problems/reverse-integer/description/
 * 
 * 
 * 
 * TimeComplexity- O(log(x))
 * SpaceComplexity- O(1)
 */


package LeetCode_Solution.LeetCode_7;

public class Solution {

  
  public static int reverse(int x) {
    int sum = 0;
    int num = Math.abs(x); // To handle negative numbers
    while (num > 0) { 
      int lastDigit = num % 10; // Extracting last digit
      if (sum*10 > Integer.MAX_VALUE) 
      return 0;  // To handle overflow
      sum = sum * 10 + lastDigit; // Adding last digit to sum
      num /= 10;
    }

    if (sum > Integer.MAX_VALUE) { // To handle overflow
      return 0;
    } else {
      if (sum < Integer.MIN_VALUE) { // To handle overflow
        return 0;
      } else {
        if (x < 0) {
          return -sum;
        } else
          return sum;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(reverse(1534236469)); // Output: 0
  }
}
