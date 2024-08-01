# [LeetCode-2520: Count the Digits That Divide a Number](https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/)

# Problem Statement:

Given an integer `num`, return *the number of digits in `num` that divide* `num`.

An integer `val` divides `nums` if `nums % val == 0`.

### Examples:

**Example 1:**

```
Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.

```

**Example 2:**

```
Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

```

**Example 3:**

```
Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
```

## Intuition:

Count the digits that evenly divide the number itself

## Approach:

- Initialize counter to 0
- Extract digits using a loop
- check if the digit is not zero and the num %digit is equal to zero then increase the counter.

## Code:

```java
public int countDigits(int n) {
        int count=0;
        int num=n;
        while(num>0){
            int digit=num%10;
            if(digit!=0 && (n%digit==0)) count++;
            num/=10;
        }
        return count;
    }
```

```jsx
var countDigits = function(num) {
    let count = 0;
    let n = num;
    while(n>0){
        let digit=n%10;
        if(digit!==0 && num%digit===0) count++;
        n=Math.floor(n/10);
    }
    return count;
};
```

## Edge Cases:

- Number is 0: Should return 0 since division by zero is not defined.

## Time Complexity:  `O(n)`

## Space Complexity:  `O(1)`