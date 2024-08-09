// Problem link : https://leetcode.com/problems/fibonacci-number/


/**
 *  Fibonacci number using recursion and memoization
 * 
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

let dp=new Array(35).fill(-1);
function fibb(n) {
    if(n<=1) return n;
    if(dp[n]!=-1) return dp[n];
    return dp[n]=fibb(n-1)+fibb(n-2);
}


/**
 * Fibonacci number using recursion
 * 
 * Time complexity: O(2^n)
 * Space complexity: O(n)
 * 
 */
function fib(n) {
  if (n <= 1) {
    return n;
  }
  return fib(n - 1) + fib(n - 2);
}

console.log(fibb(10)); // 55