// Problem Link: https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

package GFG_Solution.Frequencies_of_Limited_range;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  /*
   * Given an array of n integers in the range from 1 to n, we need to find the
   * frequency of elements in the array.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static void countFrequencyBetter(int[] arr) {
    HashMap<Integer, Integer> hash = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (hash.containsKey(arr[i])) {
        hash.put(arr[i], hash.get(arr[i]) + 1);
      } else {
        hash.put(arr[i], 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
      System.out.println(entry.getValue());
    }
  }

  /*
   * Given an array of n integers in the range from 1 to n, we need to find the
   * frequency of elements in the array.
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static void countFrequency(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          arr[j] = -1;
        }
      }
      if (arr[i] != -1) {
        System.out.println(arr[i] + "=>" + count);
      }
    }
  }

  /*
   * Given an array of n integers in the range from 1 to n, we need to find the
   * frequency of elements in the array.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static void countFrequencyOptimal(int[] arr, int N, int P) {
    P++;
    for (int i = 0; i < N; i++) {
      int index = (arr[i] % P) - 1;
      if (index >= 0 && index < N) {
        arr[index] += P;
      }
    }

    for (int i = 0; i < N; i++) {
      arr[i] = arr[i] / P;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 2, 3, 5 };
    countFrequencyOptimal(arr, 5, 5);
    System.out.println(Arrays.toString(arr));

  }
}
