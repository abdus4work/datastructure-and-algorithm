package DSA_Solution.Check_sorted;

public class Solution {

  /*
   * Check if the array is sorted or not
   * 
   * Approach 1: Traverse the array and for each element, check if the next element is greater than the current element. If not, then the array is not sorted.  
   * 
   * Time Complexity: O(n^2)
   * 
   * Space Complexity: O(1)
   */
  public static void checkSorted(int[] arr){
    boolean flag=true;
    for(int i=0;i<arr.length && flag;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[i]){
          flag=false;
          break;
        }
      }
    }
    if(flag) System.out.println("Array is sorted..");
    else System.out.println("Array is not sorted");
  }
  
  /*
   * Approach 2: Traverse the array and check if the current element is greater than the next element. If not, then the array is not sorted.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static void checkSortedApproach2(int[] arr){
    boolean flag = true;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){
        flag=false;
        break;
      }
    }

    if(flag) System.out.println("Array is sorted...");
    else System.out.println("Array is not sorted...");
  }

  public static void main(String[] args) {
    int[] arr = { 12, 35, 1, 10, 34, 1 };
    checkSorted(arr);
    checkSortedApproach2(arr);
  }
}
