package LeetCode_Solution.LeetCode_09;

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
      int lastDigit = num % 10;
      reverse = reverse * 10 + lastDigit;
      num /= 10;
    }
    if (reverse == x)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(153));
  }
}
