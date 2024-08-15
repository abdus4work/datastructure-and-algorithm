



package DSA_Solution.Selection_sort;

import java.util.Arrays;

public class Solution {
  /*
   * Selection Sort
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int minIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      int temp = arr[minIdx];
      arr[minIdx] = arr[i];
      arr[i] = temp;
    }
  }

   public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));

  }
}
