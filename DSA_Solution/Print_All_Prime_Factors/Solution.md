# [Print all prime factors of a number]()

# Table of Contents

- [BruteForce Approach](#BruteForce-Approach)
- [Better Approach](#Better-Approach)
- [Optimal Approach](#Optimal-Approach)


# BruteForce Approach:

## Intuition:
Find all the factors of the number and check if the factor is prime or not.

## Approach:
1. Create a function isPrime to check if the number is prime or not.
2. Create a function printAllPrimeFactor to find all the prime factors of the number.

## Algorithm:
1. Create a function isPrime which takes a number as input and returns true if the number is prime else returns false.
2. In the PrintAllPrimeFactor function, create a list to store all the prime factors of the number.
3. Iterate from 2 to the number.
4. Check if the number is divisible by i.
5. If the number is divisible by i, check if i is prime or not.
6. If i is prime, add i to the list.
7. Return the list.

## Dry Run:
Let's dry run the algorithm with num = 12.
- `num = 12`
- Iterate from 2 to 12.
  - `i = 2`
    - 12 % 2 = 0
    - Check if 2 is prime or not.
    - 2 is prime.
    - Add 2 to the list.
  - `i = 3`
    - 12 % 3 = 0
    - Check if 3 is prime or not.
    - 3 is prime.
    - Add 3 to the list.
  - `i = 4`
    - 12 % 4 = 0
    - Check if 4 is prime or not.
    - 4 is not prime.
  - `i = 5`
    - 12 % 5 !=0
    - Continue.
  - `i = 6`
    - 12 % 6 = 0
    - Check if 6 is prime or not.
    - 6 is not prime.
  - `i = 7`
    - 12 % 7 !=0
    - Continue.
  - `i = 8`
    - 12 % 8 !=0
    - Continue.
  - `i = 9`
    - 12 % 9 !=0
    - Continue.
  - `i = 10`
    - 12 % 10 !=0
    - Continue.
  - `i = 11`
    - 12 % 11 !=0
    - Continue.
  - `i = 12`
    - 12 % 12 = 0
    - Check if 12 is prime or not.
    - 12 is not prime.

## Code:

```JS
//? Brute Force Approach
function isPrime( num){
  if(num <= 1){
    return false;
  }
  for(let i = 2; i <= Math.sqrt(num); i++){
    if(num % i == 0){
      return false;
    }
  }
  return true;
}

function printAllPrimeFactor( num){
  let list= new Array();
  for(let i=2;i<=num;i++){
    if(num%i==0){
      if(isPrime(i)){
        list.push(i);
      }
    }
  }
  return list;
}
```

```Java
//? Brute Force Approach
  public static boolean isPrime(int num){
    if(num <= 1){
      return false;
    }
    for(int i = 2; i <= Math.sqrt(num); i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
  
  public static List<Integer> printAllPrimeFactor(int num){
    List<Integer> list = new ArrayList<>();
    for(int i=2;i<=num;i++){
      if(num%i==0){
        if(isPrime(i)){
          list.add(i);
        }
      }
    }
    return list;
  }
```

## Time Complexity: `O(n*sqrt(n))`
The time complexity of this approach is `O(n*sqrt(n))` because we are iterating from 2 to n and checking if the number is prime or not. prime number checking takes `O(sqrt(n))` time.

## Space Complexity: `O(n)`
The space complexity of this approach is `O(n)` because we are storing all the prime factors of the number in the list.

# Better Approach:

## Intuition:
Find all the factors till the square root of the number and check if the factor is prime or not.

## Approach:
1. Create a function isPrime to check if the number is prime or not.
2. Create a function printAllPrimeFactor to find all the prime factors of the number till the square root of the number.

## Algorithm:
1. Create a function isPrime which takes a number as input and returns true if the number is prime else returns false.
2. In the PrintAllPrimeFactor function, create a list to store all the prime factors of the number.
3. Iterate from 2 to the square root of the number.
4. Check if the number is divisible by i.
5. If the number is divisible by i, check if i is prime or not.
6. If i is prime, add i to the list.
7. Check if the number/i is not equal to i and the number/i is prime.
8. If the above condition is true, add number/i to the list.
9. Return the list.

## Dry Run:
Let's dry run the algorithm with num = 60.
- `num = 60`
- `list = []`
- Iterate from 2 to sqrt(60) = 7.
  - `i = 2`
    - 60 % 2 = 0
    - Check if 2 is prime or not.
    - 2 is prime.
    - Add 2 to the list.
    - `list = [2]`
    - Check if 60/2 = 30 is not equal to 2 and 30 is prime.
    - 30 is not prime.
  - `i = 3`
    - 60 % 3 = 0
    - Check if 3 is prime or not.
    - 3 is prime.
    - Add 3 to the list.
    - `list = [2,3]`
    - Check if 60/3 = 20 is not equal to 3 and 20 is prime.
    - 20 is not prime.
  - `i = 4`
    - 60 % 4 != 0
    - Continue.
  - `i = 5`
    - 60 % 5 = 0
    - Check if 5 is prime or not.
    - 5 is prime.
    - Add 5 to the list.
    - `list = [2,3,5]`
    - Check if 60/5 = 12 is not equal to 5 and 12 is prime.
    - 12 is not prime.
  - `i = 6`
    - 60 % 6 = 0
    - Check if 6 is prime or not.
    - 6 is not prime.
  - `i = 7`
    - 60 % 7 != 0
    - Continue.
- return `[2,3,5]`

## Code:

```JS
function isPrime( num){
  if(num <= 1){
    return false;
  }
  for(let i = 2; i <= Math.sqrt(num); i++){
    if(num % i == 0){
      return false;
    }
  }
  return true;
}

function printAllPrimeFactorBetter( num ){
  let list= new Array();
  for(let i=2;i*i<=num;i++){
    if(num%i==0){
      if(isPrime(i)){
        list.push(i);
      }
      let N= Math.floor(num/i);
      if(N!=i && isPrime(N)){
          list.push(N);
      }
    }
  }
  return list;
}

```

```Java
public static boolean isPrime(int num){
    if(num <= 1){
      return false;
    }
    for(int i = 2; i <= Math.sqrt(num); i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
  

public static List<Integer> printAllPrimeFactorsBetter(int num){
    List<Integer> list = new ArrayList<>();

    for(int i=2;i<Math.sqrt(num);i++){
      if(num%i==0){
        if(isPrime(i)) list.add(i);
        if(num/i!=i && isPrime(num/i)) list.add(num/i);
      }
    }

    return list;

  }

```

## Time Complexity: `O(sqrt(n)*2*sqrt(n))`
The time complexity of this approach is `O(sqrt(n)*sqrt(n))` because we are iterating from 2 to sqrt(n) and checking if the number is prime or not. prime number checking takes `O(sqrt(n))` time.

## Space Complexity: `O(n)`
The space complexity of this approach is `O(n)` because we are storing all the prime factors of the number in the list.

# Optimal Approach:

## Intuition:
The goal is to find all prime factors of a number efficiently. Instead of checking all numbers up to the given number, we only check up to the square root, as any factor larger than the square root would have a corresponding factor smaller than the square root.


## Approach:
1. Iterate from 2 to the square root of the number.
2. Check if the number is divisible by i.
3. If the number is divisible by i, add i to the list.
4. Divide the number by i until the number is not divisible by i.
5. Iterate till the square root of the number.
6. If the number is not equal to 1, add the number to the list.
7. Return the list.

## Algorithm:
1. Create a list to store all the prime factors of the number.
2. Iterate from 2 to the square root of the number.
3. Check if the number is divisible by i.
4. If the number is divisible by i, add i to the list.
5. Divide the number by i until the number is not divisible by i. 
6. If the number is not equal to 1, add the number to the list.
7. Return the list.
## Dry Run:
Let's dry run the algorithm with num = 60.
- `num = 60`
- `list = []`
- Iterate from 2 to sqrt(60) = 7.
  - `i = 2`
    - 60 % 2 = 0
    - Add 2 to the list.
    - `list = [2]`
    - Divide 60 by 2 until 60 is not divisible by 2.
    - `num/2 = 30` => `num/2 = 15`
    - `num = 15`
  - `i = 3`
    - 15 % 3 = 0
    - Add 3 to the list.
    - `list = [2,3]`
    - Divide 15 by 3 until 15 is not divisible by 3.
    - `num/3 = 5`
    - `num = 5`
  - `i = 4`
    - 5 % 4 != 0
    - Continue.
  - `i = 5`
    - 5 % 5 = 0
    - Add 5 to the list.
    - `list = [2,3,5]`
    - Divide 5 by 5 until 5 is not divisible by 5.
    - `num = 1`
  - `i = 6`
    - 1 % 6 != 0
    - Continue.
  - `i = 7`
    - 1 % 7 != 0
    - Continue.
  - return `[2,3,5]`

## Code:

```JS
function printAllPrimeFactorsOptimal(num){
  let list = new Array();
  for(let i=2;i<=Math.sqrt(num);i++){
    if(num%i==0){
      list.push(i);
      while(num%i==0){
        num=Math.floor(num/i);
      }
    }
  }
  if(num!=1) list.push(num)
  return list;
}

```

```Java
public static List<Integer> printAllPrimeFactorsOptimal(int num){
    List<Integer> list = new ArrayList<>();

    for(int i=2;i<Math.sqrt(num);i++){
      if(num%i==0){
        list.add(i);
        while(num%i==0){
          num=num/i;
        }
      }
    }
    if(num!=1) list.add(num);
    return list;
  }
```

## Time Complexity: `O(sqrt(n)*log(n))`
The time complexity of this approach is `O(sqrt(n)*log(n))` because we are iterating from 2 to sqrt(n) and dividing the number by i until the number is not divisible by i. The division operation takes `O(log(n))` time.

## Space Complexity: `O(n)`
The space complexity of this approach is `O(n)` because we are storing all the prime factors of the number in the list.