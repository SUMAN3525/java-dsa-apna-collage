import java.util.Scanner;
public class bionomial {
    public static void bio(int n, int r,int nu, int dr, int dm){
        for(int i=1; i<=n; i++){
            nu*=i;
        }
        for(int i=1; i<=r; i++){
            dr*=i;
        }
        for(int i=1; i<=n-r; i++){
            dm*=i;
        }
        System.out.print(nu/(dr*dm));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nu=1;
        int dr=1;
        int dm=1;
        if(n>r){
            bio(n,r,nu,dr,dm);
        }
        else{
            System.out.println("Failed");
        }
    }
}
