//! BruteForce
/**
 * Checks if a number is a perfect number.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is a perfect number, otherwise returns false.
 */
let checkPerfectNumberBruteForce=(num)=>{
  let sum=0;
  for(let i=1;i<num;i++){
    if(num%i==0 && i!=num) sum+=0;
  }
  return sum==num;
}



//! Optimize Approach

/**
 * Checks if a number is a perfect number.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is a perfect number, otherwise returns false.
 */
var checkPerfectNumber = function(num) {
  let sum=0;
  for(let i=1;i*i<=num;i++){
      if(num%i==0 && i!=num){
          sum+=i;
          let N=Math.floor(num/i);
          if(N!=i && N!=num) sum+=N;
      }
  }
  return sum==num;
};