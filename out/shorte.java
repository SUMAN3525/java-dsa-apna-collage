package out;

public class shorte {
    public static void call(String p) {
        int x=0;
        int y=0;
        
      for(int i=0; i<p.length(); i++){
        char d=p.charAt(i);
          if(d=='S'){
          y--;
          }
          else if(d=='N'){
           y++;
          }
          else if(d=='W'){
            x--;
          }
          else{
            x++;
          }
      }
      int x2=x*x;
      int y2=y*y;
      System.out.println(Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        String p="WNEENESENNN";
        call(p);
    }
}