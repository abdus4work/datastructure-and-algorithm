package DSA_Solution.Armstrong_Number_Check;

public class Solution {
  /**
   * Checks if a given number is an Armstrong number.
   *
   * @param num the number to be checked
   * @return true if the number is an Armstrong number, false otherwise
   */
  public static boolean armstrongCheck(int num) {
    int dup = num;
    int sum = 0;
    int pow = 0;
    while (dup > 0) {
      pow++;
      dup /= 10;
    }
    dup = num;
    while (dup > 0) {
      int digit = dup % 10;
      sum = (int) (sum + Math.pow((double) digit, (double) pow));
      dup /= 10;
    }
    if (num == sum)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    System.out.println(armstrongCheck(153));
  }
}
