# 6. [Perfect Number](https://leetcode.com/problems/perfect-number/)

# Table of Contents

- [BruteForce Approach](#BruteForce-Approach)
- [Optimal Approach](#Optimal-Approach)


# BruteForce Approach:

## Intuition:
Given a number, we need to find whether it is a perfect number or not. A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. For example, 28 is a perfect number because 28 = 1 + 2 + 4 + 7 + 14.

## Approach:
For a given number, we need to find all the divisors of the number and check whether the sum of all the divisors is equal to the number itself. If it is equal, then the number is a perfect number.

## Algorithm:
1. Initialize a variable sum to 0.
2. Iterate from 1 to num-1.
3. If num is divisible by i, then add i to sum.
4. If sum is equal to num, then return true.

## Dry Run:
Let's take num=28.
- i=1, 28%1=0, sum=0+1=1
- i=2, 28%2=0, sum=1+2=3
- i=3, 28%3!=0
- i=4, 28%4=0, sum=3+4=7
- i=5, 28%5!=0
- i=6, 28%6!=0
- i=7, 28%7=0, sum=7+7=14
- i=8, 28%8!=0
- i=9, 28%9!=0
- i=10, 28%10!=0
- i=11, 28%11!=0
- i=12, 28%12!=0
- i=13, 28%13!=0
- i=14, 28%14=0, sum=14+14=28
- i=15, 28%15!=0
- i=16, 28%16!=0
- i=17, 28%17!=0
- i=18, 28%18!=0
- i=19, 28%19!=0
- i=20, 28%20!=0
- i=21, 28%21!=0
- i=22, 28%22!=0
- i=23, 28%23!=0
- i=24, 28%24!=0
- i=25, 28%25!=0
- i=26, 28%26!=0
- i=27, 28%27!=0
- Loop ends. sum=28. Return true.

## Code:

```JS
/**
 * Checks if a number is a perfect number.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is a perfect number, otherwise returns false.
 */
let checkPerfectNumberBruteForce=(num)=>{
  let sum=0;
  for(let i=1;i<num;i++){
    if(num%i==0) sum+=0;
  }
  return sum==num;
}
```
```Java
/**
   * Checks if a given number is a perfect number using a brute force approach.
   * 
   * @param num The number to be checked.
   * @return True if the number is a perfect number, false otherwise.
   */
  public static boolean checkPerfectNumberBruteForce(int num){
    int sum=0;
    for(int i=1;i<num;i++){
      if(num%i==0) sum+=i;
    }
    return sum==num;
  }
```

## Time Complexity: `O(N)`
The time complexity is `O(N)` because we are iterating from 1 to num-1.

## Space Complexity: `O(1)`
The space complexity is `O(1)` because we are using only a constant amount of space.



# Optimal Approach:

## Intuition:
Given a number, we need to find whether it is a perfect number or not. A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. For example, 28 is a perfect number because 28 = 1 + 2 + 4 + 7 + 14.

## Approach:
We need to find all the divisors of the number. In this approach we will find the divisors of the number by iterating from 1 to sqrt(num). If i is a divisor of num, then both i and num/i are divisors of num. We will add both i and num/i to the sum. If i is equal to num/i and i is not equal to original number, then we will add only i to the sum.

## Algorithm:
1. Initialize a variable sum to 0.
2. Iterate from 1 to sqrt(num).
3. If num is divisible by i, then add i to sum.
4. If i is not equal to num and num/i is not equal to num, then add num/i to sum.
5. If sum is equal to num, then return true.

## Dry Run:
Let's take num=28.
- i=1, 28%1=0, sum=0+1=1, N=28/1=28==num (false)
- i=2, 28%2=0, sum=1+2=3, N=28/2=14!=num (true), sum=3+14=17
- i=3, 28%3!=0
- i=4, 28%4=0, sum=17+4=21, N=28/4=7!=num (true), sum=21+7=28 
- i=5, 28%5!=0
- Loop ends. sum=28. Return true.

## Code:

```JS
/**
 * Checks if a number is a perfect number.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is a perfect number, otherwise returns false.
 */
var checkPerfectNumber = function(num) {
  let sum=0;
  for(let i=1;i*i<num;i++){
      if(num%i==0 && i!=num){
          sum+=i;
          let N=Math.floor(num/i);
          if(N!=i && N!=num) sum+=N;
      }
  }
  return sum==num;
};
```

```Java
/**
   * Checks if a given number is a perfect number.
   * 
   * @param num the number to be checked
   * @return true if the number is a perfect number, false otherwise
   */
  public static boolean checkPerfectNumber(int n) {
    int sum = 0;
    for (int i = 1; i * i < n; i++) {
      if (n % i == 0) {
        sum += i;
        if ((n / i) != i && (n/i)!=n)
          sum += (n / i);
      }
    }
    return sum == n ;
  }
```

## Time Complexity: `O(sqrt(N))`
The time complexity is `O(sqrt(N))` because we are iterating from 1 to sqrt(num).

## Space Complexity: `O(1)`
The space complexity is `O(1)` because we are using only a constant amount of space.