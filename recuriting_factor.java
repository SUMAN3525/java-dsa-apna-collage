public class recuriting_factor {
    public static int factorial(int n){
      if(n==0){
        return 1;
      }
      factorial(n-1);
      int fac=n*factorial(n-1);
      return fac;
    }
    public static void main(String[] args) {
      int n=3;
      System.out.println(factorial(n));
    }
}