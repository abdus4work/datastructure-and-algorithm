# [Reverse Integer](https://leetcode.com/problems/reverse-integer/)


# Intuition: 
Extract the digits from the input integer and reverse them. If the reversed integer is out of the 32-bit signed integer range, return 0.

# Approach:
1. Extract the digits from the input integer.
2. Reverse the digits.
3. Check if the reversed integer is out of the 32-bit signed integer range.
4. Return the reversed integer.


# Code:
```JavaScript
/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
  let sum = 0;
  let num=Math.abs(x);
  while(num>0){
      let lastDigit=num%10;
      sum=sum*10 + lastDigit;
      num=Math.floor(num/10);
  }
  if(sum>(Math.pow(2,31)-1 )|| sum<(-Math.pow(2,31))) return 0;
  if(x>0) return sum;
  else return -sum;
};
```

```JAVA
public static int reverse(int x) {
    int sum = 0;
    int num = Math.abs(x);
    while (num > 0) {
      int lastDigit = num % 10;
      if (sum*10 > Integer.MAX_VALUE)
      return 0;
      sum = sum * 10 + lastDigit;
      num /= 10;
    }

    if (sum > Integer.MAX_VALUE) {
      return 0;
    } else {
      if (sum < Integer.MIN_VALUE) {
        return 0;
      } else {
        if (x < 0) {
          return -sum;
        } else
          return sum;
      }
    }
  }
```


## Time Complexity: `O(log(x))`

## Space Complexity:  `O(1)`