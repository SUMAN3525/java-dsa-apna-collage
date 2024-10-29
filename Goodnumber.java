import java.util.*;
public class Goodnumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
      while(n!=0){
        int t=n%10;
        sum+=t;
        n=n/10;
      }
     if(n%sum==0){
        System.out.println("Good Number");
     }
     else if(n%sum==1){
        System.out.println("Bad Number");
     }
    }
}
