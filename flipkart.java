import java.util.Scanner;
public class flipkart {
    public static void main(String []args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
             }
             for(int i=0; i<n; i++){
              sum+=a[i];
             }
             System.out.print(sum/k);
    }
}
