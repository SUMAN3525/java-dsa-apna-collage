import java.util.Scanner;

public class excution {
    public static void main(String []args){
        int allsum=0;
        int sixmul=0;
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
       for(int i=1; i<=n; i++){
        if(i%m==0){
            allsum+=i;
            
        }
        else{
            sixmul+=i;
        }
       }
       System.out.println(allsum);
       System.out.println(sixmul);
       System.out.println(allsum-sixmul);
    }
}
