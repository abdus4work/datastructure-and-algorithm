// Problem : Sum of first N numbers using recursion

package DSA_Solution.Sum_of_N_numbers_recursion;

public class Solution {

  /*
   * Function to calculate sum of first N numbers
   * Time Complexity: O(N) for N numbers
   * Space Complexity: O(N) for recursive stack
   */
  public static int sumOfNNumbers(int num) {
    if (num == 1)
      return 1;
    return num + sumOfNNumbers(num - 1);
  }

  public static void main(String[] args) {
    System.out.println(sumOfNNumbers(10));
  }
}
