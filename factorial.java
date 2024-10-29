import java.util.Scanner;
public class factorial {
    public static void call(int n,int s){  
        for(int i=1; i<=n; i++){
            s*=i;
        }
        System.out.println(s);
    }
        public static void main(String []args){
           Scanner sc=new Scanner(System.in);
           int s=1;
           int n=sc.nextInt();
           call(n,s);
        }
    }