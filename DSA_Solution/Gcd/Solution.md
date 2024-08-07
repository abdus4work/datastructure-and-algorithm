# []()

# Table of Contents

- [BruteForce Approach](#BruteForce-Approach)
- [Better Approach](#Better-Approach)
- [Optimal Approach](#Optimal-Approach)


# BruteForce Approach:

## Intuition:
Find the greatest number that divides both the numbers.

## Approach:
Loop from 1 to the minimum of the two numbers and check if the number divides both the numbers.

## Algorithm:
1. Initialize a variable `gcd` to 1.
2. Find the minimum of the two numbers.
3. Loop from 1 to the minimum of the two numbers.
4. Check if the number divides both the numbers.
5. If it does, update the `gcd` to the current number.
6. Return the `gcd`.

## Dry Run:
Let's take `n1=12` and `n2=9`.

- `min=9`
- Loop from 1 to 9.
  - `i=1`
    - `12%1=0` and `9%1=0` => `gcd=1`
  - `i=2`
    - `12%2=0` and `9%2=1` => `gcd=1`
  - `i=3`
    - `12%3=0` and `9%3=0` => `gcd=3`
  - `i=4`
    - `12%4=0` and `9%4=1` => `gcd=3`
  - `i=5`
    - `12%5=2` and `9%5=4` => `gcd=3`
  - `i=6`
    - `12%6=0` and `9%6=3` => `gcd=6`
  - `i=7`
    - `12%7=5` and `9%7=2` => `gcd=6`
  - `i=8`
    - `12%8=4` and `9%8=1` => `gcd=6`
  - `i=9`
    - `12%9=3` and `9%9=0` => `gcd=9`

## Code:

```JS
/**
 * Calculates the greatest common divisor (GCD) of two numbers.
 *
 * @param {number} n1 - The first number.
 * @param {number} n2 - The second number.
 * @returns {number} The greatest common divisor of n1 and n2.
 */
let gcd = (n1,n2)=>{
  let gcd=1;
  let min = Math.min(n1,n2);
  for(let i=0;i<=min;i++){
    if(n1%i==0 && n2%i==0){
      gcd=i;
    }
  }
  return gcd;
}
```

```Java
public static int gcdBruteForce(int N1, int N2) {
    int gcd = 1;
    int min = Math.min(N1, N2);
    for (int i = 1; i <= min; i++) {
      if (N1 % i == 0 && N2 % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }
```

## Time Complexity: `O(min(n1,n2))`
The time complexity is `O(min(n1,n2))` because we are looping from 1 to the minimum of the two numbers.

## Space Complexity: `O(1)`
The space complexity is `O(1)` because we are using only a constant amount of space.

# Better Approach:

## Intuition:
Intuition is same as the brute force approach.

## Approach:
Instead of looping from 1 to the minimum of the two numbers, we can loop from the minimum of the two numbers to 1. The worst case time complexity remains the same but the average time complexity is reduced.

## Algorithm:
1. Find the minimum of the two numbers.
2. Loop from the minimum of the two numbers to 1.
3. Check if the number divides both the numbers.
4. If it does, return the number.
5. If no number divides both the numbers, return 1.

## Dry Run:
Let's take `n1=12` and `n2=9`.

- `min=9`
- Loop from 9 to 1.
  - `i=9`
    - `12%9=3` and `9%9=0` => `gcd=9`
    - Return 9

## Code:

```JS
let gcdBetter=(n1,n2)=>{
  let min=Math.min(n1,n2);
  for(let i=min;i>=1;i++){
    if(n1%i==0 && n2%i==0) return i;
  }
  return 1;
}
```

```Java
public static int gcdBetter(int n1, int n2){
    
    int min = Math.min(n1,n2);
    for(int i=min; i>=1; i++){
      if(n1%i==0 && n2%i==0){
        return i;
      }
    }
    return 1;
  }
```

## Time Complexity: `O(min(n1,n2))`
The time complexity is `O(min(n1,n2))` because we are looping from the minimum of the two numbers to 1.


## Space Complexity: `O(1)`
The space complexity is `O(1)` because we are using only a constant amount of space.

# Optimal Approach:

## Intuition:
The Euclidean algorithm is an efficient way to find the greatest common divisor of two numbers.

## Approach:
The Euclidean algorithm is based on the fact that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number.


## Algorithm:
1. If `n1` is 0, return `n2`.
2. If `n2` is 0, return `n1`.
3. Return the greatest common divisor of `n2` and `n1%n2`.

## Dry Run:
Let's take `n1=12` and `n2=9`.

- `n1=12` and `n2=9`
- `n1=9` and `n2=12%9=3`
- `n1=3` and `n2=9%3=0`
- `n1=3` and `n2=0`
- Return 3

## Code:

```JS
let gcdOptimal=(n1,n2)=>{
  if(n1==0) return n2;
  if(n2==0) return n1;
  return gcdOptimal(n2,n1%n2);
}
```

```Java
public static int gcdOptimal(int n1, int n2){
    if(n1==0) return n2;
    if(n2==0) return n1;
    return gcdOptimal(n2, n1%n2);
  }
```

## Time Complexity: `O(log(min(n1,n2)))`
The time complexity is `O(log(min(n1,n2)))` because the Euclidean algorithm reduces the problem size by a factor of 2 in each iteration.

## Space Complexity: `O(1)`
The space complexity is `O(1)` because we are using only a constant amount of space.