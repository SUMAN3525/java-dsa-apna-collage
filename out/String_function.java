
package out;
import java.util.Scanner;
public class String_function {
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     String s1="Tony";
     String s2="Tony";
     String s3= new String("Tony");
     if(s1==s2){
        System.out.println("True");
     }
     else{
        System.out.print("False");
     }
     if(s1==s3){
        System.out.print("True");
    }
    else{
        System.out.println("False");
    }
    if(s1.equals(s3)){
        System.out.print("true");
    }
else{
    System.out.print("False");
  }
    }
}
