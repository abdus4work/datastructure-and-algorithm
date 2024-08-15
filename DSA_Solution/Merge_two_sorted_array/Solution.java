// Merge two sorted array

package DSA_Solution.Merge_two_sorted_array;

public class Solution {

  /*
   * Merge two sorted arrays
   * 
   * Time Complexity: O(n1 + n2) where n1 and n2 are the sizes of the two sorted arrays.
   * Auxiliary Space: O(n1 + n2)
   */

  public static int[] merge(int[] arr1, int[] arr2){
    int n1 = arr1.length;
    int n2 = arr2.length;
    int[] arr3 = new int[n1 + n2];
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        arr3[k++] = arr1[i++];
      } else {
        arr3[k++] = arr2[j++];
      }
    }
    while (i < n1) {
      arr3[k++] = arr1[i++];
    }
    while (j < n2) {
      arr3[k++] = arr2[j++];
    }
    return arr3;
  }

  public static void main(String args[]) {
    int arr1[] = { 1, 3, 5, 7 };
    int arr2[] = { 2, 4, 6, 8 };
    int[] arr3 = merge(arr1, arr2);
    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }
  }
}
