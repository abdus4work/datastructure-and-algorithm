/*
 * 
 * Problem Link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
 * 
 */


package LeetCode_2520;

public class Solution {

  /**
   * Counts the number of digits in a given number that divide the number itself.
   * 
   * Time Complexity: O(log(n))
   * Space Complexity: O(1)
   * 
   * @param n The number to be checked.
   * @return The number of digits that divide the number.
   */
  public static int countDigits(int n) {
    int count = 0;
    int num = n;
    while (num > 0) {
      int digit = num % 10;
      if (digit != 0 && (n % digit == 0))
        count++;
      num /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    int num = 121;
    int digits = countDigits(num);
    System.out.println(digits);
  }
}
