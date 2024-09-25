/**
 *  Problem Link: https://leetcode.com/problems/palindrome-number/
 * 
 * Time Complexity: O(log(x))
 * Space Complexity: O(1)
 */




/**
 * Checks if a given number is a palindrome.
 *
 * @param {number} x - The number to be checked.
 * @returns {boolean} - Returns true if the number is a palindrome, false otherwise.
 */
var isPalindrome = function (x) {
  let num = x;
  let reverse = 0;
  while (num > 0) {
      let lastDigit = num % 10; // Extracting the last digit of the number.
      reverse = reverse * 10 + lastDigit; // Reversing the number.
      num = Math.floor(num/10);
  }
  if (reverse == x) return true; // If the reversed number is equal to the original number, then it is a palindrome.
  else return false;
};

console.log(armstrongCheck(153));