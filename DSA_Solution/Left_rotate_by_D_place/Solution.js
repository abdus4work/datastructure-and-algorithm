// Left rotate the array by D places

/**
 * Approach 1: Using temp array
 * 1. Create a temp array of size n
 * 2. Copy elements from D to n to temp array
 * 3. Copy elements from 0 to D to temp array
 * 4. Copy temp array to original array
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * @param {number[]} arr 
 * @param {number} D
 * @returns void
 */
function leftRotateByDApproach1(arr,d){
  let n = arr.length;
  d=d%n;
  if(n<2 || d==0) return;
  let temp=new Array(n);
  let i=0;
  // Copy elements from D to n to temp array
  for(let j=d;j<n;j++){
    temp[i++]=arr[j];
  }
  // Copy elements from 0 to D to temp array
  for(let j=0;j<d;j++){
    temp[i++]=arr[j];
  }
  // Copy temp array to original array
  for(let j=0;j<n;j++){
    arr[j]=temp[j];
  }

}

/**
 * Approach 2: Observation from approach 1
 * 1. Create a temp array of size D
 * 2. Copy elements from 0 to D to temp array
 * 3. Shift elements from D to n to left by D places
 * 4. Copy temp array to original array
 * Time Complexity: O(n)
 * Space Complexity: O(D) Where D is the number of places to rotate
 */

function leftRotateByDApproach2(arr,d){
  let n = arr.length;
  d=d%n;
  if(n<2 || d==0) return;
  let temp=new Array(d);
  // Copy elements from 0 to D to temp array
  for(let j=0;j<d;j++){
    temp[j]=arr[j];
  }
  // Shift elements from D to n to left by D places
  for(let j=d;j<n;j++){
    arr[j-d]=arr[j];
  }
  // Copy temp array to original array
  for(let j=0;j<d;j++){
    arr[n-d+j]=temp[j];
  }
}

/**
 * Approach 3: Using Reversal Algorithm
 * 1. Reverse the array from 0 to D-1
 * 2. Reverse the array from D to n-1
 * 3. Reverse the whole array
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

function leftRotateByDApproach3(arr,d){
  let n = arr.length;
  d=d%n;
  if(n<2 || d==0) return;
  reverse(arr,0,d-1); // Reverse the array from 0 to D-1
  reverse(arr,d,n-1); // Reverse the array from D to n-1
  reverse(arr,0,n-1); // Reverse the whole array
}

function reverse(arr,start,end){
  while(start<end){
    let temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
  }
}

let arr=[1,2,3,4,5];

leftRotateByDApproach3(arr,2);
console.log(arr); // [3,4,5,1,2]