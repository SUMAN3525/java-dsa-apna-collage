import java.util.Scanner;
public class position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int target=sc.nextInt();
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]==target){
                System.out.print(i);
            }
        }
    }
}
