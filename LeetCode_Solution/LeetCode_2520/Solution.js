// Problem Link: https://leetcode.com/problems/self-dividing-numbers/


/**
 * Counts the number of digits in a given number that divide the number itself.
 * 
 * Time Complexity: O(log(num))
 * Space Complexity: O(1)
 * 
 * @param {number} num - The number to be checked.
 * @returns {number} - The number of digits that divide the number itself.
 */
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


let num = 121;

let countDigit=countDigits(num);

console.log(countDigit);