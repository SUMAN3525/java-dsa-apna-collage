//dout
public class Recuriting{
    public static int call(int n){
       if(n==10){
        return 10;
       }
        call(n+1);
        return n;
       
    }
  public static void main(String[] args) {
    System.out.println(call(0));
  }
}

