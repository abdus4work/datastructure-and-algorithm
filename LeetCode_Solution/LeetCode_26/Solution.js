// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/


/**
 * Approach 1: Using Set
 * We can use Set to store the unique elements of the array.
 * Then we can replace the elements of the array with the elements of the set.
 * Finally, we can return the size of the set.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * @param {number[]} nums
 * @return {number}
 */
function removeDuplicatesApproach1(nums){
  let set= new Set();
  for(let i=0;i<nums.length;i++){
    set.add(nums[i]);
  }
  for(let i=0;i<nums.length;i++){
    nums[i]=Array.from(set)[i];
  }
  return set.size;
}

/**
 * Approach 2: Using Two Pointers
 * We can use two pointers to solve this problem.
 * we can use one pointer to keep track of the unique elements and another pointer to iterate through the array.
 * 
 * Time Complexity: O(n) We are iterating through the array only once.
 * Space Complexity: O(1) We are not using any extra space.
 * 
 * @param {number[]} nums
 * @return {number}
 */

function removeDuplicatesApproach2(nums){
  let i=0;
  for(let j=1;j<nums.length;j++){
    if(nums[i]!==nums[j]){
      i++;
      nums[i]=nums[j];
    }
  }
  return i+1;
}

console.log(removeDuplicatesApproach1([1,1,2])) // 2
console.log(removeDuplicatesApproach2([1,1,2])) // 2