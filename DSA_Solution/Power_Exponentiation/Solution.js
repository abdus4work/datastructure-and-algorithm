function power(x,n){
  let ans=1;
  for(let i=1;i<=n;i++){
    ans*=x;
  }
  return ans;
}
function powerOptimal( x,  n){
  let ans=1;
  while(n>0){
    if(n%2==1){
      ans*=x;
      n--;
    }
    else{
      n/=2;
      x *=x;
    }
  }
  return ans;
}