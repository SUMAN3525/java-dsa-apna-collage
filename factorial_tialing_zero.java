import java.util.Scanner;

public class factorial_tialing_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin=0;  
        int n=sc.nextInt();
        int fac=1;
        for(int i=1; i<=n; i++){
            fac*=i;
        }
      while(fac!=0){
        bin=fac/10;
        fac=fac/10;
        System.out.print(bin);
      }
    }
}
