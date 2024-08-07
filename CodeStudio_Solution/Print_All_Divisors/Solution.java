package CodeStudio_Solution.Print_All_Divisors;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  // ! BruteForce Approach
  /**
   * Calculates and returns a list of all divisors of a given number using a brute
   * force approach.
   *
   * @param num the number for which to find divisors
   * @return a list of integers representing the divisors of the given number
   */
  public static List<Integer> printAllDivisorsBruteForce(int num) {
    List<Integer> divisors = new ArrayList<>();

    for (int i = 1; i <= num; i++) {
      if (num % i == 0)
        divisors.add(i);
    }
    return divisors;
  }

  // ! Optimize Approach
  /**
   * Calculates and returns a list of all divisors of a given number.
   *
   * @param num the number for which to find divisors
   * @return a sorted list of all divisors of the given number
   * 
   */
  public static List<Integer> printAllDivisorsOptimize(int num) {
    List<Integer> divisors = new ArrayList<>();

    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        divisors.add(i);
        if (i != (num / i)) {
          divisors.add(num / i);
        }
      }
    }
    divisors.sort((a, b) -> a - b);
    return divisors;
  }

  public static void main(String[] args) {
    System.out.println(printAllDivisorsOptimize(36));
  }
}
