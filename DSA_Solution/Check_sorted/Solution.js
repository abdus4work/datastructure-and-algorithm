
/**
 * Check if the given array is sorted or not 
 * 
 * Approach: Iterate through the array and check if the current element is greater than the next element
 * 
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 * 
 * @param {number[]} arr 
 * @returns {void} 
 */
function checkSorted(arr){
  let flag=true;
  for(let i=0;i<arr.length;i++){
    for(let j=i+1;j<arr.length;j++){
      if(arr[i]>arr[j]){
        flag=false;
        break;
      }
    }
  }
  if(flag) console.log("Yes");
  else console.log("No");
}


/**
 * Check if the given array is sorted or not
 * 
 * Approach: Iterate through the array and check if the current element is greater than the next element 
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
function checkSortedApproach2(arr){
  let flag=true;
  for(let i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
      flag=false;
      break;
    }
  }
  if(flag) console.log("Yes");
  else console.log("No");
}

checkSorted([5,3,8,4,2]); // No
checkSortedApproach2([5,3,8,4,2]); // No