import java.util.Scanner;

public class functions {
    public static int calculated(int a, int b){  
    int c=a+b;
    return c;
    }
            public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the value a: ");
      int a=sc.nextInt();
      System.out.print("Enter the value b: ");
      int b=sc.nextInt();
      int c=  calculated(a, b);
        System.out.println("sum number"+ c);
    }
}