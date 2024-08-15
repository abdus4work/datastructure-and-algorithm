// Find the largest element in an array

package DSA_Solution.FInd_the_largest_element;

import java.util.Arrays;

public class Solution {

  /*
   * Find the largest element in an array
   * 
   * Approach 1: Sort the array and return the last element.
   * 
   * Time Complexity: O(n*log(n)) as it sorts the array.
   * 
   * Auxiliary Space: O(1)
   */

  public static int largestElement(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  /*
   * Approach 2: Initialize two pointers i and j pointing to the start and end of
   * the array respectively. Increment i if arr[i] < arr[j] else decrement j.
   * 
   * Time Complexity: O(n)
   * 
   * Auxiliary Space: O(1)
   */

  public static int largestElementApproach2(int arr[]){
    int i=0;
    int j=arr.length-1;
    while(i<j){
      if(arr[i]<arr[j]){
        i++;
      }else j--;
    }
    return arr[i];
  }

  /*
   * Approach 3: Initialize max as the first element of the array. Traverse the
   * array and update max if the current element is greater than max.
   * 
   * Time Complexity: O(n)
   * 
   * Auxiliary Space: O(1)
   */

  public static int largestElementApproach3(int[] arr){
    // Edge case
    if(arr.length==0) return -1;
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String args[]) {
    int arr[] = { 12, 35, 1, 10, 34, 1 };
    System.out.println(largestElement(arr));
    System.out.println(largestElementApproach2(arr));
    System.out.println(largestElementApproach3(arr));
  }
  
}
