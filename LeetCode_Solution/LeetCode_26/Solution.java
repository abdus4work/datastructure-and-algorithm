// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/


package LeetCode_26;
import java.util.HashSet;

public class Solution {

  /*
   * Approach 1: Using HashSet
   * We can use a HashSet to store the unique elements of the array. Then we can copy the elements of the HashSet back to the array. 
   * 
   * Time Complexity: O(n) where n is the number of elements in the array
   * Space Complexity: O(n) where n is the number of elements in the array
   * 
   */
  public static int removeDuplicatesApproach1(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    int i = 0;
    for (int num : set) {
      arr[i++] = num;
    }
    return set.size();
  }

  /*
   * Approach 2: Using Two Pointers
   * we can use two pointers to solve this problem. The first pointer i is used to keep track of the unique elements of the array. And the second pointer j is used to iterate through the array.
   * 
   * Time Complexity: O(n) where n is the number of elements in the array
   * Space Complexity: O(1)
   */
  public static int removeDuplicatesApproach2(int[] arr){
    int n = arr.length;
    if (n == 0) return 0;
    int i = 0;
    for (int j = 1; j < n; j++) {
      if (arr[j] != arr[i]) {
        i++;
        arr[i] = arr[j];
      }
    }
    return i + 1;
  }
  
  public static void main(String[] args) {
    System.out.println(removeDuplicatesApproach1(new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6, 6})); // 6
    System.out.println(removeDuplicatesApproach2(new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6, 6})); // 6
  }

}