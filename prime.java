import java.util.Scanner;

public class prime {
    public static void call(int n){
        
     for(int i=1; i<=n; i++){
        if(n%i==0){
            System.out.println(" a prime number");
        }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        call(n);
    }
}
