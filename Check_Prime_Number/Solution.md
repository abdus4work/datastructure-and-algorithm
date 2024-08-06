# []()

# Table of Contents

- [BruteForce Approach](#BruteForce-Approach)
- [Optimal Approach](#Optimal-Approach)


# BruteForce Approach:

## Intuition:
A number is prime if it has exactly 2 divisors. So, we can check if a number is prime by counting the number of divisors it has. If the number of divisors is 2, then the number is prime.

## Approach:
Loop through 1 to N and check if the number is divisible by the current number. If it is divisible, increment the count. If the count is 2, then the number is prime.

## Algorithm:
1. Initialize a variable count to 0.
2. Loop through 1 to N.
3. Check if the number is divisible by the current number.
4. If it is divisible, increment the count.
5. If the count is 2, return true.

## Dry Run:
Let's take N=5
- i=1, 5%1==0, count=1
- i=2, 5%2!=0
- i=3, 5%3!=0
- i=4, 5%4!=0
- i=5, 5%5==0, count=2

## Code:

```JS
/**
 * Checks if a given number is prime using brute force method.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is prime, false otherwise.
 */
let checkPrimeBruteForce=(num)=>{
  let count = 0;
  for(let i=1;i<=num;i++){
    if(num%i==0) count++;
  }
  return count==2;
}
```

```Java
/**
   * Checks if a given number is a prime number using a brute force approach.
   *
   * @param num the number to be checked
   * @return true if the number is prime, false otherwise
   */
  public static boolean checkPrimeBruteForce (int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0)
        count++;
    }
    return count == 2;
  }
```

## Time Complexity: `O(N)`
The time complexity of this approach is `O(N)` because we are iterating from 1 to N.

## Space Complexity: `O(1)`
The space complexity of this approach is `O(1)` because we are using only a constant amount of space.


# Optimal Approach:

## Intuition:
A number is prime if it has exactly 2 divisors. So, we can check if a number is prime by counting the number of divisors it has. If the number of divisors is 2, then the number is prime.

## Approach:
In this approach we loop through 1 to sqrt(N) and check if the number is divisible by the current number and check if N/i is not equal to i then increment the count. If the count is 2, then the number is prime.

## Algorithm:
1. Initialize a variable count to 0.
2. Loop through 1 to sqrt(N).
3. Check if the number is divisible by the current number.
4. If it is divisible, increment the count.
5. If N/i is not equal to i, increment the count.
6. If the count is 2, return true.

## Dry Run:
Let's take N=9
- i=1
  - 1*1<=9 -> true
  - 9%1==0 -> true
  - count=1
  - 9/1 != 1 -> true
  - count=2
- i=2
  - 2*2<=9 -> true
  - 9%2!=0 -> false
- i=3
  - 3*3<=9 -> true
  - 9%3==0 -> true
  - count=3
  - 9/3!=3 -> false
- i=4
  - 4*4<=9 -> false
- Loop ends
- count!=2 -> false

## Code:

```JS
/**
 * Checks if a given number is prime.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is prime, otherwise false.
 */
let checkPrimeOptimal=(num)=>{
  let count = 0;
  for(let i=1;i*i<=num;i++){
    if(num%i==0){
      count++
      if(num/i!=i)
        count++;
    }
  }

  return count==2;
}
```

```Java
/**
   * Checks if a given number is a prime number.
   *
   * @param num the number to be checked
   * @return true if the number is prime, false otherwise
   */
  public static boolean checkPrimeOptimal(int num) {
    int count = 0;
    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        count++;
        if ((num / i) != i)
          count++;
      }
    }
    return count == 2;
  }
```

## Time Complexity: `O(sqrt(N))`
The time complexity of this approach is `O(sqrt(N))` because we are iterating from 1 to sqrt(N).

## Space Complexity: `O(1)`
The space complexity of this approach is `O(1)` because we are using only a constant amount of space.