public class practice_fs_recursion {
    public static void isinclude(int a[], int i,int key ){
        if(i==a.length){
            return ;
        }
        if( a[i]==key ){
            System.out.println(i);
            }
         isinclude(a, i+1, key);
       
    }
    public static void main(String[] args) {
        int a[]={3,2,4,5,6,2,7,2,2};
        int i=0;
        int key =2;
        isinclude(a, i+1, key);
    }
}