/**
 * Insertion Sort
 * 
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * 
 * 
 * Time complexity: O(n^2)
 * 
 * Space complexity: O(1) 
 */

function insertionSort(arr){
  let size = arr.length;
  for(let i=1;i<size;i++){
    let key = arr[i];
    let j = i-1;
    while(j>=0 && arr[j]>key){
      arr[j+1] = arr[j];
      j--;
    }
    arr[j+1] = key;
  }
  return arr;
}

console.log(insertionSort([5,4,3,2,1])); // [1,2,3,4,5]


