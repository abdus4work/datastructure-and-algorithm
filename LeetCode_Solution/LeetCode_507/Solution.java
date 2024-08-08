/**
 *  Problem Link- https://leetcode.com/problems/perfect-number/
 * 
 */

package LeetCode_Solution.LeetCode_507;

public class Solution {

  //! Brute Force Approach
  /**
   * Checks if a given number is a perfect number using a brute force approach.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   * 
   * @param num The number to be checked.
   * @return True if the number is a perfect number, false otherwise.
   */
  public static boolean checkPerfectNumberBruteForce(int num){
    int sum=0;
    for(int i=1;i<=num;i++){
      if(num%i==0 & i!=num) sum+=i;
    }
    return sum==num;
  }


  //! Optimize solution
  /**
   * Checks if a given number is a perfect number.
   * 
   * Time Complexity: O(sqrt(n))
   * Space Complexity: O(1)
   * 
   * @param num the number to be checked
   * @return true if the number is a perfect number, false otherwise
   */
  public static boolean checkPerfectNumber(int n) {
    int sum = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        sum += i;
        if ((n / i) != i)
          sum += (n / i);
      }
    }
    return sum == n ;
  }

  public static void main(String[] args) {

    System.out.println(checkPerfectNumber(28));
  }
}
