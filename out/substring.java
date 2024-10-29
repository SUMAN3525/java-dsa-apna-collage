package out;

public class substring {
    public static void call(String a, int st , int lt){
        for(int i=st; i<lt; i++){
            System.out.println(a.charAt(i));
        }
    }
    public static void main(String[] args) {
        String a="helloworld";
        call(a,0,5);
    }
}
