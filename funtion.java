import java.util.Scanner;
public class funtion {
    public static void name() {
        System.out.println("suman rowl");
    }
    public static void calculated(int a, int b){
        System.out.print("Sum the number: "+(a+b));
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculated(a,b);
        name();
        
    }
}
