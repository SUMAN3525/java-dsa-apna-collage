//dout
public class soting_recution {
    public static boolean issort(int arr[], int i){
        if(i==arr.length-1){
         return true;
        }
        if(arr[i]>arr[i+1]){
         return false;
        
        }
        return  issort(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        System.out.println(issort(arr, i));
    }
}
