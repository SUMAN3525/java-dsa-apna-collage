public class power_recurtion {
    public static int ispower(int x, int n){
        if(n==0){
            return 1;
        }
       int x1= ispower(x,n-1);
        int xn=x*x1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(ispower(2,10));
    }
}
