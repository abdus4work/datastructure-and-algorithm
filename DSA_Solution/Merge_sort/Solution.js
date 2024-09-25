/**
 * Merge sort is a divide and conquer algorithm that was invented by John von Neumann in 1945. It is an efficient, stable, comparison-based sorting algorithm.
 * 
 * Time complexity: O(n log n)
 * Space complexity: O(n)
 * 
 * @param {number[]} arr
 * 
 * @returns {number[]}
 */

function mergeSort(arr){
  let size = arr.length;  // size of the array
  if(size<=1) return arr;
  let mid = Math.floor(size/2);  // middle index
  let left = mergeSort(arr.slice(0,mid));  // left half of the array
  let right = mergeSort(arr.slice(mid)); // right half of the array
  return merge(left,right); // merge the left and right half
}

function merge(arr1, arr2){
  // Find the size of the two arrays
  let size1 = arr1.length;
  let size2 = arr2.length;
  let i=0;
  let j=0;
  let result = [];
  // Compare the elements of the two arrays and push the smaller element to the result array
  while(i<size1 && j<size2){
    if(arr1[i]<arr2[j]){
      result.push(arr1[i]);
      i++;
    }else{
      result.push(arr2[j]);
      j++;
    }
  }

  // Push the remaining elements of the first array to the result array
  while(i<size1){
    result.push(arr1[i]);
    i++;
  }

  // Push the remaining elements of the second array to the result array
  while(j<size2){
    result.push(arr2[j]);
    j++;
  }
  return result;
}

console.log(mergeSort([5,4,3,2,1])); // [1,2,3,4,5]