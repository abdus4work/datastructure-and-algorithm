// Problem: Reverse array using recursion

function reverseArray(arr, start, end) {
  if (start >= end) return; // when start is greater than or equal to end, we have reversed the array
  [arr[start], arr[end]] = [arr[end], arr[start]]; // swap the elements at start and end
  reverseArray(arr, start + 1, end - 1); // recursively call the function with start incremented and end decremented
}

let arr = [2, 4, 6, 9];

reverseArray(arr, 0, arr.length - 1);

console.log(arr);
