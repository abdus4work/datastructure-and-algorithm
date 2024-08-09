// Problem: Reverse array using recursion

package DSA_Solution.Reverse_array_using_recursion;

import java.util.Arrays;

public class Solution {
  /**
   * 
   * Using two pointer approach
   * 
   * TimeComplexity - O(n)
   * SpaceComplexity - O(n)
   * 
   */
  public static void reverseArray(int[] arr, int start, int end) {
    if (start >= end) // when start is greater than end, we have reversed the array
      return;
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp; // swapping the elements
    reverseArray(arr, start + 1, end - 1);  // recursive call
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8, 9 };
    reverseArray(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr)); // [9, 8, 6, 4, 2]
  }
}
