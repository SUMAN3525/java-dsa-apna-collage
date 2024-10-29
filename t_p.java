import java.util.*;
public class t_p {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int time=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]<k){
                
               // a[i]=a[i]+1;
              //  time ++;
                System.out.println(k-a[i]);
      
        }
       // System.out.println(marks);
    }
    }
}
