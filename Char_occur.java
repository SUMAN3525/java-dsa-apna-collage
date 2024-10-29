import java.util.Scanner;

public class Char_occur {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cout=0;
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.length()>=str2.length()){
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    cout++;
                }
            }
        }
        System.out.println(cout);
    }
  
}
}
