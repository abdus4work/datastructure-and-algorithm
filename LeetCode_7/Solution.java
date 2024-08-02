package LeetCode_7;

public class Solution {
  public static int reverse(int x) {
    int sum = 0;
    int num = Math.abs(x);
    while (num > 0) {
      int lastDigit = num % 10;
      if (sum*10 > Integer.MAX_VALUE)
      return 0;
      sum = sum * 10 + lastDigit;
      num /= 10;
    }

    if (sum > Integer.MAX_VALUE) {
      return 0;
    } else {
      if (sum < Integer.MIN_VALUE) {
        return 0;
      } else {
        if (x < 0) {
          return -sum;
        } else
          return sum;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(reverse(1534236469));
  }
}
