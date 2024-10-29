public class tilling_recurtion {
    public static int tillig(int n){
        if(n==0 || n==1){
            return 1;
        }
        int f1=tillig(n-1);//vertical
        int f2=tillig(n-2);//horizontal
        int f12=tillig(n-1)+tillig(n-2);
       return f12;
        //return f2;
    }
    public static void main(String[] args) {
       System.out.println( tillig(4));
    }
}
