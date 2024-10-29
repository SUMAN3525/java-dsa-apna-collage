public class palindrome{
    public static void call(String a){
   for(int i=0; i<a.length()/2; i++){
    int n=a.length();
    if(a.charAt(i)==a.charAt(n-1-i)){
       System.out.println(1);
    }
    else{

    }
   }
    }
    public static void main(String[] args) {
       // Scanner sc= new Scanner(System.in);
        //String a=sc.nextLine();
        String a="racecar";
        call(a);
    }
}