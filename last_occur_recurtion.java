//dout
public class last_occur_recurtion {
    public static int lastocc(int a[], int i, int key ){
        if(a[i]==a.length-1){
            return -1;
        }
        int isfound= lastocc( a, i+1,key );
        if(a[i]==-1  && a[i]==key){
            return i;
    }
        return isfound;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,5,5,2};
        int i=0;
        int key=2;
        System.out.println(  lastocc( a, 0,key ));
    }
}