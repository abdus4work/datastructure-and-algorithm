# [Find power Exponentiation of an number]()

# Table of Contents

- [BruteForce Approach](#BruteForce-Approach)
- [Better Approach](#Better-Approach)
- [Optimal Approach](#Optimal-Approach)


# BruteForce Approach:

## Intuition:
Finding the power of a number is nothing but multiplying the number with itself n times.

## Approach:
We can multiply the number with itself n times to get the power of the number.

## Algorithm:
1. Initialize a variable ans=1.
2. Run a loop from 1 to n.
3. Multiply the number with ans.
4. Return the ans.

## Dry Run:
Let's take `x = 2` and `n = 3`
- `ans = 1`
- `i = 1`
  - `ans = 1 * 2 = 2`
- `i = 2`
  - `ans = 2 * 2 = 4`
- `i = 3 `
  - `ans = 4 * 2 = 8`
- Return 8

## Code:

```JS
function power(x,n){
  let ans=1;
  for(let i=1;i<=n;i++){
    ans*=x;
  }
  return ans;
}
```

```Java
public static int power(int x, int n){
    int ans=1;
    for(int i=1;i<=n;i++){
      ans*=x;
    }
    return ans;
  }
```

## Time Complexity: `O(n)`
The time complexity of this approach is `O(n)` as we are running a loop from 1 to n.

## Space Complexity: `O(1)`
The space complexity of this approach is `O(1)` as we are using only a constant amount of space.


# Optimal Approach:

## Intuition:

## Approach:

## Algorithm:

## Dry Run:

## Code:

```JS
function powerOptimal( x,  n){
  let ans=1;
  while(n>0){
    if(n%2==1){
      ans*=x;
      n--;
    }
    else{
      n/=2;
      x *=x;
    }
  }
  return ans;
}
```

```Java
public static int powerOptimal(int x, int n){
    int ans=1;
    while(n>0){
      if(n%2==1){
        ans*=x;
        n--;
      }
      else{
        n/=2;
        x *=x;
      }
    }
    return ans;
  }
```

## Time Complexity: `O(log(n))`
The time complexity of this approach is `O(log(n))` as we are dividing the power by 2 in each iteration.

## Space Complexity:  `O(1)`