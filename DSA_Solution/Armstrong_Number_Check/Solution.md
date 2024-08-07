# 4. [Armstrong Number]()

# Intuition:
Extract the digits of the number and check if digit raised to the power of the number of digits is equal to the number itself.

# Approach:
1. Count the number of digits in the number.
2. Extract the digits of the number.
3. Check if the sum of the digits raised to the power of the number of digits is equal to the number itself.
4. Check if the sum is equal to the number itself.
5. Return true if the number is equal to the sum, else return false.


# Algorithm:
1. Count the number of digits in the number.
2. Initialize a variable `sum` to 0.
3. Extract the digits of the number.
4. For each digit, raise it to the power of the number of digits and add it to the sum. `sum += Math.pow(digit, n);`
5. Check if the sum is equal to the number itself.
6. Return true if the number is equal to the sum, else return false.

# Code:
```JavaScript
/**
 * Checks if a given number is an Armstrong number.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is an Armstrong number, otherwise false.
 */
let armstrongCheck = (num) => {
  let dup = num;
  let pow = 0;
  let sum = 0;
  while (dup > 0) {
    pow++;
    dup = Math.floor(dup / 10);
  }
  dup = num;
  while (dup > 0) {
    let digit = dup % 10;
    sum = sum + Math.pow(digit, pow);
    dup = Math.floor(dup / 10);
  }

  return sum == num ? true : false;
};
```
```Java
/**
 * Checks if a given number is an Armstrong number.
 *
 * @param num the number to be checked
 * @return true if the number is an Armstrong number, false otherwise
 */
  public static boolean armstrongCheck(int num) {
    int dup = num;
    int sum = 0;
    int pow = 0;
    while (dup > 0) {
      pow++;
      dup /= 10;
    }
    dup = num;
    while (dup > 0) {
      int digit = dup % 10;
      sum = (int) (sum + Math.pow((double) digit, (double) pow));
      dup /= 10;
    }
    if (num == sum)
      return true;
    else
      return false;
  }
```



## Time Complexity: `O(log(n))`

## Space Complexity: `O(1)`