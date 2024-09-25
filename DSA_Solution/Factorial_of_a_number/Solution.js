// Problem : Find factorial of a number

/**
 * 
 * Time complexity - O(num)
 * Space complexity - O(num)
 * 
 * @param {number} num 
 * @returns 
 */
function fact(num){
  if(num<2) return 1;
  return num*fact(num-1);
}

console.log(fact(5));
