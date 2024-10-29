import java.util.*;
public class profit_loss {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=1+i; j<n; j++){
                if(a[i]>a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
