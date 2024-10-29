public class char_at {

    public static void call(String a){
        for(int i=0; i<a.length(); i++){
         System.out.print(a.charAt(i));
        }
    }
    public static void main(String[] args) {
        String a="Suman rowl";
        call(a);
    }
}