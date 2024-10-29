public class power_ocupy_recurtion {
    public static int powocc(int x, int n){
        if(n==0){
            return 1;
        }
        int x1= powocc(x,n/2);
        int xn=x* x1;
        int yn=x*x1;
        int xy=xn*yn;
        return xy;
    }
    public static void main(String[] args) {
        System.out.println(powocc(2, 10));
    }
}
