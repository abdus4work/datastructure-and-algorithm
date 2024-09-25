// Problem: Print something N times using recursion

function printNTimes(count, num) {
  if (count > num) return;
  console.log(count);
  printNTimes(count + 1, num);
}

printNTimes(1, 10);
