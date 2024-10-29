public class First_ocuur_recution {
    public static int firstocc(int a[],int key , int i){
       if(a[i]==key){
        return i;
       }
      
       return  firstocc(a,key,i+1);
    }
    public static void main(String[] args) {
        int key=5;
        int i=0;
        int a[]={8,5,6,5};
          System.out.println( firstocc(a,key,0));
    }
}
