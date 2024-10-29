import java.util.Scanner;

public class bitwise_odd {
    public static void bit(int n){
        int bitmask=1;
        if((n & bitmask) ==0){
              System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        bit(n);
    }
}
