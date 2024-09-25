// Problem : Find factorial of given number

package DSA_Solution.Factorial_of_a_number;

public class Solution {
  /*
   * Time complexity - O(n)
   * Space complexity - O(n)
   */
  public static int fact(int num) {
    if (num < 2)
      return 1;
    return num * fact(num - 1);
  }

  public static void main(String[] args) {
    System.out.println(fact(5));
  }

}
