/**
 * Checks if a given number is prime using brute force method.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is prime, false otherwise.
 */
let checkPrimeBruteForce=(num)=>{
  let count = 0;
  for(let i=1;i<=num;i++){
    if(num%i==0) count++;
  }
  return count==2;
}

/**
 * Checks if a given number is prime.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is prime, otherwise false.
 */
let checkPrimeOptimal=(num)=>{
  let count = 0;
  for(let i=1;i*i<=num;i++){
    if(num%i==0){
      count++
      if(num/i!=i)
        count++;
    }
  }

  return count==2;
}