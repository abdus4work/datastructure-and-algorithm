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