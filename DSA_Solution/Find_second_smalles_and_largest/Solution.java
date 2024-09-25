// Find the second smallest and second largest element in an array

package DSA_Solution.Find_second_smalles_and_largest;

import java.util.Arrays;

public class Solution {
  /*
   * Find the second smallest and second largest element in an array
   * 
   * Approach 1: Sort the array and return the second and second last element.
   * 
   * Time Complexity: O(n*log(n)) as it sorts the array.
   * Space Complexity: O(1)
   */
  public static void secondSmallestandLargest(int[] arr) {
    if (arr.length < 2)
      System.out.println(-1);
    Arrays.sort(arr);
    System.out.println("Second Smallest Element: " + arr[1]);
    System.out.println("Second Largest Element: " + arr[arr.length - 2]);
  }

  /*
   * Approach 2: Initialize max, second max, min, and second min as the minimum
   * and maximum values of integer respectively. Traverse the array and update
   * max and second max if the current element is greater than max. Update min and
   * second min if the current element is smaller than min.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */

  public static void secondSmallestandLargestApproach2(int[] arr) {
    if (arr.length < 2)
      System.out.println(-1);
    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int smin = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        smax = max;
        max = arr[i];
      }
      if (arr[i] < min) {
        smin = min;
        min = arr[i];
      }
    }

    System.out.println("Second smallest element: " + smax);
    System.out.println("Second largest element: " + smin);
  }

  public static void main(String[] args) {
    int[] arr = { 12, 35, 1, 10, 34, 1 };
    secondSmallestandLargest(arr);
    secondSmallestandLargestApproach2(arr);
  }

}
