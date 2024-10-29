import java.util.Scanner;
public class leetcod_single_number {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int cout=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
         a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]!=a[j]){
             cout++;
             if(cout==n-1){
                System.out.println(a[i]);
             }
            
             //  System.out.println(a[i]);
                }
            }
        }
    }
}
