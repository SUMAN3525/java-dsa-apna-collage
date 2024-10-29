import java.util.Scanner;

public class bitwise_get {
    public static void bit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
          System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        bit(n,i);
    }
}
