        import java.util.*;
        public class ROTATED {
        public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int d=sc.nextInt();
        for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
        }
        System.out.print("output: ");
        if(d<=n){
        for(int i=d; i<n; i++){
        System.out.print(a[i]);
        }
        for(int i=0; i<d; i++){
        System.out.print(a[i]);
        }
        }
        else{
        System.out.println("failed");
        }
        }
        }