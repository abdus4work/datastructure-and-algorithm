package DSA_Solution.Gcd;
public class Solution{


  /**
   * Calculates the greatest common divisor (GCD) of two numbers using a brute force approach.
   *
   * @param N1 the first number
   * @param N2 the second number
   * @return the GCD of N1 and N2
   */
  public static int gcdBruteForce(int N1, int N2) {
    int gcd = 1;
    int max = Math.min(N1, N2);
    for (int i = 1; i <= max; i++) {
      if (N1 % i == 0 && N2 % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }

  /**
   * Calculates the greatest common divisor (GCD) of two numbers using an optimized approach.
   *
   * @param n1 the first number
   * @param n2 the second number
   * @return the GCD of n1 and n2
   */
  public static int gcdBetter(int n1, int n2){
    
    int min = Math.min(n1,n2);
    for(int i=min; i>=1; i++){
      if(n1%i==0 && n2%i==0){
        return i;
      }
    }
    return 1;
  }

  /**
   * Calculates the greatest common divisor (GCD) of two numbers using an optimal recursive algorithm.
   *
   * @param n1 the first number
   * @param n2 the second number
   * @return the GCD of n1 and n2
   */
  public static int gcdOptimal(int n1, int n2){
    if(n1==0) return n2;
    if(n2==0) return n1;
    return gcdOptimal(n2, n1%n2);
  }

  public static void main(String[] args) {
    System.out.println(gcdOptimal(40,20));
  }

}