import java.util.*;
public class palidrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                System.out.println(str.charAt(i));
            }
        }
    }
}
