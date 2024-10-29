// dout
public class bitwise_update {
    public static void clearbit(int n, int i){
        int bitmask=~(1<<i);
    }
    public static void set(int n, int i){
        int bitmask=(1<<i);
        System.out.println(n | bitmask);
        if((n | bitmask)==0){
          System.out.print(0);
        }
        else{
          System.out.print(1);
        }
      }
    public static void updatebit(int n, int i, int newbit){
        if(newbit==0){
           
        } else{
            //return set(n,i);
        }
    }


}
