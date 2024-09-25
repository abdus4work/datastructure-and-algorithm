//? Brute Force Approach
function isPrime( num){
  if(num <= 1){
    return false;
  }
  for(let i = 2; i <= Math.sqrt(num); i++){
    if(num % i == 0){
      return false;
    }
  }
  return true;
}

function printAllPrimeFactorBruteForce( num){
  let list= new Array();
  for(let i=2;i<=num;i++){
    if(num%i==0){
      if(isPrime(i)){
        list.push(i);
      }
    }
  }
  return list;
}

function printAllPrimeFactorBetter( num ){
  let list= new Array();
  for(let i=2;i*i<=num;i++){
    if(num%i==0){
      if(isPrime(i)){
        list.push(i);
      }
      let N= Math.floor(num/i);
      if(N!=i && isPrime(N)){
          list.push(N);
      }
    }
  }
  return list;
}


function printAllPrimeFactorsOptimal(num){
  let list = new Array();
  for(let i=2;i<=Math.sqrt(num);i++){
    if(num%i==0){
      list.push(i);
      while(num%i==0){
        num=Math.floor(num/i);
      }
    }
  }
  if(num!=1) list.push(num)
  return list;
}

console.log(printAllPrimeFactorsOptimal(780));
