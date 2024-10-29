import java.util.Scanner;

public class set_matrix_Zero {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int ro;
        int co;
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(a[i][j]==0){
          ro=i;
          co=j;
                    if ( a[ro][j]==0 || a[i][co]==0) {
                        i=ro;
                        j=co;
                        System.out.print(a[i][j]);
                    } else {
                        
                    }
                }
             
            }
            System.out.println();
        }
    }
}
