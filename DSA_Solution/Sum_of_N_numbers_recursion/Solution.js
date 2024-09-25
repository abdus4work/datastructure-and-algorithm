// Problem : Sum of first N numbers using recursion


/**
 * 
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) 
 * 
 * @param {number} num 
 * @returns number
 */
function sumOfNNumbers(num) {
  if (num == 1) return 1;
  return num + sumOfNNumbers(num - 1);
}

console.log(sumOfNNumbers(10));
