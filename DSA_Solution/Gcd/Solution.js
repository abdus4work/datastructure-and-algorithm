/**
 * Calculates the greatest common divisor (GCD) of two numbers.
 *
 * @param {number} n1 - The first number.
 * @param {number} n2 - The second number.
 * @returns {number} The greatest common divisor of n1 and n2.
 */

//? Brute Force Approach
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


//? Better Approach
let gcdBetter=(n1,n2)=>{
  let min=Math.min(n1,n2);
  for(let i=min;i>=1;i++){
    if(n1%i==0 && n2%i==0) return i;
  }
  return 1;
}

//? Optimal Approach
let gcdOptimal=(n1,n2)=>{
  if(n1==0) return n2;
  if(n2==0) return n1;
  return gcdOptimal(n2,n1%n2);
}