import java.util.Scanner;
public class funmax {
    public static void sum(int a,int b){
        int s=a+b;
        System.out.println(s);
    }
    public static void substraction(int a,int b){
        int sb=a-b;
        System.out.println(sb);
    }
    public static void multiply(int a,int b){
        int m=a*b;
        System.out.println(m);
    }
    public static void divided(int a,int b){
        float d=a/b;
        System.out.println(d);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
                   sum(a,b);
                    substraction(a,b);
                    multiply(a,b);
                    divided(a,b);
    }  
}