/**
 * Checks if a given number is an Armstrong number.
 *
 * @param {number} num - The number to be checked.
 * @returns {boolean} - Returns true if the number is an Armstrong number, otherwise false.
 */
let armstrongCheck = (num) => {
  let dup = num;
  let pow = 0;
  let sum = 0;
  while (dup > 0) {
    pow++;
    dup = Math.floor(dup / 10);
  }
  dup = num;
  while (dup > 0) {
    let digit = dup % 10;
    sum = sum + Math.pow(digit, pow);
    dup = Math.floor(dup / 10);
  }

  return sum == num ? true : false;
};

console.log(armstrongCheck(153));
