

/**
 * Selection Sort
 * 
 * Selection sort is a simple sorting algorithm. This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts, the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty and the unsorted part is the entire list.
 * 
 * The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.
 * 
 * Time complexity: O(n^2)
 * 
 * Space complexity: O(1)
 */

function selectionSort(arr){
  let size = arr.length;
  for(let i=0;i<size;i++){
    let min = i;
    for(let j=i+1;j<size;j++){
      if(arr[j]<arr[min]){
        min = j;
      }
    }
    [arr[i],arr[min]] = [arr[min],arr[i]];
  }
  return arr;
}


console.log(selectionSort([5,4,3,2,1])); // [1,2,3,4,5]