public class friends_recurtion {
    public static int isnumber(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=isnumber(n-1);
        int fnm2=isnumber(n-2);
        int pair=(n-1)*fnm2;
        int totways=fnm1+pair;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(isnumber(3));
    }
}
