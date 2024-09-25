// Merge Sort

package DSA_Solution.Merge_sort;

public class Solution {

  /*
   * Merge Sort is a Divide and Conquer algorithm. It divides the input array into
   * two halves, calls itself for the two halves, and then merges the two sorted
   * halves.
   * 
   * Time Complexity: O(n*log(n)) as it divides the array into two halves and
   * takes linear time to merge two halves.
   * Auxiliary Space: O(n)
   */

  public static void mergeSort(int arr[], int l, int r) {
    if (l < r) { // Same as (l+r)/2, but avoids overflow for large l and h
      int m = l + (r - l) / 2; // Find the middle point
      mergeSort(arr, l, m); // Sort first and second halves
      mergeSort(arr, m + 1, r);
      merge(arr, l, m, r); // Merge the sorted halves
    }
  }

  public static void merge(int arr[], int l, int m, int r) {
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;
    /* Create temp arrays */
    int L[] = new int[n1];
    int R[] = new int[n2];
    /* Copy data to temp arrays */
    for (int i = 0; i < n1; ++i) {
      L[i] = arr[l + i];
    }
    for (int j = 0; j < n2; ++j) {
      R[j] = arr[m + 1 + j];
    }
    /* Merge the temp arrays */
    int i = 0, j = 0;
    int k = l;

    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  public static void main(String args[]) {
    int arr[] = { 12, 11, 13, 5, 6, 7 };
    mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
