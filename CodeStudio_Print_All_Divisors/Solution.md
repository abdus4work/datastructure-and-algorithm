# 5. [Print all divisors](https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188?leftPanelTabValue=PROBLEM)

# Table of Contents

1. [BruteForce Approach](#BruteForce-Approach)
2. [Better Approach](#Better-Approach)
3. [Optimal Approach](#Optimal-Approach)


# BruteForce Approach:

## Intuition:
Print all the divisors of a number.

## Approach:
We can iterate from 1 to n and check if n is divisible by i. If it is, then we add i to the list of divisors.

## Algorithm:
1. Create an empty list to store the divisors.
2. Iterate from 1 to n.
3. Check if n is divisible by i.
4. If it is, add i to the list of divisors.
5. Return the list of divisors.

## Dry Run:
Let's take an example where n = 12.
1. We start with an empty list.
2. We iterate from 1 to 12.
3. For i = 1, 12 % 1 = 0. So, we add 1 to the list.
4. For i = 2, 12 % 2 = 0. So, we add 2 to the list.
5. For i = 3, 12 % 3 = 0. So, we add 3 to the list.
6. For i = 4, 12 % 4 = 0. So, we add 4 to the list.
7. For i = 5, 12 % 5 != 0. So, we don't add 5 to the list.
8. For i = 6, 12 % 6 = 0. So, we add 6 to the list.
9. For i = 7, 12 % 7 != 0. So, we don't add 7 to the list.
10. For i = 8, 12 % 8 != 0. So, we don't add 8 to the list.
11. For i = 9, 12 % 9 = 0. So, we add 9 to the list.
12. For i = 10, 12 % 10 != 0. So, we don't add 10 to the list.
13. For i = 11, 12 % 11 != 0. So, we don't add 11 to the list.  
14. For i = 12, 12 % 12 = 0. So, we add 12 to the list.

## Code:

```Java
/**
   * Calculates and returns a list of all divisors of a given number using a brute
   * force approach.
   *
   * @param num the number for which to find divisors
   * @return a list of integers representing the divisors of the given number
   */
  public static List<Integer> printAllDivisorsBruteForce(int num) {
    List<Integer> divisors = new ArrayList<>();

    for (int i = 1; i <= num; i++) {
      if (num % i == 0)
        divisors.add(i);
    }
    return divisors;
  }
```

```JS
/**
 * Calculates and returns an array of all divisors of a given number.
 *
 * @param {number} num - The number to calculate divisors for.
 * @returns {number[]} - An array containing all the divisors of the given number.
 */
let printAllDivisorsBruteForce = (num) => {
  let divisors = new Array();
  for (let i = 1; i <= num; i++) {
    if (num % i == 0) divisors.push(i);
  }
  return divisors;
};
```

## Time Complexity: `O(n)`
The time complexity is `O(n)` because we are iterating from 1 to n.

## Space Complexity: `O(n)`
The space complexity is `O(n)` because we are storing all the divisors in a list.


# Optimal Approach:

## Intuition:
Print all the divisors of a number.

## Approach:
We can iterate from 1 to sqrt(n) and check if n is divisible by i. If it is, then we add i to the list of divisors and n/i as well.

## Algorithm:
1. Create an empty list to store the divisors.
2. Iterate from 1 to sqrt(n).
3. Check if n is divisible by i.
4. If it is, add i to the list of divisors and n/i as well. (if i != n/i)
5. Return the list of divisors.

## Dry Run:
Let's take an example where n = 12.

1. We start with an empty list.
2. We iterate from 1 to sqrt(12) = 3.
3. For i = 1, 12 % 1 = 0. So, we add 1 to the list and 12/1 = 12 to the list.
4. For i = 2, 12 % 2 = 0. So, we add 2 to the list and 12/2 = 6 to the list.
5. For i = 3, 12 % 3 = 0. So, we add 3 to the list and 12/3 = 4 to the list.
6. Loop ends.
7. Sort the list.
8. Return the list. [1, 2, 3, 4, 6, 12]

## Code:
```Java
/**
   * Calculates and returns a list of all divisors of a given number.
   *
   * @param num the number for which to find divisors
   * @return a sorted list of all divisors of the given number
   * 
   */
  public static List<Integer> printAllDivisorsOptimize(int num) {
    List<Integer> divisors = new ArrayList<>();

    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        divisors.add(i);
        if (i != (num / i)) {
          divisors.add(num / i);
        }
      }
    }
    divisors.sort((a, b) -> a - b);
    return divisors;
  }
```

```JS
/**
 * Calculates and returns an array of all divisors of a given number.
 *
 * @param {number} num - The number to calculate divisors for.
 * @returns {number[]} - An array containing all the divisors of the given number.
 */
let printAllDivisorsOptimize = (num) => {
  let divisors = new Array();
  for (let i = 1; i * i <= num; i++) {
    if (num % i == 0) {
      divisors.push(i);

      if (i !== Math.floor(num / i)) {
        divisors.push(Math.floor(num / i));
      }
    }
  }
  divisors.sort((a, b) => a - b);
  return divisors;
};
```

## Time Complexity: `O(sqrt(n))` 
The time complexity is `O(sqrt(n))` because we are iterating from 1 to sqrt(n).

if we consider the time complexity of sorting the list, it would be `O(sqrt(n) * log(sqrt(n)))` which is equivalent to `O(sqrt(n) * log(n))`.

## Space Complexity: `O(sqrt(n))`
The space complexity is `O(sqrt(n))` because we are storing all the divisors in a list.