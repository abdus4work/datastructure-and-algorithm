// Problem link: https://leetcode.com/problems/fibonacci-number/

package LeetCode_509;

import java.util.Arrays;

public class Solution {
  /**
   * Fibonacci Series using Recursion
   * Time Complexity: O(2^n)
   * Space Complexity: O(n)
   */

  public static int fibb(int num) {
    if (num == 0)
      return 0;
    if (num == 1)
      return 1;
    return fib(num - 1) + fib(num - 2);
  }

  /**
   * Fibonacci Series using Memoization
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */

  static int[] dp = new int[30];

  public static int fib(int num) {
    if (num == 0)
      return dp[0];
    if (num == 1)
      return dp[1];
    if (dp[num] != -1)
      return dp[num];
    return dp[num] = fib(num - 1) + fib(num - 2);
  }

  public static void main(String[] args) {
    Arrays.fill(dp, -1);
    dp[0] = 0;
    dp[1] = 1;
    System.out.println(fib(5));
  }
}
