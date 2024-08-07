
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
      let lastDigit = num % 10;
      reverse = reverse * 10 + lastDigit;
      num = Math.floor(num/10);
  }
  if (reverse == x) return true;
  else return false;
};

console.log(armstrongCheck(153));