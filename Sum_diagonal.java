import java.util.*;
public class Sum_diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            a[i][j]=sc.nextInt();
        }
        }
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
        }
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==j){
                sum+=a[i][j];
            }
        }
    }
    System.out.println(sum);
    }
    }
