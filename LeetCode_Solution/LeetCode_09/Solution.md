# 3. [Palindrome](https://leetcode.com/problems/palindrome-number)

# Intuition:

Reverse the number and check if it is equal to the original number.

# Approach:

1. If the number is negative, return False.
2. Reverse the number and check if it is equal to the original number.
3. If it is equal, return True, else return False.

# Algorithm:

- If the number is negative, return False.
- Initialize a variable `rev` to 0.
- While the number is greater than 0, do the following:
  - Multiply `rev` by 10 and add the remainder of the number when divided by 10.
  - Divide the number by 10.
  - Repeat the above steps until the number is greater than 0.
- If the reversed number is equal to the original number, return True, else return False.

# Code:

```JS
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
```

```Java
/**
 * Determines whether a given integer is a palindrome.
 *
 * @param x the integer to check for palindrome
 * @return true if the integer is a palindrome, false otherwise
 */
  public static boolean isPalindrome(int x) {
    int num = x;
    int reverse = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      reverse = reverse * 10 + lastDigit;
      num /= 10;
    }
    if (reverse == x)
      return true;
    else
      return false;
  }
```

## Time Complexity: `O(log10(n))`

## Space Complexity: `O(1)`
