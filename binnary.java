public class binnary {
    public static void main(String []args){
        int n=3;
       int bin=0;
       int max;
       for(int i=0; i<2; i++){
       if(n!=0){
        bin=n/2;
        n--;
        System.out.print(bin);
       }
       }
       System.out.println();
    }
}
