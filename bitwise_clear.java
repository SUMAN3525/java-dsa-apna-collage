import java.util.Scanner;
public class bitwise_clear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int bitmask=~(1<<i);
        System.out.print((n & bitmask));
    }
}
