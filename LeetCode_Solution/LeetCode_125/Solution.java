// Problem Link: https://leetcode.com/problems/valid-palindrome/

package LeetCode_125;

public class Solution {
  /*
   * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */

  public static boolean isPalindrome(String str, int start, int end) {
    if (start >= end)
      return true;
    if (str.charAt(start) != str.charAt(end))
      return false;
    return isPalindrome(str, start + 1, end - 1);
  }

  public static void main(String[] args) {
    String s = "sas!";
    s = s.replaceAll("[^a-zA-z0-9]", "");
    s = s.toLowerCase();
    System.out.println(isPalindrome(s, 0, s.length() - 1));
  }
}
