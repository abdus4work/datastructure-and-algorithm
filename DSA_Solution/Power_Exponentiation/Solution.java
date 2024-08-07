package DSA_Solution.Power_Exponentiation;


public class Solution {
  //? Power Exponentiation Brute Force

  public static int power(int x, int n){
    int ans=1;
    for(int i=1;i<=n;i++){
      ans*=x;
    }
    return ans;
  }

  public static int powerOptimal(int x, int n){
    int ans=1;
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

  public static void main(String[] args) {
    System.out.println(powerOptimal(2,4));
  }
}
