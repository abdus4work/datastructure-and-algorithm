/*
 * Bubble sort
 */


package DSA_Solution.Bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  /*
   * Bubble Sort is the simplest sorting algorithm that works by repeatedly
   * 
   * swapping the adjacent elements if they are in wrong order.
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));

  }
}
