// Problem : Sum of first N numbers using recursion

function sumOfNNumbers(num) {
  if (num == 1) return 1;
  return num + sumOfNNumbers(num - 1);
}

console.log(sumOfNNumbers(10));
