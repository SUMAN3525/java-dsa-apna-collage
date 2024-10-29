public class fibonacci_recution {
    public static int fun(int n){
        if(n==1 || n==0){
            return n;
        }
      int fu2= fun(n-1);
      int fu1= fun(n-2);
     int  fun=fu1+fu2;
       return fun;
    }
    public static void main(String[] args) {
        int n=25;
        fun(n);
        System.out.println(fun(n));
    }
}