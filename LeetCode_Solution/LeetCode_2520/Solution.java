package LeetCode_Solution.LeetCode_2520;

public class Solution {
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
