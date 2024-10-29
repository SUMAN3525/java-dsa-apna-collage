//dout 39. .
import java.util.*;
public class Combination_sum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a[]=new int[n];
         int target=sc.nextInt();
         for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
         }
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
              sum+=a[i];
              if(sum==target){
                System.out.print(i);
              }
            }
         }
    }
}
