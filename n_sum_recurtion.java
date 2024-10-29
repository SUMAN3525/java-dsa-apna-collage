public class n_sum_recurtion {
    public static int sum(int n){
        if(n==1){
         return 1;
        }
        sum(n-1);
     int sum=n+sum(n-1);
     return sum;
    }
    public static void main(String[] args) {
        int n=5;
      //  sum(n);
        System.out.print(sum(n));
    }
}