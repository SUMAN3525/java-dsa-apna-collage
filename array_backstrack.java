public class array_backstrack {
    public static void rec(int a[], int i, int val) {
        if(i==a.length){
            output(a);
            return;
        }
        a[i]=val;
        rec(a,i+1,val+1);
        a[i]=a[i]-2;
    }
    public static void output(int a[]){
        for(int i=0; i<a.length; i++){
          System.out.print(a[i]);
        }
System.out.println();
    }
    public static void main(String []args){
    int a[]=new int[5];
    rec(a,0,1);
    output(a);
    }
}
