// Left rotate an array by one place

/**
 * Approach 1: Using extra space
 * 1. Create a temp array of size n
 * 2. Copy all elements from 1 to n-1 to temp array
 * 3. Copy 0th element to nth element of temp array
 * 4. Copy all elements from temp array to original array
 * Time Complexity: O(n)
 * Space Complexity: O(n) 
 */
function leftRotateByOneApproach1(arr){
  let temp = new Array(arr.length);
  for(let i=1;i<arr.length;i++){
    temp[i-1]=arr[i];
  }
  temp[arr.length-1]=arr[0];

  for(let i=0;i<arr.length;i++){
    arr[i]=temp[i];
  }
  
}

/**
 * Approach 2: Without using extra space
 * 1. Store 0th element in temp
 * 2. Shift all elements to left by one place
 * 3. Store temp in nth element
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
function leftRotateByOneApproach2(arr){
  let temp = arr[0];
  for(let i=1;i<arr.length;i++){
    arr[i-1]=arr[i];
  }
  arr[arr.length-1]=temp;
}


let arr = [1,2,3,4,5];
leftRotateByOneApproach1(arr);
console.log(arr);