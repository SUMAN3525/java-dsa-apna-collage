import java.util.Scanner;
public class string {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char str[]={'a','b','c','d'};
        String arr[]=new String[2];
        String x=sc.nextLine();
        System.out.println(x);
        int p=x.length();
        System.out.println(p);
        String firstname="Suman";
        String lastname="Rowl";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
    }
}
