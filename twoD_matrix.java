import java.util.*;
public class twoD_matrix {
    public static void call(int a[][], int n,  int m, int k){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               if(a[i][j]==k){
                System.out.println("yes");
               }
            }
          }
    }
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int k=sc.nextInt();
     int m=sc.nextInt();
     int n=sc.nextInt();
     int a[][]=new int[n][m];
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            a[i][j]=sc.nextInt();
        }
      }
    }
  
}

