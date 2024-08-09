// Problem: Print something N times using recursion

package DSA_Solution.Print_N_times_Recursion;

public class Solution {
  static int count = 1;

  public static void printNTimes(int num) {
    if (count > num)
      return;
    System.out.print(count + " ");
    count++;
    printNTimes(num);
  }

  public static void main(String[] args) {
    printNTimes(10);
  }

}