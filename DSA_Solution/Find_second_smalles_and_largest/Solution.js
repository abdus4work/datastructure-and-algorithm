/**
 * Find the second smallest and second largest element in an array of integers 
 * 
 * Approach: Sort the array and return the second element as the second smallest and second last element as the second largest
 * 
 * Time complexity: O(n log n)
 * Space complexity: O(1)
 * 
 * @param {number[]} arr
 * @returns {void}
 */

function secondSmallestAndLargest(arr){
  if(arr.length<2) console.log(-1);
  arr.sort((a,b)=>a-b);
  console.log(`Second smallest: ${arr[1]}`);
  console.log(`Second largest: ${arr[arr.length-2]}`);
}

/**
 * Find the second smallest and second largest element in an array of integers
 * 
 * Approach: Iterate through the array and keep track of the second smallest and second largest elements found so far using two variables 
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
function secondSmallestAndLargestApproach2(arr){
  if(arr.length<2) console.log(-1);
  let max=Number.MIN_SAFE_INTEGER;
  let secondMax=Number.MIN_SAFE_INTEGER;
  let min=Number.MAX_SAFE_INTEGER;
  let secondMin=Number.MAX_SAFE_INTEGER;

  for(let i=0;i<arr.length;i++){
    if(arr[i]>max){
      secondMax=max;
      max=arr[i];
    }else if(arr[i]>secondMax && arr[i]!=max){
      secondMax=arr[i];
    }

    if(arr[i]<min){
      secondMin=min;
      min=arr[i];
    }else if(arr[i]<secondMin && arr[i]!=min){
      secondMin=arr[i];
    }
  }
  console.log(`Second smallest: ${secondMin}`);
  console.log(`Second largest: ${secondMax}`);
}

secondSmallestAndLargest([5,3,8,4,2]); // 3, 5
secondSmallestAndLargestApproach2([5,3,8,4,2]); // 3, 5