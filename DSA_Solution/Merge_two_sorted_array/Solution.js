/**
 * Merge two sorted arrays
 * 
 * Given two sorted arrays, the task is to merge them in a sorted manner.
 * 
 * Time complexity: O(n+m)
 * Space complexity: O(n+m)
 * 
 * 
 * 
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @returns {number[]}
 */


function mergeSortedArrays(arr1, arr2){
  let size1 = arr1.length;
  let size2 = arr2.length;
  let i=0;
  let j=0;
  let result = [];
  while(i<size1 && j<size2){
    if(arr1[i]<arr2[j]){
      result.push(arr1[i]);
      i++;
    }else{
      result.push(arr2[j]);
      j++;
    }
  }
  while(i<size1){
    result.push(arr1[i]);
    i++;
  }
  while(j<size2){
    result.push(arr2[j]);
    j++;
  }
  return result;
}


console.log(mergeSortedArrays([1,3,5,7],[2,4,6,8])); // [1,2,3,4,5,6,7,8]