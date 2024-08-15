package DSA_Solution.Insertion_sort;

public class Solution {
  
  /*
   * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
   * 
   * Time Complexity: O(n^2) as there are two nested loops.
   * Auxiliary Space: O(1)
   */

   public static void insertionSort(int arr[]) {
     int n = arr.length;
     for (int i = 1; i < n; i++) {
       int key = arr[i];
       int j = i - 1;
       while (j >= 0 && arr[j] > key) {
         arr[j + 1] = arr[j];
         j = j - 1;
       }
       arr[j + 1] = key;
     }
   }

    public static void main(String args[]) {
      int arr[] = { 12, 11, 13, 5, 6 };
      insertionSort(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }


}
