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

console.log(printAllDivisorsBruteForce(36));
console.log(printAllDivisorsOptimize(36));
