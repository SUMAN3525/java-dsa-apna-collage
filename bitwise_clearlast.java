public class bitwise_clearlast {
    public static int call(int n, int i){
        int bitmask=(~0)<<i;
            return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.print(call(15,2));
    }
}
