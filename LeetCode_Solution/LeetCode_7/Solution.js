/**
 * Problem URL: https://leetcode.com/problems/reverse-integer/
 * 
 * 
 * Time Complexity: O(log(x))
 * Space Complexity: O(1)
 * 
 */



/**
 * 
 * @param {number} x 
 * @returns number
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