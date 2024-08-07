package DSA_Solution.Print_All_Prime_Factors;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  //? Brute Force Approach
  public static boolean isPrime(int num){
    if(num <= 1){
      return false;
    }
    for(int i = 2; i <= Math.sqrt(num); i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
  
  public static List<Integer> printAllPrimeFactor(int num){
    List<Integer> list = new ArrayList<>();
    for(int i=2;i<=num;i++){
      if(num%i==0){
        if(isPrime(i)){
          list.add(i);
        }
      }
    }
    return list;
  }

  //? Better Approach
  public static List<Integer> printAllPrimeFactorsBetter(int num){
    List<Integer> list = new ArrayList<>();

    for(int i=2;i<Math.sqrt(num);i++){
      if(num%i==0){
        if(isPrime(i)) list.add(i);
        if(num/i!=i && isPrime(num/i)) list.add(num/i);
      }
    }

    return list;

  }

  public static List<Integer> printAllPrimeFactorsOptimal(int num){
    List<Integer> list = new ArrayList<>();

    for(int i=2;i<Math.sqrt(num);i++){
      if(num%i==0){
        list.add(i);
        while(num%i==0){
          num=num/i;
        }
      }
    }
    if(num!=1) list.add(num);
    return list;
  }

  public static void main(String[] args) {
    System.out.println(printAllPrimeFactorsBetter(60));
  }
  
}
