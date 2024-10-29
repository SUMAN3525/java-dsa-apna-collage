import java.util.Scanner;

public class bitwise_set {
    public static void set(int n, int i){
      int bitmask=(1<<i);
      System.out.println(n | bitmask);
      if((n | bitmask)==0){
        System.out.print(0);
      }
      else{
        System.out.print(1);
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        set(n,i);
    }
}
