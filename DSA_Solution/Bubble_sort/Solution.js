/**
 * Bubble sort
 * 
 */



/**
 * 
 * Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the
 * 
 * 
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 * 
 * @param {number} arr 
 */

function bubbleSort(arr){
  let size = arr.length;
  for(let i=0;i<size;i++){
    for(let j=0;j<size-i-1;j++){
      if(arr[j]>arr[j+1]){
        [arr[j],arr[j+1]] = [arr[j+1],arr[j]];
      }
    }
  }
}

console.log(bubbleSort([5,4,3,2,1])); // [1,2,3,4,5]
