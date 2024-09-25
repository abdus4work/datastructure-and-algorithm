// Left rotate the array by D places

package DSA_Solution.Left_rotate_by_D_place;

public class Solution {

  /*
   * Approach 1: Using temp array
   * 1. Create a temp array of size n
   * 2. copy the elements from d to n-1 to temp array
   * 3. copy the elements from 0 to d-1 to the temp array
   * 4. copy the temp array to the original array
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */

  public static void leftRotateByDApproach1(int[] arr, int d) {
    int n = arr.length;
    d = d % n;
    if (n < 2 || d == 0)
      return;
    int[] temp = new int[n];
    int i = 0;
    // copy the elements from d to n-1 to temp array
    for (int j = d; j < n; j++) {
      temp[i] = arr[j];
      i++;
    }

    // copy the elements from 0 to d-1 to the temp array
    for (int j = 0; j < d; j++) {
      temp[i] = arr[j];
      i++;
    }

    // copy the temp array to the original array
    for (i = 0; i < n; i++) {
      arr[i] = temp[i];
    }
  }

  /*
   * Approach 2: Observation from Approach 1
   * 1. Create a temp array of size d
   * 2. copy the elements from 0 to d-1 to temp array
   * 3. shift the elements from d to n-1 to the left by d places
   * 4. copy the temp array to the original array
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(d) where d is the number of places to rotate
   */
  public static void leftRotateByDApproach2(int[] arr, int d) {
    int n = arr.length;
    d = d % n;
    if (n < 2 || d == 0)
      return;
    int temp[] = new int[d];

    // copy the elements from 0 to d-1 to temp array
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }

    // shift the elements from d to n-1 to the left by d places
    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    }

    // copy the temp array to the original array
    for (int i = 0; i < d; i++) {
      arr[n - d + i] = temp[i];
    }
  }

  /*
   * Approach 3: Reversal Algorithm
   * 1. Reverse the elements from 0 to d-1
   * 2. Reverse the elements from d to n-1
   * 3. Reverse the elements from 0 to n-1
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */

  public static void leftRotateByDApproach3(int[] arr, int d) {
    int n = arr.length;
    d = d % n;
    if (n < 2 || d == 0)
      return;
    // reverse the elements from 0 to d-1
    for (int i = 0; i < d / 2; i++) {
      swap(arr, i, d - i - 1);
    }
    // reverse remaining elements
    for (int i = 0; i < (n - d) / 2; i++) {
      swap(arr, i + d, n - i - 1);
    }
    // reverse the whole array
    for (int i = 0; i < n / 2; i++) {
      swap(arr, i, n - i - 1);
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {

  }
}