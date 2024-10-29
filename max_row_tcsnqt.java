import java.util.*;
public class max_row_tcsnqt {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                System.out.print(i+","+j);
            }
           // System.out.println();
        }
    }
}
