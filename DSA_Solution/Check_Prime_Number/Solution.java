package DSA_Solution.Check_Prime_Number;

public class Solution {
  // ? check prime brute force approach
  /**
   * Checks if a given number is a prime number using a brute force approach.
   *
   * @param num the number to be checked
   * @return true if the number is prime, false otherwise
   */
  public static boolean checkPrimeBruteForce (int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0)
        count++;
    }
    return count == 2;
  }

  // ? check prime optimal approach

  /**
   * Checks if a given number is a prime number.
   *
   * @param num the number to be checked
   * @return true if the number is prime, false otherwise
   */
  public static boolean checkPrimeOptimal(int num) {
    int count = 0;
    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        count++;
        if ((num / i) != i)
          count++;
      }
    }
    return count == 2;
  }

  public static void main(String[] args) {
    System.out.println(checkPrimeBruteForce(5));
    System.out.println(checkPrimeOptimal(15));
  }

}
