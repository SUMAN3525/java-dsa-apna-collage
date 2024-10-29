public class divisible {
    public static void calculator (int m, int n){
        int sum=0;
      for(int i=m; i<=n; i++ ){
        if(i%3==0 && i%5==0){
      sum+=i;
      
        }
        
      }
      System.out.print(sum);
    }
    public static void main(String[] args) {
        int m=12;
        int n=50;
       calculator(m, n);
    }
}
