public class grav_code {
    public static void main(String []args){
        int a[]={0,1,3,2};
        int bin=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<2; j++){
            bin=a[i]/2;
            a[i]--;
            System.out.print(bin+" ");
            }
            //System.out.print(bin);
        }
    }
}
