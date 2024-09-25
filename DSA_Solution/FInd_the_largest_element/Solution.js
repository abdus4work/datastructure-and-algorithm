/**
 * Find the largest element in the array
 *
 * Approach-1: Sort the array and return the last element of the array
 *
 * Time complexity: O(n log n)
 *
 * Space complexity: O(1)
 *
 * @param {Array} arr
 * @returns {number}
 */
function largestElement(arr) {
  arr.sort((a, b) => a - b);
  return arr[arr.length - 1];
}

/**
 * Find the largest element in the array
 *
 * Approach-2: Use two pointers to find the largest element in the array
 *
 * Time complexity: O(n)
 *
 * Space complexity: O(1)
 *
 * @param {number[]} arr
 * @returns {number}
 */

function largestElementApproach2(arr) {
  let i = 0;
  let j = arr.length - 1;
  while (i < j) {
    if (arr[i] < arr[j]) {
      i++;
    } else {
      j--;
    }
  }
  return arr[i];
}

/**
 * Find the largest element in the array
 * 
 * Approach-3: Iterate through the array and keep track of the maximum element found so far
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 * 
 * @param {number[]} arr
 * @returns {number}
 */
function largestElementApproach3(arr) {
  let max = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

console.log(largestElement([5, 3, 8, 4, 2])); // 8
console.log(largestElementApproach2([5, 3, 8, 4, 2])); // 8
console.log(largestElementApproach3([5, 3, 8, 4, 2])); // 8