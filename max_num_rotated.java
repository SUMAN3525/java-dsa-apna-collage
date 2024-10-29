//dout
import java.util.*;
public class max_num_rotated {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int max;
        int p=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0 ;i<n; i++){
            for(int j=1; j<n; j++){
                if(a[i]>a[j]){
                    max=a[i];
         System.out.println(a[i]);
           p=0;
                }
            }
        }
           // for( i=max; i<n; i++){
             //   System.out.println(a[i]);
            //}
            //for( i=0; i<max; i++){
              //  System.out.println(a[i]);
            //}
            //}
              //  }
           }
        
       
}


