// Problem Link: https://leetcode.com/problems/valid-palindrome/

/**
 * Check if a string is a palindrome or not
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @param {string} s
 * @return {boolean}
 */

function isPalindrome(s) {
  s = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
  let left = 0;
  let right = s.length - 1;
  while (left < right) {
    if (s[left] !== s[right]) {
      return false;
    }
    left++;
    right--;
  }
  return true;
}

console.log(isPalindrome("Hello "));
