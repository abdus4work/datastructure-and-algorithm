package DSA_Solution.Left_rotate_by_one;

public class Solution {

  /*
   * Approach 1: Using extra space
   * we can use an extra array to store the elements of the array and then copy
   * the elements from the temp array to the original array.
   * 
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */

  public static void leftRotateByOneApproach1(int[] arr) {
    int n = arr.length;
    if (n < 2)
      return;
    int[] temp = new int[n];
    for (int i = 1; i < n; i++) {
      temp[i - 1] = arr[i];
    }
    temp[n - 1] = arr[0];
    for (int i = 0; i < n; i++) {
      arr[i] = temp[i];
    }
  }

  /*
   * Approach 2: Rotate one by one
   * 
   * We can store the first element in a temp variable and then shift the elements
   * of the array to the left by one position.
   * Finally, we can store the temp variable in the last position of the array.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static void leftRotateByOneApproach2(int[] arr) {
    if (arr.length < 2)
      return;
    int key = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = key;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    leftRotateByOneApproach1(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    leftRotateByOneApproach2(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }

  }
}
